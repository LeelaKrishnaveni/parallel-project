package com.capgemini.librarymanagementsystem_jdbc.service;


import java.util.List;

import com.capgemini.librarymanagementsystem_jdbc.dto.BookDetails;
import com.capgemini.librarymanagementsystem_jdbc.dto.BookIssueDetails;
import com.capgemini.librarymanagementsystem_jdbc.dto.RequestDetails;
import com.capgemini.librarymanagementsystem_jdbc.dto.UserDetails;

public interface AdminService {

	List<BookIssueDetails> bookHistoryDetails(int uId);

	List<RequestDetails> showRequests();

	List<BookIssueDetails> showIssuedBooks();

	List<UserDetails> showUsers();

	boolean addBook(BookDetails book);

	boolean removeBook(int bId);

	boolean updateBook(BookDetails book);

	boolean issueBook(int bId,int uId);

}
