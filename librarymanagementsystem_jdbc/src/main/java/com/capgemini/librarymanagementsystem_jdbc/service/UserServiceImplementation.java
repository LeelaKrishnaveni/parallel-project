package com.capgemini.librarymanagementsystem_jdbc.service;

import java.util.List;

import com.capgemini.librarymanagementsystem_jdbc.dao.UserDAO;
import com.capgemini.librarymanagementsystem_jdbc.dto.BooksBorrowedDetails;
import com.capgemini.librarymanagementsystem_jdbc.factory.LibraryFactory;

public class UserServiceImplementation implements UserService{

	private UserDAO dao=LibraryFactory.getStudentDAO();
	@Override
	public boolean request(int uId, int bId) {
		return dao.request(uId, bId);
	}

	@Override
	public boolean returnBook(int bId, int uId, String status) {
		return dao.returnBook(bId, uId, status);
	}

	@Override
	public List<BooksBorrowedDetails> borrowedBook(int uId) {
		return dao.borrowedBook(uId);
	}

}
