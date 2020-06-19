package com.capgemini.librarymanagementsystem_jdbc.service;

import java.util.List;

import com.capgemini.librarymanagementsystem_jdbc.dto.BookDetails;
import com.capgemini.librarymanagementsystem_jdbc.dto.UserDetails;

public interface LibrarianUserService {

	List<BookDetails> searchBookById(int bId);
	List<BookDetails> searchBookByTitle(String bookName);
	List<BookDetails> searchBookByAuthor(String authorName);
	List<BookDetails> getBooksInfo();

	boolean register(UserDetails user);
	UserDetails login(String email,String password);
	boolean updatePassword(String email,String password,String newPassword,String role);

	
}
