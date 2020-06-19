package com.capgemini.librarymanagementsystem_jdbc.service;

import java.util.List;

import com.capgemini.librarymanagementsystem_jdbc.dto.BooksBorrowedDetails;

public interface UserService {

	boolean request(int uId, int bId);
	boolean returnBook(int bId,int uId,String status);
	List<BooksBorrowedDetails> borrowedBook(int uId);

}
