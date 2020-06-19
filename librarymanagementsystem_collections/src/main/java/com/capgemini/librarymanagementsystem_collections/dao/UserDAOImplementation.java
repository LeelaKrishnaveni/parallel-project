package com.capgemini.librarymanagementsystem_collections.dao;


import java.util.ArrayList;
import java.util.List;

import com.capgemini.librarymanagementsystem_collections.db.LibraryDB;
import com.capgemini.librarymanagementsystem_collections.dto.BookDetails;
import com.capgemini.librarymanagementsystem_collections.dto.RequestDetails;
import com.capgemini.librarymanagementsystem_collections.dto.UserDetails;
import com.capgemini.librarymanagementsystem_collections.exception.LibraryManagementSystemException;

public class UserDAOImplementation implements UserDAO{

	public boolean registerUser(UserDetails user) {

		for(UserDetails u : LibraryDB.USER) {
			if(u.getEmail().equals(user.getEmail())) {
				return false;
			}
		}
		LibraryDB.USER.add(user);
		return true;
	}//End of registerUser Method

	public UserDetails loginUser(String email, String password) {

		for(UserDetails user : LibraryDB.USER) {
			if(user.getEmail().equals(email) ) {
				if(user.getPassword().equals(password)) {
					return user;
				}else {
					throw new LibraryManagementSystemException("Password is invalid");
				}

			}else {
				throw new LibraryManagementSystemException("Email doesn't Exist");
			}
		}
		throw new LibraryManagementSystemException("Invalid credentials");

	}//End of loginUser Method

	public RequestDetails bookRequest(UserDetails user, BookDetails book) {

		boolean flag = false; 
		boolean	isRequestExists = false;
		RequestDetails requestInfo = new RequestDetails();
		UserDetails userInfo2 = new UserDetails();
		BookDetails bookInfo2 = new BookDetails();

		for (RequestDetails requestInfo2 : LibraryDB.REQUEST) {
			if (book.getId() == requestInfo2.getBookInfo().getId()) {
				isRequestExists = true;

			}
		}

		if (!isRequestExists) {
			for (UserDetails userBean : LibraryDB.USER) {
				if (user.getId() == userBean.getId()) {
					for (BookDetails book1 : LibraryDB.BOOKS) {
						if (book1.getId() == book1.getId()) {
							userInfo2 = userBean;
							bookInfo2 = book1;
							flag = true;
						}
					}
				}
			}
			if (flag == true) {
				requestInfo.setBookInfo(bookInfo2);
				requestInfo.setUserInfo(userInfo2);;
				LibraryDB.REQUEST.add(requestInfo);
				return requestInfo;
			}

		}

		throw new LibraryManagementSystemException("Invalid request or you cannot request that book");

	}//End of RequestBook Method

	public RequestDetails bookReturn(UserDetails user, BookDetails book) {

		for (RequestDetails requestInfo : LibraryDB.REQUEST) {

			if (requestInfo.getBookInfo().getId() == book.getId() &&
					requestInfo.getUserInfo().getId() == user.getId() &&
					requestInfo.isIssued() == true) {


				System.out.println("Returning Issued book only");
				requestInfo.setReturned(true);


				return requestInfo;
			}

		}

		throw new LibraryManagementSystemException("Invalid return ");
	}//End of BookReturn Method



	public List<BookDetails> searchBookByTitle(String bookName) {

		List<BookDetails> searchList=new ArrayList<BookDetails>();
		for(int i=0;i<=LibraryDB.BOOKS.size()-1;i++)
		{
			BookDetails retrievedBook=LibraryDB.BOOKS.get(i);
			String retrievedBookName=retrievedBook.getBookName();
			if(bookName.equals(retrievedBookName))
			{
				searchList.add(retrievedBook);	
				return searchList;
			}
		}
		if(searchList.size()==0)
		{
			throw new LibraryManagementSystemException("Book is not found");
		}
		else
		{
			return searchList;
		}

	}//End of searchBookByTitle method

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
			throw new LibraryManagementSystemException("Book is not found");
		}
		else
		{
			return searchList;
		}	

	}//End of SearchBookByAuthor Method

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

	}//End of searchBookByCategory Method

	public List<BookDetails> getBooksInfo() {
		return LibraryDB.BOOKS;
	}//End of BooksInfo Method

}
