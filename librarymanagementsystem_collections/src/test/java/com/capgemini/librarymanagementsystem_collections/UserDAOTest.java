package com.capgemini.librarymanagementsystem_collections;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.librarymanagementsystem_collections.dao.UserDAO;
import com.capgemini.librarymanagementsystem_collections.dao.UserDAOImplementation;
import com.capgemini.librarymanagementsystem_collections.dto.BookDetails;
import com.capgemini.librarymanagementsystem_collections.dto.RequestDetails;
import com.capgemini.librarymanagementsystem_collections.dto.UserDetails;

public class UserDAOTest {

private UserDAO dao=new UserDAOImplementation();
	

	@Test
	public void testRegisterStudentValid() {
		UserDetails info=new UserDetails();
		info.setId(78965);
		info.setName("ammulu");
		info.setEmail("ammulu@gmail.com");
		info.setPassword("Ammulu@123");
		info.setDepartment("ECE");
		info.setPhone(987582645);
		boolean status=dao.registerUser(info);
		Assertions.assertTrue(status);
	}

	@Test
	public void testRegisterStudentInvalid() {
		UserDetails info=new UserDetails();
		info.setId(78965);
		info.setName("ammulu");
		info.setEmail("ammulu@gmail.com");
		info.setPassword("Ammulu@123");
		info.setDepartment("ECE");
		info.setPhone(987582645);
		boolean status=dao.registerUser(info);
		Assertions.assertFalse(status);
	}
	@Test
	public void testLoginUserValid() {
		UserDetails status = dao.loginUser("krish@gmail.com", "Krish@123");
		Assertions.assertNotNull(status);
	}

	@Test
	public void testLoginUserInvalid() {
		UserDetails status = dao.loginUser("krish@gmail.com", "Krish123");
		Assertions.assertNull(status);
	}

	@Test
	public void testRequestBookValid() {

		UserDetails user = new UserDetails();
		user.setId(222222);
		BookDetails book = new BookDetails();
		book.setId(100002);
		RequestDetails info = dao.bookRequest(user, book);
		Assertions.assertNotNull(info);

	}

	@Test
	public void testRequestBookInvalid() {

		UserDetails user = new UserDetails();
		user.setId(222222);
		BookDetails book = new BookDetails();
		book.setId(100002);
		RequestDetails info = dao.bookRequest(user, book);
		Assertions.assertNull(info);

	}

	@Test
	public void testBookReturnValid() {
		UserDetails user = new UserDetails();
		user.setId(222222);
		BookDetails book = new BookDetails();
		book.setId(100002);
		RequestDetails info = dao.bookReturn(user, book);
		Assertions.assertNotNull(info);

	}

	@Test
	public void testBookReturnInvalid() {
		UserDetails user = new UserDetails();
		user.setId(222222);
		BookDetails book = new BookDetails();
		book.setId(100002);
		RequestDetails info = dao.bookReturn(user, book);
		Assertions.assertNull(info);

	}
	@Test
	public void testSearchBookByTitleValid() {
		List<BookDetails> info = dao.searchBookByTitle("javajdbc");
		Assertions.assertNotNull(info);
	}

	@Test
	public void testSearchBookByTitleInvalid() {
		List<BookDetails> info = dao.searchBookByTitle("RkNarayan");
		Assertions.assertNotNull(info);
	}
	@Test
	public void testSearchBookByAuthorValid() {
		List<BookDetails> info = dao.searchBookByAuthor("rknarayan");
		Assertions.assertNotNull(info);
	}

	@Test
	public void testSearchBookByAuthorInvalid() {
		List<BookDetails> info = dao.searchBookByAuthor("rknarayan");
		Assertions.assertNotNull(info);
	}

	@Test
	public void testSearchBookByCategoryValid() {
		List<BookDetails> info = dao.searchBookByCategory("aptitude");
		Assertions.assertNotNull(info);
	}

	@Test
	public void testSearchBookByCategoryInvalid() {
		List<BookDetails> info = dao.searchBookByCategory("aptitude");
		Assertions.assertNotNull(info);
	}
	@Test
	public void testGetBookInfoValid() {
		List<BookDetails> info = dao.getBooksInfo();
		Assertions.assertNotNull(info);
	}

	@Test
	public void testGetBookInfoInvalid() {
		List<BookDetails> info = dao.getBooksInfo();
		Assertions.assertNotNull(info);
	}

}
