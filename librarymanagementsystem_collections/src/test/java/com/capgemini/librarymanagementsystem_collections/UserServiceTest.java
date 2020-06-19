package com.capgemini.librarymanagementsystem_collections;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.librarymanagementsystem_collections.dto.BookDetails;
import com.capgemini.librarymanagementsystem_collections.dto.RequestDetails;
import com.capgemini.librarymanagementsystem_collections.dto.UserDetails;
import com.capgemini.librarymanagementsystem_collections.service.UserService;
import com.capgemini.librarymanagementsystem_collections.service.UserServiceImplementation;

public class UserServiceTest {

private UserService service=new UserServiceImplementation();
	

	@Test
	public void testRegisterStudentValid() {
		UserDetails info=new UserDetails();
		info.setId(78965);
		info.setName("ammulu");
		info.setEmail("ammulu@gmail.com");
		info.setPassword("Ammulu@123");
		info.setDepartment("ECE");
		info.setPhone(987582645);
		boolean status=service.registerUser(info);
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
		boolean status=service.registerUser(info);
		Assertions.assertFalse(status);
	}
	@Test
	public void testLoginUserValid() {
		UserDetails status = service.loginUser("ammulu@gmail.com", "Ammulu@123");
		Assertions.assertNotNull(status);
	}

	@Test
	public void testLoginUserInvalid() {
		UserDetails status = service.loginUser("ammulu@gmail.com", "Ammulu123");
		Assertions.assertNull(status);
	}

	@Test
	public void testRequestBookValid() {

		UserDetails user = new UserDetails();
		user.setId(222222);
		BookDetails book = new BookDetails();
		book.setId(100002);
		RequestDetails info = service.bookRequest(user, book);
		Assertions.assertNotNull(info);

	}

	@Test
	public void testRequestBookInvalid() {

		UserDetails user = new UserDetails();
		user.setId(222222);
		BookDetails book = new BookDetails();
		book.setId(100002);
		RequestDetails info = service.bookRequest(user, book);
		Assertions.assertNull(info);

	}

	@Test
	public void testBookReturnValid() {
		UserDetails user = new UserDetails();
		user.setId(222222);
		BookDetails book = new BookDetails();
		book.setId(100002);
		RequestDetails info = service.bookReturn(user, book);
		Assertions.assertNotNull(info);

	}

	@Test
	public void testBookReturnInvalid() {
		UserDetails user = new UserDetails();
		user.setId(222222);
		BookDetails book = new BookDetails();
		book.setId(100002);
		RequestDetails info = service.bookReturn(user, book);
		Assertions.assertNull(info);

	}
	@Test
	public void testSearchBookByTitleValid() {
		List<BookDetails> info = service.searchBookByTitle("javajdbc");
		Assertions.assertNotNull(info);
	}

	@Test
	public void testSearchBookByTitleInvalid() {
		List<BookDetails> info = service.searchBookByTitle("RkNarayan");
		Assertions.assertNotNull(info);
	}
	@Test
	public void testSearchBookByAuthorValid() {
		List<BookDetails> info = service.searchBookByAuthor("rknarayan");
		Assertions.assertNotNull(info);
	}

	@Test
	public void testSearchBookByAuthorInvalid() {
		List<BookDetails> info = service.searchBookByAuthor("rknarayan");
		Assertions.assertNotNull(info);
	}

	@Test
	public void testSearchBookByCategoryValid() {
		List<BookDetails> info = service.searchBookByCategory("aptitude");
		Assertions.assertNotNull(info);
	}

	@Test
	public void testSearchBookByCategoryInvalid() {
		List<BookDetails> info = service.searchBookByCategory("aptitude");
		Assertions.assertNotNull(info);
	}
	@Test
	public void testGetBookInfoValid() {
		List<BookDetails> info = service.getBooksInfo();
		Assertions.assertNotNull(info);
	}

	@Test
	public void testGetBookInfoInvalid() {
		List<BookDetails> info = service.getBooksInfo();
		Assertions.assertNotNull(info);
	}

}
