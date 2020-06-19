package com.capgemini.librarymanagementsystem_jdbc;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



import com.capgemini.librarymanagementsystem_jdbc.dao.UserDAO;
import com.capgemini.librarymanagementsystem_jdbc.dao.UserDAOImplementation;
import com.capgemini.librarymanagementsystem_jdbc.dto.BooksBorrowedDetails;

public class UserDAOTest {
	private UserDAO dao = new UserDAOImplementation();
	@Test
	public void testRequestValid() {
		boolean check = dao.request(100002, 105);
		Assertions.assertTrue(check);		
	}
	
	@Test
	public void testRequestInvalid() {
		boolean check = dao.request(100002, 109);
		Assertions.assertFalse(check);		
	}
	
	@Test
	public void testBorrowedBooksValid() {
		List<BooksBorrowedDetails> info = dao.borrowedBook(100002);
		Assertions.assertNotNull(info);
		Assertions.assertEquals(1, info.size());
	}
	
	@Test
	public void testBorrowedBooksInvalid() {
		List<BooksBorrowedDetails> info = dao.borrowedBook(100002);
		Assertions.assertNotNull(info);
		Assertions.assertNotEquals(6, info.size());
	}
	
	@Test
	public void testReturnBookValid() {
		boolean check = dao.returnBook(105, 100002, "yes");
		Assertions.assertTrue(check);
	}
	
	@Test
	public void testReturnBookInvalid() {
		boolean check = dao.returnBook(105, 100002, "yes");
		Assertions.assertFalse(check);
	}

}
