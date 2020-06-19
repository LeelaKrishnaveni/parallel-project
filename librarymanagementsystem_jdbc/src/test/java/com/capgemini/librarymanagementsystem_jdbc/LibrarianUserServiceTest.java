package com.capgemini.librarymanagementsystem_jdbc;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.librarymanagementsystem_jdbc.dto.BookDetails;

import com.capgemini.librarymanagementsystem_jdbc.dto.UserDetails;
import com.capgemini.librarymanagementsystem_jdbc.service.LibrarianUserService;
import com.capgemini.librarymanagementsystem_jdbc.service.LibrarianUserServiceImplementation;

public class LibrarianUserServiceTest {


	
private LibrarianUserService service = new LibrarianUserServiceImplementation();

@Test
public void testRegisterValid() {
	UserDetails bean = new UserDetails();
	bean.setuId(100005);
	bean.setFirstName("krish");
	bean.setLastName("ammu");
	bean.setEmail("krishnaveni@gmail.com");
	bean.setPassword("Krish@123");
	bean.setRole("student");
	boolean check = service.register(bean);
	Assertions.assertTrue(check);		
}

@Test
public void testRegisterInvalid() {
	UserDetails bean = new UserDetails();
	bean.setuId(100005);
	bean.setFirstName("krish");
	bean.setLastName("ammu");
	bean.setEmail("krishnaveni@gmail.com");
	bean.setPassword("Krishnaveni@123");
	bean.setRole("student");
	boolean check = service.register(bean);
	Assertions.assertFalse(check);
}

@Test
public void testLoginValid() {
	UserDetails info = service.login("ammulu@gmail.com", "ammUlu@123");
	Assertions.assertNotNull(info);
}

@Test
public void testLoginInvalid() {
	UserDetails info = service.login("ammu@gmail.com", "ammU123");
	Assertions.assertNull(info);
}

@Test
public void testSearchBookByIdValid() {
	List<BookDetails> info = service.searchBookById(101);
	Assertions.assertNotNull(info);
	Assertions.assertEquals(1, info.size());

}

@Test
public void testSearchBookByIdInvalid() {
	List<BookDetails> info = service.searchBookById(109);
	Assertions.assertNotNull(info);
	Assertions.assertEquals(0, info.size());		
}

@Test
public void testSearchBookByTitleValid() {
	List<BookDetails> info = service.searchBookByTitle("MM");
	Assertions.assertNotNull(info);
	Assertions.assertEquals(1, info.size());		
}

@Test
public void testSearchBookByTitleInvalid() {
	List<BookDetails> info = service.searchBookByTitle("Maths");
	Assertions.assertNotNull(info);
	Assertions.assertEquals(0, info.size());		
}

@Test
public void testSearchBookByAuthorValid() {
	List<BookDetails> info = service.searchBookByAuthor("sharma");
	Assertions.assertNotNull(info);
	Assertions.assertEquals(1, info.size());		
}

@Test
public void testSearchBookByAuthorInvalid() {
	List<BookDetails> info = service.searchBookByAuthor("Jain");
	Assertions.assertNotNull(info);
	Assertions.assertEquals(0, info.size());	
}

@Test
public void testBooksInfoValid() {
	List<BookDetails> info = service.getBooksInfo();
	Assertions.assertNotNull(info);
	Assertions.assertEquals(5, info.size());
}

@Test
public void testBooksInfoInvalid() {
	List<BookDetails> info = service.getBooksInfo();
	Assertions.assertNotNull(info);
	Assertions.assertNotEquals(6, info.size());
}

@Test
public void testUpdatePasswordValid() {
	boolean check = service.updatePassword("ammu@gmail.com", "ammU@123", "Admin@123", "admin");
	Assertions.assertTrue(check);
}

@Test
public void testUpdatePasswordInvalid() {
	boolean check = service.updatePassword("amm@gmail.com", "ammU@123", "Admin@123", "student");
	Assertions.assertFalse(check);
}






}
