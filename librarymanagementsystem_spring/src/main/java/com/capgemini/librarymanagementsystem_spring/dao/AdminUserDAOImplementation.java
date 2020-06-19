package com.capgemini.librarymanagementsystem_spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.librarymanagementsystem_spring.dto.BookDetails;
import com.capgemini.librarymanagementsystem_spring.dto.UserDetails;
import com.capgemini.librarymanagementsystem_spring.exception.LMSException;
@Repository
public class AdminUserDAOImplementation implements AdminUserDAO{
	EntityManager manager = null;
	EntityTransaction transaction = null;
	int noOfBooks;
	@PersistenceUnit
	private EntityManagerFactory factory ;
	
	@Override
	public boolean register(UserDetails user) {
		boolean isRegistered = false;
		try{
			
			factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			isRegistered = true;
			return true;
		}catch (Exception e) {
			System.err.println(e.getMessage());
			transaction.rollback();
			//return false;
		}
		return isRegistered;
	}
	
	
	
	@Override
	public UserDetails login(String email, String password) {
		try {
//			manager = factory.createEntityManager();
//			String jpql="select u from UsersBean u where u.email=:email and u.password=:password";
//			TypedQuery<UsersBean> query = manager.createQuery(jpql,UsersBean.class);
//			query.setParameter("email", email);
//			query.setParameter("password", password);
//			UsersBean bean = query.getSingleResult();
//			return bean;
			
			factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();

			String jpql = "select users from UserDetails users ";
			
			TypedQuery<UserDetails> query2 = manager.createQuery(jpql, UserDetails.class);
			List<UserDetails> list = query2.getResultList();

			for (UserDetails users : list) {
				System.out.println(users.getEmail() +" "+email);
				System.out.println(users.getPassword() +" "+password);
				if ((users.getEmail().equals(email)) && (users.getPassword().equals(password))) {
					return users;
				}
			}

			throw new LMSException("Invalid Login Credentials");
//	
			
		}catch(Exception e){
			System.err.println(e.getMessage());
			return null;
		}
	}

	/*
	 * @Override public UserDetails login(String email, String password) { try {
	 * manager = factory.createEntityManager(); String
	 * jpql="select u from UserDetails u where u.email=:email and u.password=:password"
	 * ; TypedQuery<UserDetails> query =
	 * manager.createQuery(jpql,UserDetails.class); query.setParameter("email",
	 * email); query.setParameter("password", password); UserDetails bean =
	 * query.getSingleResult(); return bean; }catch(Exception e){
	 * System.err.println(e.getMessage()); return null; } }
	 */
	@Override
	public BookDetails searchBookById(int bookId) {
		try {
			factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			
			return manager.find(BookDetails.class,bookId);
 
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<BookDetails> searchBookByTitle(String bookName) {
		try {
			factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			String jpql = "select b from BookDetails b where b.bookName=:bookName";
			TypedQuery<BookDetails> query = manager.createQuery(jpql,BookDetails.class);
			query.setParameter("bookName", bookName);
			List<BookDetails> recordList = query.getResultList();
			return recordList; 
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<BookDetails> searchBookByAuthor(String authorName) {
		try {
			factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			String jpql = "select b from BookDetails b where b.authorName=:authorName";
			TypedQuery<BookDetails> query = manager.createQuery(jpql,BookDetails.class);
			query.setParameter("authorName", authorName);
			List<BookDetails> recordList = query.getResultList();
			return recordList; 
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<BookDetails> getBooksInfo() {
		factory = Persistence.createEntityManagerFactory("TestPersistence");
		manager = factory.createEntityManager();
		String jpql = "select b from BookDetails b";
		TypedQuery<BookDetails> query = manager.createQuery(jpql,BookDetails.class);
		List<BookDetails> recordList = query.getResultList();
		
		return recordList;
	}
	
	@Override
	public boolean updatePassword(int id, String password, String newPassword, String role) {
		try {
			factory = Persistence.createEntityManagerFactory("TestPersistence");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String jpql = "select u from UserDetails u where u.userId=:userId and u.role=:role and u.password=:password";
			TypedQuery<UserDetails> query = manager.createQuery(jpql,UserDetails.class);
			query.setParameter("userId", id);
			query.setParameter("role", role);
			query.setParameter("password", password);
			UserDetails rs = query.getSingleResult();
			if(rs != null) {
				UserDetails record = manager.find(UserDetails.class,id);
				record.setPassword(newPassword);
				transaction.commit();
				return true;			
			}else {
				throw new LMSException("User doesnt exist");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
			transaction.rollback();
			return false;
		} 
	}

}
