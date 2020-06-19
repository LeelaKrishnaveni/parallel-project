package com.capgemini.librarymanagementsystem_jdbc.service;

import java.util.List;

import com.capgemini.librarymanagementsystem_jdbc.dao.AdminDAO;
import com.capgemini.librarymanagementsystem_jdbc.dto.BookDetails;
import com.capgemini.librarymanagementsystem_jdbc.dto.BookIssueDetails;
import com.capgemini.librarymanagementsystem_jdbc.dto.RequestDetails;
import com.capgemini.librarymanagementsystem_jdbc.dto.UserDetails;
import com.capgemini.librarymanagementsystem_jdbc.factory.LibraryFactory;

public class AdminServiceImplementation implements AdminService{

	private AdminDAO dao=LibraryFactory.getLibrarianDAO();
	@Override
	public List<BookIssueDetails> bookHistoryDetails(int uId) {
		return dao.bookHistoryDetails(uId);
	}

	@Override
	public List<RequestDetails> showRequests() {
		return dao.showRequests();
	}

	@Override
	public List<BookIssueDetails> showIssuedBooks() {
		return dao.showIssuedBooks();
	}

	@Override
	public List<UserDetails> showUsers() {
		return dao.showUsers();
	}

	@Override
	public boolean addBook(BookDetails book) {
		return dao.addBook(book);
	}

	@Override
	public boolean removeBook(int bId) {
		return dao.removeBook(bId);
	}

	@Override
	public boolean updateBook(BookDetails book) {
		return dao.updateBook(book);
	}

	@Override
	public boolean issueBook(int bId, int uId) {
		return dao.issueBook(bId, uId);
	}

}
