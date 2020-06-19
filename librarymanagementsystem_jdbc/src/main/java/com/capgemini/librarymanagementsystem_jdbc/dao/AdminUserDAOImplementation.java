package com.capgemini.librarymanagementsystem_jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.librarymanagementsystem_jdbc.dto.BookDetails;
import com.capgemini.librarymanagementsystem_jdbc.dto.UserDetails;
import com.capgemini.librarymanagementsystem_jdbc.exception.LibraryManagementSystemException;
import com.capgemini.librarymanagementsystem_jdbc.utility.LibraryUtility;

public class AdminUserDAOImplementation implements AdminUserDAO{

	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet rs = null;
	Statement stmt = null;


	@Override
	public List<BookDetails> searchBookById(int bId) {

		connection = LibraryUtility.getConnection();

		try (PreparedStatement statement = connection.prepareStatement(QueryMapper.searchIdQuery);) {
			statement.setInt(1, bId);
			rs = statement.executeQuery();
			List<BookDetails> beans = new ArrayList<BookDetails>();
			while (rs.next()) {
				BookDetails bean = new BookDetails();
				bean.setbId(rs.getInt("bId"));
				bean.setBookName(rs.getString("bookName"));
				bean.setAuthorName(rs.getString("authorName"));
				bean.setBookCategory(rs.getString("bookCategory"));
				bean.setPublisherName(rs.getString("publisherName"));
				beans.add(bean);
			}
			return beans;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<BookDetails> searchBookByTitle(String bookName) {

		connection = LibraryUtility.getConnection();

		try (PreparedStatement statement = connection.prepareStatement(QueryMapper.titleQuery);) {

			statement.setString(1, bookName);
			rs = statement.executeQuery();
			List<BookDetails> beans = new ArrayList<BookDetails>();
			while (rs.next()) {
				BookDetails bean = new BookDetails();
				bean.setbId(rs.getInt("bId"));
				bean.setBookName(rs.getString("bookName"));
				bean.setAuthorName(rs.getString("authorName"));
				bean.setBookCategory(rs.getString("bookCategory"));
				bean.setPublisherName(rs.getString("publisherName"));
				beans.add(bean);
			}
			return beans;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<BookDetails> searchBookByAuthor(String authorName) {

		connection = LibraryUtility.getConnection();

		try (PreparedStatement statement = connection.prepareStatement(QueryMapper.authorQuery);) {

			statement.setString(1, authorName);
			rs = statement.executeQuery();
			List<BookDetails> beans = new ArrayList<BookDetails>();
			while (rs.next()) {
				BookDetails bean = new BookDetails();
				bean.setbId(rs.getInt("bId"));
				bean.setBookName(rs.getString("bookName"));
				bean.setAuthorName(rs.getString("authorName"));
				bean.setBookCategory(rs.getString("bookCategory"));
				bean.setPublisherName(rs.getString("publisherName"));
				beans.add(bean);
			}
			return beans;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<BookDetails> getBooksInfo() {

		connection = LibraryUtility.getConnection();

		try (Statement stmt = (Statement) connection.createStatement();) {
			rs = stmt.executeQuery(QueryMapper.getAllBooksQuery);
			List<BookDetails> beans = new ArrayList<BookDetails>();
			while (rs.next()) {
				BookDetails bean = new BookDetails();
				bean.setbId(rs.getInt("bId"));
				bean.setBookName(rs.getString("bookName"));
				bean.setAuthorName(rs.getString("authorName"));
				bean.setBookCategory(rs.getString("bookCategory"));
				bean.setPublisherName(rs.getString("publisherName"));
				beans.add(bean);
			}
			return beans;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}


	}

	@Override
	public boolean register(UserDetails user) {

		connection = LibraryUtility.getConnection();

		try (PreparedStatement statement = connection.prepareStatement(QueryMapper.registerQuery);) {

			statement.setInt(1, user.getuId());
			statement.setString(2, user.getFirstName());
			statement.setString(3, user.getLastName());
			statement.setString(4, user.getEmail());
			statement.setString(5, user.getPassword());
			statement.setLong(6, user.getMobileNumber());
			statement.setString(7, user.getRole());
			int count = statement.executeUpdate();
			if ((user.getEmail().isEmpty()) && (count == 0)) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public UserDetails login(String email, String password) {

		connection = LibraryUtility.getConnection();

		try (PreparedStatement statement = connection.prepareStatement(QueryMapper.loginQuery);) {

			statement.setString(1, email);
			statement.setString(2, password);
			rs = statement.executeQuery();
			if (rs.next()) {
				UserDetails bean = new UserDetails();
				bean.setuId(rs.getInt("uId"));
				bean.setFirstName(rs.getString("firstName"));
				bean.setLastName(rs.getString("lastName"));
				bean.setEmail(rs.getString("email"));
				bean.setPassword(rs.getString("password"));
				bean.setMobileNumber(rs.getLong("mobileNumber"));
				bean.setRole(rs.getString("role"));
				return bean;
			} else {
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public boolean updatePassword(String email, String password, String newPassword, String role) {

		connection = LibraryUtility.getConnection();

		try (PreparedStatement statement = connection.prepareStatement(QueryMapper.updatePasswordQuery1);) {
			statement.setString(1, email);
			statement.setString(2, role);
			rs = statement.executeQuery();
			if (rs.next()) {
				try (PreparedStatement pstmt = connection.prepareStatement(QueryMapper.updatePasswordQuery2);) {
					pstmt.setString(1, newPassword);
					pstmt.setString(2, email);
					pstmt.setString(3, password);
					int count = pstmt.executeUpdate();
					if (count != 0) {
						return true;
					} else {
						return false;
					}
				}
			} else {
				throw new LibraryManagementSystemException("user doesnt exist");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}

	}

}
