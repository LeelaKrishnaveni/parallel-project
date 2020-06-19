package com.capgemini.librarymanagementsystem_collections.db;

import java.util.ArrayList;

import com.capgemini.librarymanagementsystem_collections.dto.AdminDetails;
import com.capgemini.librarymanagementsystem_collections.dto.BookDetails;
import com.capgemini.librarymanagementsystem_collections.dto.RequestDetails;
import com.capgemini.librarymanagementsystem_collections.dto.UserDetails;

public class LibraryDB {

	public static final ArrayList<BookDetails> BOOKS = new ArrayList<BookDetails>(); 
	public static final ArrayList<AdminDetails> ADMIN = new ArrayList<AdminDetails>();
	public static final ArrayList<UserDetails> USER = new ArrayList<UserDetails>();
	public static final ArrayList<RequestDetails> REQUEST = new ArrayList<RequestDetails>();

	public static void addToDB() {
		ADMIN.add(new AdminDetails(111112,"Ammulu","Ammulu@123","ammulupotlapalli@gmail.com",630947585));
				

		BOOKS.add(new BookDetails(101010,"java","james","gosling","coding"));
		BOOKS.add(new BookDetails(101011,"history","tom","henry feild","world"));
		BOOKS.add(new BookDetails(101012,"angular","misko","adam","js"));
		BOOKS.add(new BookDetails(101013,"computers","charles","aborns","programing"));


	}
}//End of LibraryDB Class