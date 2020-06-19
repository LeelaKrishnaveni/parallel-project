package com.capgemini.librarymanagementsystem_collections.service;

import java.util.List;

import com.capgemini.librarymanagementsystem_collections.dto.AdminDetails;
import com.capgemini.librarymanagementsystem_collections.dto.BookDetails;
import com.capgemini.librarymanagementsystem_collections.dto.RequestDetails;
import com.capgemini.librarymanagementsystem_collections.dto.UserDetails;

public interface AdminService {

	boolean registerAdmin(AdminDetails admin);
	AdminDetails loginAdmin(String email,String password);
	boolean addBook(BookDetails book);
	boolean removeBook(int id);
	List<BookDetails> searchBookByTitle(String bookName);
	List<BookDetails> searchBookByAuthor(String author);
	List<BookDetails> searchBookByCategory(String category);
	List<BookDetails> getBooksInfo();

	List<UserDetails> showUsers();
	List<RequestDetails> showRequests();
	boolean bookIssue(UserDetails user,BookDetails book);
	boolean isBookReceived(UserDetails user,BookDetails book);

}//End of AdminService Interface
