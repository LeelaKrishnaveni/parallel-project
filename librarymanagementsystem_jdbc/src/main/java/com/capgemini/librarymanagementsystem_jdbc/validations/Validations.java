package com.capgemini.librarymanagementsystem_jdbc.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.librarymanagementsystem_jdbc.exception.LibraryManagementSystemException;

public class Validations {

	public boolean validatedId(int id) throws LibraryManagementSystemException{
		String idRegEx = "[0-9]{1}[0-9]{5}" ;
		boolean result = false;
		if (Pattern.matches(idRegEx, String.valueOf(id))) {
			result = true;
		} else {
			throw new LibraryManagementSystemException("Id should contains exactly 6 digits");
		}
		return result;
	}

	public boolean validatedName(String name) throws LibraryManagementSystemException{
		String nameRegEx = "^(?=.{8,20}$)(?![.])(?!.*[.]{2})[a-zA-Z0-9.]+(?<![.])";
		
		boolean result = false;
		Pattern pattern = Pattern.compile(nameRegEx);
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()) {
			result = true;
		} else {
			throw new LibraryManagementSystemException("Name should contains only Alpabates");
		}
		return result;
	}

	public boolean validatedMobile(long mobile) throws LibraryManagementSystemException{
		String mobileRegEx = "(0/91)?[6-9][0-9]{9}" ;
		boolean result = false;
		if (Pattern.matches(mobileRegEx, String.valueOf(mobile))) {
			result = true;
		} else {
			throw new LibraryManagementSystemException("Mobile Number will start with  6,7,8,9 and It should contains 10 numbers");
		}
		return result;
	}

	public boolean validatedEmail(String email) throws LibraryManagementSystemException{
		
		String emailRegEx = "^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.(com|org)";
		boolean result = false;
		Pattern pattern = Pattern.compile(emailRegEx);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			result = true;
		} else {
			throw new LibraryManagementSystemException("Enter proper email such that it should consist of numbers and alphabets");
		}
		return result;
	}

	public boolean validatedPassword(String password) throws LibraryManagementSystemException{
		String passwordRegEx = "((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%]).{6,20})" ;
		boolean result = false;
		if (Pattern.matches(passwordRegEx, String.valueOf(password))) { 
			result = true;
		} else {
			throw new LibraryManagementSystemException("Password should contain atleast 6 characters ,one uppercase,one lowercase,one number,one special symbol(@#$%) "); 
		}
		return result;
	}

	public boolean validatedRole(String role) throws LibraryManagementSystemException{
		String roleRegEx = "^(?i)(admin|student)$" ;
		boolean result = false;
		if(Pattern.matches(roleRegEx, String.valueOf(role))) {
			result = true;
		} else {
			throw new LibraryManagementSystemException("Enter admin or student as role ");
		}
		return result;
	}


}
