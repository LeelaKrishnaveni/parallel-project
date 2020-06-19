package com.capgemini.librarymanagementsystem_jdbc.factory;

import com.capgemini.librarymanagementsystem_jdbc.dao.AdminDAO;
import com.capgemini.librarymanagementsystem_jdbc.dao.AdminDAOImplementation;
import com.capgemini.librarymanagementsystem_jdbc.dao.AdminUserDAO;
import com.capgemini.librarymanagementsystem_jdbc.dao.AdminUserDAOImplementation;
import com.capgemini.librarymanagementsystem_jdbc.dao.UserDAO;
import com.capgemini.librarymanagementsystem_jdbc.dao.UserDAOImplementation;
import com.capgemini.librarymanagementsystem_jdbc.service.AdminService;
import com.capgemini.librarymanagementsystem_jdbc.service.AdminServiceImplementation;
import com.capgemini.librarymanagementsystem_jdbc.service.LibrarianUserService;
import com.capgemini.librarymanagementsystem_jdbc.service.LibrarianUserServiceImplementation;
import com.capgemini.librarymanagementsystem_jdbc.service.UserService;
import com.capgemini.librarymanagementsystem_jdbc.service.UserServiceImplementation;

public class LibraryFactory {

	public static AdminDAO getLibrarianDAO() {
		return new AdminDAOImplementation();
	}
	
	public static UserDAO getStudentDAO() {
		return new UserDAOImplementation();
	}
	
	public static AdminUserDAO getLibrarianStudentDAO() {
		return new AdminUserDAOImplementation();
	}
	
	public static AdminService getAdminService() {
		return new AdminServiceImplementation();
	}
	
	public static UserService getUserService() {
		return new UserServiceImplementation();
	}
	
	public static LibrarianUserService getLibrarianStudentService() {
		return new LibrarianUserServiceImplementation();
	}

}
