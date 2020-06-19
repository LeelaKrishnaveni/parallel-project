package com.capgemini.librarymanagementsystem_collections.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.librarymanagementsystem_collections.exception.LibraryManagementSystemException;

public class Validations {

	public boolean validatedId(int id) throws LibraryManagementSystemException {
		String idRegEx = "[0-9]{1}[0-9]{5}" ;
		boolean result = false;
		if (Pattern.matches(idRegEx, String.valueOf(id))) {
			result = true;
		} else {
			throw new LibraryManagementSystemException("Id should contains exactly 6 digits");
		}
		return result;
	}//End of validatedId Method
	
	public boolean validatedName(String name) throws LibraryManagementSystemException {
		String nameRegEx = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$" ;
		boolean result = false;
		Pattern pattern = Pattern.compile(nameRegEx);
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()) {
			result = true;
		} else {
			throw new LibraryManagementSystemException("Name should  contains only Alphabates");
		}
		return result;
	}//End of validatedName Method

	public boolean validatedMobile(long mobile) throws LibraryManagementSystemException {
		String mobileRegEx = "(0/91)?[6-9][0-9]{9}" ;
		boolean result = false;
		if (Pattern.matches(mobileRegEx, String.valueOf(mobile))) {
			result = true;
		} else {
			throw new LibraryManagementSystemException("Mobile Number  will start with  6 or 9 and It should contains 10 numbers");
		}
		return result;
	}//End of validatedMobile Method
	
	public boolean validatedEmail(String email) throws LibraryManagementSystemException {
		String emailRegEx = "^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.(com|org)";
		boolean result = false;
		Pattern pattern = Pattern.compile(emailRegEx);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			result = true;
		} else {
			throw new LibraryManagementSystemException("Enter proper email ");
		}
		return result;
	}//End of validatedEmail Method


	public boolean validatedPassword(String password) throws LibraryManagementSystemException {
		String passwordRegEx = "((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%]).{6,20})" ;
		boolean result = false;
		if (Pattern.matches(passwordRegEx, String.valueOf(password))) { 
			result = true;
		} else {
			throw new LibraryManagementSystemException("Password should contain atleast 6 characters ,one uppercase,one lowercase,one number,one special symbol(@#$%) "); 
		}

		return result;

	}//End of validatedPassword Method

}
