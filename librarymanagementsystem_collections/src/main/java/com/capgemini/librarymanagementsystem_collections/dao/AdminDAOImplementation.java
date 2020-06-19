package com.capgemini.librarymanagementsystem_collections.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.librarymanagementsystem_collections.db.LibraryDB;
import com.capgemini.librarymanagementsystem_collections.dto.AdminDetails;
import com.capgemini.librarymanagementsystem_collections.dto.BookDetails;
import com.capgemini.librarymanagementsystem_collections.dto.RequestDetails;
import com.capgemini.librarymanagementsystem_collections.dto.UserDetails;
import com.capgemini.librarymanagementsystem_collections.exception.LibraryManagementSystemException;

public class AdminDAOImplementation implements AdminDAO{

	public boolean registerAdmin(AdminDetails admin) {

		for(AdminDetails ad : LibraryDB.ADMIN) {
			if(ad.getEmail().equals(admin.getEmail())) {
				return false;
			}
		}
		LibraryDB.ADMIN.add(admin);
		return true;

	}//End of registerAdmin Method

	public AdminDetails loginAdmin(String email, String password) {

		for(AdminDetails admin : LibraryDB.ADMIN) {
			if(admin.getEmail().equals(email) ) {
				if(admin.getPassword().equals(password)) {
					return admin;
				}else {
					throw new LibraryManagementSystemException("Password is invalid");
				}

			}else {
				throw new LibraryManagementSystemException("Email doesn't Exist");
			}
		}
		throw new LibraryManagementSystemException("Invalid credentials");


	}//End of loginAdmin Method

	public boolean addBook(BookDetails book) {

		for(BookDetails b : LibraryDB.BOOKS) {
			if(b.getId()==book.getId()) {
				return false;
			}
		}
		LibraryDB.BOOKS.add(book);
		return true;

	}//End of addBook Method

	public boolean removeBook(int id) {

		boolean removeStatus=false;
		for(int i=0;i<=LibraryDB.BOOKS.size()-1;i++)
		{
			BookDetails retrievedBook=LibraryDB.BOOKS.get(i);
			int retrievedId=retrievedBook.getId();
			if(id==retrievedId)
			{
				removeStatus=true;
				LibraryDB.BOOKS.remove(i);
				break;
			}
		}
		return removeStatus;

	}//End of removeBook Method

	public List<BookDetails> searchBookByTitle(String bookName) {

		List<BookDetails> searchList=new ArrayList<BookDetails>();
		for(int i=0;i<=LibraryDB.BOOKS.size()-1;i++)
		{
			BookDetails retrievedBook=LibraryDB.BOOKS.get(i);
			String retrievedBookName=retrievedBook.getBookName();
			if(bookName.equals(retrievedBookName))
			{
				searchList.add(retrievedBook);	
				//return searchList;
			}
		}
		if(searchList.size()==0)
		{
			throw new LibraryManagementSystemException("Book not found");
		}
		else
		{
			return searchList;
		}

	}//End of searchBookByTitle Method

	public List<BookDetails> searchBookByAuthor(String author) {

		List<BookDetails> searchList=new ArrayList<BookDetails>();
		for(int i=0;i<=LibraryDB.BOOKS.size()-1;i++)
		{
			BookDetails retrievedBook=LibraryDB.BOOKS.get(i);
			String retrievedBookAuthor=retrievedBook.getAuthor();
			if(author.equals(retrievedBookAuthor))
			{
				searchList.add(retrievedBook);	
			}
		}
		if(searchList.size()==0)
		{
			throw new LibraryManagementSystemException("Book not found");
		}
		else
		{
			return searchList;
		}		


	}//End of searchBookByAuthor method

	public List<BookDetails> searchBookByCategory(String category) {

		List<BookDetails> searchList=new ArrayList<BookDetails>();
		for(int i=0;i<=LibraryDB.BOOKS.size()-1;i++)
		{
			BookDetails retrievedBook=LibraryDB.BOOKS.get(i);
			String retrievedCategory=retrievedBook.getCategory();
			if(category.equals(retrievedCategory))
			{
				searchList.add(retrievedBook);	
			}
		}
		if(searchList.size()==0)
		{
			throw new LibraryManagementSystemException("Book not found");
		}
		else
		{
			return searchList;
		}
	}//End of searchBookByCategory method

	public List<BookDetails> getBooksInfo() {

		return LibraryDB.BOOKS;
	}//End of BooksInfo method

	public List<UserDetails> showUsers() {

		List<UserDetails> usersList = new ArrayList<UserDetails>();
		for (UserDetails userBean : LibraryDB.USER) {

			userBean.getId();
			userBean.getName();
			userBean.getEmail();
			userBean.getBooksBorrowed();
			usersList.add(userBean);

		}
		return usersList;

	}//End of showUsers Method

	public List<RequestDetails> showRequests() {

		List<RequestDetails> info = new ArrayList<RequestDetails>();
		for (RequestDetails requestInfo : LibraryDB.REQUEST) {
			requestInfo.getBookInfo();
			requestInfo.getUserInfo();
			requestInfo.isIssued();
			requestInfo.isReturned();
			info.add(requestInfo);
		}
		return info;
	}//End of showRequests Method

	public boolean bookIssue(UserDetails user, BookDetails book) {

		boolean isValid = false;

		RequestDetails requestInfo = new RequestDetails();

		int noOfBooksBorrowed = user.getBooksBorrowed();
		for (RequestDetails info : LibraryDB.REQUEST) {
			if (info.getUserInfo().getId() == user.getId()) {
				if (info.getBookInfo().getId() == book.getId()) {
					requestInfo = info;

					isValid = true;

				}
			}
		}

		if (isValid)
		{
			for (BookDetails info2 : LibraryDB.BOOKS) {
				if (info2.getId() == book.getId()) {
					book = info2;
				}
			}

			for (UserDetails userInfo : LibraryDB.USER) {
				if (userInfo.getId() == user.getId()) {
					user = userInfo;
					noOfBooksBorrowed = user.getBooksBorrowed();

				}
			}

			if (noOfBooksBorrowed < 3) {

				boolean isRemoved = LibraryDB.BOOKS.remove(book);
				if (isRemoved) {

					noOfBooksBorrowed++;
					System.out.println(noOfBooksBorrowed);
					user.setBooksBorrowed(noOfBooksBorrowed);
					// DataBase.REQUESTDB.remove(requestInfo);
					requestInfo.setIssued(true);
					return true;
				} else {
					throw new LibraryManagementSystemException("Book can't be borrowed");
				}

			} else {
				throw new LibraryManagementSystemException("Student Exceeds maximum limit");
			}

		} else {
			throw new LibraryManagementSystemException("Book data or Student data is incorrect");
		}

	}//End of BookIssue Method

	public boolean isBookReceived(UserDetails user, BookDetails book) {

		boolean isValid = false;
		RequestDetails requestInfo1 = new RequestDetails();
		for (RequestDetails requestInfo : LibraryDB.REQUEST) {

			if (requestInfo.getBookInfo().getId() == book.getId()
					&& requestInfo.getUserInfo().getId() == user.getId() 
					&& requestInfo.isReturned() == true) {
				isValid = true;
				requestInfo1 = requestInfo;
			}
		}
		if (isValid) {

			book.setAuthor(requestInfo1.getBookInfo().getAuthor());
			book.setBookName(requestInfo1.getBookInfo().getBookName());
			LibraryDB.BOOKS.add(book);
			LibraryDB.REQUEST.remove(requestInfo1);


			for (UserDetails userInfo2 : LibraryDB.USER) {
				if (userInfo2.getId() == user.getId()) {
					user = userInfo2;
				}
			}
			int noOfBooksBorrowed = user.getBooksBorrowed();
			noOfBooksBorrowed--;
			user.setBooksBorrowed(noOfBooksBorrowed);
			return true;
		}
		return false;
	}//End of bookReceived Method

}//End of AdminDAOImplementation Class


