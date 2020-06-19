package com.capgemini.librarymanagementsystem_collections.service;

import java.util.List;

import com.capgemini.librarymanagementsystem_collections.dto.BookDetails;
import com.capgemini.librarymanagementsystem_collections.dto.RequestDetails;
import com.capgemini.librarymanagementsystem_collections.dto.UserDetails;

public interface UserService {

	boolean registerUser(UserDetails user);
	UserDetails loginUser(String email,String password);
	public RequestDetails bookRequest(UserDetails user, BookDetails book);
	public RequestDetails bookReturn(UserDetails user, BookDetails book);
	
	List<BookDetails> searchBookByTitle(String bookName);
	List<BookDetails> searchBookByAuthor(String author);
	List<BookDetails> searchBookByCategory(String category);
	List<BookDetails> getBooksInfo();

}//End of UserService Interface
