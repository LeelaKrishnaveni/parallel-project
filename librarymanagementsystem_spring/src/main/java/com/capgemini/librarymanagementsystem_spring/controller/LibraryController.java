package com.capgemini.librarymanagementsystem_spring.controller;

import java.util.List;

import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.librarymanagementsystem_spring.dto.BookBorrowedDetails;
import com.capgemini.librarymanagementsystem_spring.dto.BookDetails;
import com.capgemini.librarymanagementsystem_spring.dto.BookIssueDetails;
import com.capgemini.librarymanagementsystem_spring.dto.RequestDetails;
import com.capgemini.librarymanagementsystem_spring.dto.ResponseDetails;
import com.capgemini.librarymanagementsystem_spring.dto.UserDetails;
import com.capgemini.librarymanagementsystem_spring.service.AdminService;
import com.capgemini.librarymanagementsystem_spring.service.AdminUserService;
import com.capgemini.librarymanagementsystem_spring.service.UserService;

@SuppressWarnings("unused")
@RestController
@PersistenceUnit
@CrossOrigin(origins = "*")
public class LibraryController {

	@Autowired
	private UserService service;
	@Autowired
	private AdminService service1;
	@Autowired
	private AdminUserService service2;

	@PostMapping(path = "/addUser", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })

	public ResponseDetails addUser(@RequestBody UserDetails bean) {
		boolean isAdded = service2.register(bean);
		ResponseDetails response = new ResponseDetails();
		if (isAdded) {
			response.setMessage("record  is inserted");
		} else {
			response.setError(true);
			response.setMessage("unable to add");
		}
		return response;
	}
	
	@PostMapping(path = "/login", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails login(@RequestBody UserDetails user) {
		UserDetails userLogin = service2.login(user.getEmail(), user.getPassword());
		ResponseDetails response = new ResponseDetails();
		if (userLogin != null) {
			response.setUserDetails(userLogin);
			response.setMessage("Login succesfull");
			
		} else {
			response.setError(true);
			response.setMessage("Invalid credentials,Please try again");
		}
		return response;
	}
	
	
	

	/*
	 * @PostMapping(path = "/login", consumes = { MediaType.APPLICATION_JSON_VALUE,
	 * MediaType.APPLICATION_XML_VALUE }, produces = {
	 * MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }) public
	 * ResponseDetails login(@RequestBody UserDetails user) { UserDetails userLogin
	 * = service2.login(user.getEmail(), user.getPassword()); ResponseDetails
	 * response = new ResponseDetails(); if (userLogin != null) {
	 * response.setMessage("Login succesfully"); response.setUserDetails(userLogin);
	 * } else { response.setError(true);
	 * response.setMessage("Invalid credentials,Please try again"); } return
	 * response; }
	 */
	@PostMapping(path = "/addBook", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails addBook(@RequestBody BookDetails bean) {
		boolean isBookAdded = service1.addBook(bean);
		ResponseDetails response = new ResponseDetails();
		if (isBookAdded) {
			response.setMessage("Book added succesfully");
		} else {
			response.setError(true);
			response.setMessage("Book cannot be added");
		}
		return response;

	}

	@PutMapping(path = "/bookUpdate", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails updateBook(@RequestBody BookDetails bean) {
		boolean isBookUpdated = service1.updateBook(bean);
		ResponseDetails response = new ResponseDetails();
		if (isBookUpdated) {
			response.setMessage("Book updated succesfully");
		} else {
			response.setError(true);
			response.setMessage("Book cannot be updated");
		}
		return response;

	}

	@DeleteMapping(path = "/removeBook/{bookId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails deleteBook(@PathVariable("bookId") int bookId) {
		boolean isBookDeleted = service1.removeBook(bookId);
		ResponseDetails response = new ResponseDetails();
		if (isBookDeleted) {
			response.setMessage("Book deleted succesfully");
		} else {
			response.setError(true);
			response.setMessage("Book not deleted");
		}
		return response;
	}

	@GetMapping(path = "/BooksInfo", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails getBookInfo() {
		List<BookDetails> getInfo = service2.getBooksInfo();
		ResponseDetails response = new ResponseDetails();
		if (getInfo != null && !getInfo.isEmpty()) {
			response.setMessage("Books found");
			response.setBookDetails1(getInfo);
		} else {
			response.setError(true);
			response.setMessage("They are no books in the Library");
		}
		return response;
	}

	@GetMapping(path = "/BooksByName/{bookName}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails getBookByName(@PathVariable("bookName") String bookName) {
		List<BookDetails> bean = service2.searchBookByTitle(bookName);
		ResponseDetails response = new ResponseDetails();
		if (bean != null && !bean.isEmpty()) {
			response.setMessage("Books found");
			response.setBookDetails1(bean);
		} else {
			response.setError(true);
			response.setMessage("They are no books in the Library");
		}
		return response;
	}

	@GetMapping(path = "/BooksByAuthor", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails getBookByAuthor(String authorName) {
		List<BookDetails> bean = service2.searchBookByAuthor(authorName);
		ResponseDetails response = new ResponseDetails();
		if (bean != null && !bean.isEmpty()) {
			response.setMessage("Books found");
			response.setBookDetails1(bean);
		} else {
			response.setError(true);
			response.setMessage("They are no books in the Library");
		}
		return response;
	}

	@GetMapping(path = "/BooksById/{bookId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails getBookById(@PathVariable("bookId") String bookId) {
		BookDetails bean = service2.searchBookById(Integer.parseInt(bookId));
		ResponseDetails response = new ResponseDetails();
		if (bean != null) {
			response.setMessage("Books found");
			response.setBookDetails(bean);
		} else {
			response.setError(true);
			response.setMessage("They are no books in the Library");
		}
		return response;
	}

	@PostMapping(path = "/issueBook", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails issueBook(@RequestBody BookIssueDetails bean) {
		boolean isIssued = service1.issueBook(bean.getBookId(), bean.getUserId());

		ResponseDetails response = new ResponseDetails();
		if (isIssued) {
			response.setMessage("Book is Issued");
		} else {
			response.setError(true);
			response.setMessage("Book is not Issued");
		}
		return response;
	}

	@PostMapping(path = "/returnBook", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails returnBook(@RequestBody BookIssueDetails bean) {
		boolean isBookReturned = service.returnBook(bean.getBookId(),bean.getUserId());
		ResponseDetails response = new ResponseDetails();
		if (isBookReturned) {
			response.setMessage("Book returned succesfully");
		} else {
			response.setError(true);
			response.setMessage("Book cannot be returned");
		}
		return response;
	}

	@PostMapping(path = "/rejectRequest", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails rejectBook(int userId, int bookId) {
		boolean isRejected = service.request(userId, bookId);

		ResponseDetails response = new ResponseDetails();
		if (isRejected) {
			response.setMessage("Reject the request");
		} else {
			response.setError(true);
			response.setMessage("Request not Rejected");
		}
		return response;
	}
	

	@PostMapping(path = "/requestBook", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails requestBook(@RequestBody RequestDetails requestDetails) {
		boolean isRequested = service.request(requestDetails.getuserId(), requestDetails.getBookId());
		//System.out.println(userId+" details "+requestDetails.getBookId());
		ResponseDetails response = new ResponseDetails();
		if (isRequested) {
			response.setMessage("Request Placed");
		} else {
			response.setError(true);
			response.setMessage("Request not placed");
		}
		return response;
	}
	@GetMapping(path = "/showRequests", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails showRequests() {
		List<RequestDetails> requestDetails = service1.showRequests();
		ResponseDetails response = new ResponseDetails();

		if (requestDetails != null && !requestDetails.isEmpty()) {
			response.setRequestDetails1(requestDetails);
		} else {
			response.setError(true);
			response.setMessage("There are no requests");
		}
		return response;
	}
	@GetMapping(path = "/showIssuedBooks", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails showIssuedBooks() {
		List<BookIssueDetails> issueList = service1.showIssuedBooks();
		ResponseDetails response = new ResponseDetails();

		if (issueList != null && !issueList.isEmpty()) {
			response.setBookIssueDetails1(issueList);
		} else {
			response.setError(true);
			response.setMessage("No Books are Issued");
		}
		return response;
	}

	@GetMapping(path = "/showUsers", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails showUsers() {
		List<UserDetails> usersList = service1.showUsers();
		ResponseDetails response = new ResponseDetails();

		if (usersList != null && !usersList.isEmpty()) {
			response.setUserDetails1(usersList);
		} else {
			response.setError(true);
			response.setMessage("They are no Users");
		}
		return response;
	}

	@PutMapping(path = "/updatePassword", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails updatePassord(int id, String password, String newPassword, String role) {
		boolean isUpdated = service2.updatePassword(id, password, newPassword, role);
		ResponseDetails response = new ResponseDetails();

		if (isUpdated) {
			response.setMessage("Password updated successfully");
		} else {
			response.setError(true);
			response.setMessage("Password is not updated");
		}
		return response;
	}

	@PostMapping(path = "/getBorrowedBooks", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDetails getBorrowedBooks(@RequestBody BookBorrowedDetails bean) {
		List<BookBorrowedDetails> borrowed = service.borrowedBook(bean.getuserId());
		ResponseDetails response = new ResponseDetails();

		if (borrowed != null && !borrowed.isEmpty()) {
			response.setBookBorrowedDetails1(borrowed);
		} else {
			response.setError(true);
			response.setMessage("There are no borrowed  books");
		}
		return response;
	}

}