package com.capgemini.librarymanagementsystem_jdbc.service;

import java.util.List;

import com.capgemini.librarymanagementsystem_jdbc.dao.AdminUserDAO;
import com.capgemini.librarymanagementsystem_jdbc.dto.BookDetails;
import com.capgemini.librarymanagementsystem_jdbc.dto.UserDetails;
import com.capgemini.librarymanagementsystem_jdbc.factory.LibraryFactory;

public class LibrarianUserServiceImplementation implements LibrarianUserService{

	private AdminUserDAO dao=LibraryFactory.getLibrarianStudentDAO();
	@Override
	public List<BookDetails> searchBookById(int bId) {
		return dao.searchBookById(bId);
	}

	@Override
	public List<BookDetails> searchBookByTitle(String bookName) {
		return dao.searchBookByTitle(bookName);
	}

	@Override
	public List<BookDetails> searchBookByAuthor(String authorName) {
		return dao.searchBookByAuthor(authorName);
	}

	@Override
	public List<BookDetails> getBooksInfo() {
		return dao.getBooksInfo();
	}

	@Override
	public boolean register(UserDetails user) {
		return dao.register(user);
	}

	@Override
	public UserDetails login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public boolean updatePassword(String email, String password, String newPassword, String role) {
		return dao.updatePassword(email, password, newPassword, role);
	}

}
