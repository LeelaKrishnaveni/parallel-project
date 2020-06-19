package com.capgemini.librarymanagementsystem_jdbc;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.librarymanagementsystem_jdbc.dao.AdminUserDAO;
import com.capgemini.librarymanagementsystem_jdbc.dao.AdminUserDAOImplementation;
import com.capgemini.librarymanagementsystem_jdbc.dto.BookDetails;

import com.capgemini.librarymanagementsystem_jdbc.dto.UserDetails;

public class LibrarianUserDAOTest {


	private AdminUserDAO dao = new AdminUserDAOImplementation();

	@Test
	public void testRegisterValid() {
		UserDetails bean = new UserDetails();
		bean.setuId(100005);
		bean.setFirstName("krish");
		bean.setLastName("ammu");
		bean.setEmail("krishnavnei@gmail.com");
		bean.setPassword("Krishnaveni@123");
		bean.setRole("student");
		boolean check = dao.register(bean);
		Assertions.assertTrue(check);		
	}

	@Test
	public void testRegisterInvalid() {
		UserDetails bean = new UserDetails();
		bean.setuId(100005);
		bean.setFirstName("krish");
		bean.setLastName("ammu");
		bean.setEmail("krishnavnei@gmail.com");
		bean.setPassword("Krishnavnei@123");
		bean.setRole("student");
		boolean check = dao.register(bean);
		Assertions.assertFalse(check);
	}

	@Test
	public void testLoginValid() {
		UserDetails info = dao.login("ammu@gmail.com", "ammU@123");
		Assertions.assertNotNull(info);
	}

	@Test
	public void testLoginInvalid() {
		UserDetails info = dao.login("ammu@gmail.com", "ammU123");
		Assertions.assertNull(info);
	}

	@Test
	public void testSearchBookByIdValid() {
		List<BookDetails> info = dao.searchBookById(101);
		Assertions.assertNotNull(info);
		Assertions.assertEquals(1, info.size());

	}

	@Test
	public void testSearchBookByIdInvalid() {
		List<BookDetails> info = dao.searchBookById(109);
		Assertions.assertNotNull(info);
		Assertions.assertEquals(0, info.size());		
	}

	@Test
	public void testSearchBookByTitleValid() {
		List<BookDetails> info = dao.searchBookByTitle("MM");
		Assertions.assertNotNull(info);
		Assertions.assertEquals(1, info.size());		
	}

	@Test
	public void testSearchBookByTitleInvalid() {
		List<BookDetails> info = dao.searchBookByTitle("Maths");
		Assertions.assertNotNull(info);
		Assertions.assertEquals(0, info.size());		
	}

	@Test
	public void testSearchBookByAuthorValid() {
		List<BookDetails> info = dao.searchBookByAuthor("sharma");
		Assertions.assertNotNull(info);
		Assertions.assertEquals(1, info.size());		
	}

	@Test
	public void testSearchBookByAuthorInvalid() {
		List<BookDetails> info = dao.searchBookByAuthor("Jain");
		Assertions.assertNotNull(info);
		Assertions.assertEquals(0, info.size());	
	}

	@Test
	public void testBooksInfoValid() {
		List<BookDetails> info = dao.getBooksInfo();
		Assertions.assertNotNull(info);
		Assertions.assertEquals(5, info.size());
	}

	@Test
	public void testBooksInfoInvalid() {
		List<BookDetails> info = dao.getBooksInfo();
		Assertions.assertNotNull(info);
		Assertions.assertNotEquals(6, info.size());
	}

	@Test
	public void testUpdatePasswordValid() {
		boolean check = dao.updatePassword("ammulu@gmail.com", "ammUlu@123", "Admin@123", "admin");
		Assertions.assertTrue(check);
	}

	@Test
	public void testUpdatePasswordInvalid() {
		boolean check = dao.updatePassword("ammulu@gmail.com", "ammUlu@123", "Admin@123", "student");
		Assertions.assertFalse(check);
	}





}
