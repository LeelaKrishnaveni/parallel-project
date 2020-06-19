package com.capgemini.librarymanagementsystem_collections.service;

import java.util.List;

import com.capgemini.librarymanagementsystem_collections.dao.UserDAO;
import com.capgemini.librarymanagementsystem_collections.dto.BookDetails;
import com.capgemini.librarymanagementsystem_collections.dto.RequestDetails;
import com.capgemini.librarymanagementsystem_collections.dto.UserDetails;
import com.capgemini.librarymanagementsystem_collections.factory.LibraryFactory;

public class UserServiceImplementation implements UserService{

	private UserDAO dao = LibraryFactory.getUserDao();

	public boolean registerUser(UserDetails user) {
		return dao.registerUser(user);
	}

	public UserDetails loginUser(String email, String password) {
		return dao.loginUser(email, password);
	}

	public RequestDetails bookRequest(UserDetails user, BookDetails book) {
		return dao.bookRequest(user, book);
	}

	public RequestDetails bookReturn(UserDetails user, BookDetails book) {
		return dao.bookReturn(user, book);
	}

	public List<BookDetails> searchBookByTitle(String bookName) {
		return dao.searchBookByTitle(bookName);
	}

	public List<BookDetails> searchBookByAuthor(String author) {
		return dao.searchBookByAuthor(author);
	}

	public List<BookDetails> searchBookByCategory(String category) {
		return dao.searchBookByCategory(category);
	}

	public List<BookDetails> getBooksInfo() {
		return dao.getBooksInfo();
	}

}//End of UserServiceImplementation Class
