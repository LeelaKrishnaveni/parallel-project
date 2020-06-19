package com.capgemini.librarymanagementsystem_jdbc.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.capgemini.librarymanagementsystem_jdbc.exception.LibraryManagementSystemException;

public class LibraryUtility {

	private static Connection connection = null;

	public static Connection getConnection() throws LibraryManagementSystemException{

		File file = null;
		FileInputStream inputStream = null;

		file = new File("db.properties");
		try {
			inputStream = new FileInputStream(file);

			Properties properties = new Properties();
			properties.load(inputStream);

			String path = properties.getProperty("path");
			String dburl = properties.getProperty("dburl");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");

			Class.forName(path);
			connection = DriverManager.getConnection(dburl, user, password);

		} catch (FileNotFoundException e) {
			throw new LibraryManagementSystemException("File not exists");
		} catch (IOException e) {
			throw new LibraryManagementSystemException("Unable to read the data from the file");
		} catch (ClassNotFoundException e) {
			throw new LibraryManagementSystemException("Class not loaded");
		} catch (SQLException e) {
			throw new LibraryManagementSystemException("Connection issue");
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				throw new LibraryManagementSystemException("Unable to close the file");
			}
		}
		return connection;
	}

}
