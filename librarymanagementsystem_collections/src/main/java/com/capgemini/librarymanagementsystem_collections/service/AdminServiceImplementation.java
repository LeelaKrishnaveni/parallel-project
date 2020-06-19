package com.capgemini.librarymanagementsystem_collections.service;

import java.util.List;

import com.capgemini.librarymanagementsystem_collections.dao.AdminDAO;
import com.capgemini.librarymanagementsystem_collections.dto.AdminDetails;
import com.capgemini.librarymanagementsystem_collections.dto.BookDetails;
import com.capgemini.librarymanagementsystem_collections.dto.RequestDetails;
import com.capgemini.librarymanagementsystem_collections.dto.UserDetails;
import com.capgemini.librarymanagementsystem_collections.factory.LibraryFactory;

public class AdminServiceImplementation implements  AdminService{

	private AdminDAO dao = LibraryFactory.getAdminDao();
	public boolean registerAdmin(AdminDetails admin) {
		return dao.registerAdmin(admin);
	}

	public AdminDetails loginAdmin(String email, String password) {
		return dao.loginAdmin(email, password);
	}

	public boolean addBook(BookDetails book) {
		return dao.addBook(book);
	}

	public boolean removeBook(int id) {
		return dao.removeBook(id);
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

	public List<UserDetails> showUsers() {
		return dao.showUsers();
	}

	public List<RequestDetails> showRequests() {
		return dao.showRequests();
	}

	public boolean bookIssue(UserDetails user, BookDetails book) {
		return dao.bookIssue(user, book);
	}

	public boolean isBookReceived(UserDetails user, BookDetails book) {
		return dao.isBookReceived(user, book);
	}

}//End of AdminServiceImplementation Class
