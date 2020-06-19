package com.capgemini.librarymanagementsystem_collections.factory;

import com.capgemini.librarymanagementsystem_collections.dao.AdminDAO;
import com.capgemini.librarymanagementsystem_collections.dao.AdminDAOImplementation;
import com.capgemini.librarymanagementsystem_collections.dao.UserDAO;
import com.capgemini.librarymanagementsystem_collections.dao.UserDAOImplementation;
import com.capgemini.librarymanagementsystem_collections.service.AdminService;
import com.capgemini.librarymanagementsystem_collections.service.AdminServiceImplementation;
import com.capgemini.librarymanagementsystem_collections.service.UserService;
import com.capgemini.librarymanagementsystem_collections.service.UserServiceImplementation;

public class LibraryFactory {

	public static AdminDAO getAdminDao() {
		return new AdminDAOImplementation();
	}
	public static AdminService getAdminService() {
		return new AdminServiceImplementation();
	}
	public static UserDAO getUserDao() {
		return new UserDAOImplementation();
	}
	public static UserService getUserService() {
		return new UserServiceImplementation();
	}

}//End of LibraryFactory Class
