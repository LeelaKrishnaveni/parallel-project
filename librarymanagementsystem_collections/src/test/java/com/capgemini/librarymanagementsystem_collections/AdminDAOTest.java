package com.capgemini.librarymanagementsystem_collections;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.librarymanagementsystem_collections.dao.AdminDAO;
import com.capgemini.librarymanagementsystem_collections.dao.AdminDAOImplementation;
import com.capgemini.librarymanagementsystem_collections.dto.AdminDetails;
import com.capgemini.librarymanagementsystem_collections.dto.BookDetails;
import com.capgemini.librarymanagementsystem_collections.dto.RequestDetails;
import com.capgemini.librarymanagementsystem_collections.dto.UserDetails;

public class AdminDAOTest {

private AdminDAO dao=new AdminDAOImplementation();
	
	@Test
	public void testAddBookValid() {
		BookDetails info = new BookDetails();
		info.setId(12345);
		info.setBookName("javacolle");
		info.setAuthor("jamesgosling");
		info.setCategory("java");
		info.setBookName("sunmicrosystems");
		boolean status=dao.addBook(info);
		Assertions.assertTrue(status);
	}
	
	@Test
	public void testAddBookInvalid() {
		BookDetails info = new BookDetails();
		info.setId(12345);
		info.setBookName("javacolle");
		info.setAuthor("jamesgosling");
		info.setCategory("java");
		info.setBookName("sunmicrosystems");
		boolean status=dao.addBook(info);
		Assertions.assertFalse(status);
	}
	@Test
	public void testRegisterAdminValid() {
		AdminDetails adn=new AdminDetails();
		adn.setId(123445);
		adn.setName("ammulu");
		adn.setMobile(630947585);
		adn.setEmail("ammulu@gmail.com");
		adn.setPassword("Ammulu@123");
		boolean status=dao.registerAdmin(adn);
		Assertions.assertTrue(status);
	}
	
	@Test
	public void testRegisterAdminInvalid() {
		AdminDetails adn=new AdminDetails();
		adn.setId(123445);
		adn.setName("ammulu");
		adn.setMobile(630947585);
		adn.setEmail("ammulu@gmail.com");
		adn.setPassword("Ammulu@123");
		boolean status=dao.registerAdmin(adn);
		Assertions.assertFalse(status);
	}
	
	@Test
	public void testLoginAdminValid() {
		AdminDetails info = dao.loginAdmin("ammulu@gmail.com", "Ammulu@123");
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testLoginAdminInvalid() {
		AdminDetails info = dao.loginAdmin("ammulu@gmail.com", "Ammulu123");
		Assertions.assertNull(info);
	}
	
	@Test
	public void testRemoveBookValid() {
		boolean status=dao.removeBook(12345);
		Assertions.assertTrue(status);
	}
	
	@Test
	public void testRemoveBookInvalid() {
		boolean status=dao.removeBook(12345);
		Assertions.assertFalse(status);
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
	
	@Test
	public void testShowUsersValid() {
		List<UserDetails> info = dao.showUsers();
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testShowUsersInvalid() {
		List<UserDetails> info = dao.showUsers();
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testShowRequestsValid() {
		List<RequestDetails> info = dao.showRequests();
		Assertions.assertNotNull(info);
	}
	

	@Test
	public void testShowRequests1() {
		List<RequestDetails> info = dao.showRequests();
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testBookIssueValid() {
		UserDetails user = new UserDetails();
		user.setId(222222);
		BookDetails book = new BookDetails();
		book.setId(100002);
		boolean check = dao.bookIssue(user, book);
		Assertions.assertTrue(check);
		
	}

	@Test
	public void testBookIssueInvalid() {
		UserDetails user = new UserDetails();
		user.setId(222222);
		BookDetails book = new BookDetails();
		book.setId(100002);
		boolean check = dao.bookIssue(user, book);
		Assertions.assertFalse(check);
		
	}
	
	@Test
	public void isBookReceivedValid() {
		UserDetails user = new UserDetails();
		user.setId(222222);
		BookDetails book = new BookDetails();
		book.setId(100002);
		boolean check = dao.isBookReceived(user, book);
		Assertions.assertTrue(check);
		
	}
	
	@Test
	public void isBookReceivedInvalid() {
		UserDetails user = new UserDetails();
		user.setId(222222);
		BookDetails book = new BookDetails();
		book.setId(100002);
		boolean check = dao.isBookReceived(user, book);
		Assertions.assertFalse(check);
		
	}

}
