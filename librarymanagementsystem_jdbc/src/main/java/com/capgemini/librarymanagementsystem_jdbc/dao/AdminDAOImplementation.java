package com.capgemini.librarymanagementsystem_jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.capgemini.librarymanagementsystem_jdbc.dto.BookDetails;
import com.capgemini.librarymanagementsystem_jdbc.dto.BookIssueDetails;
import com.capgemini.librarymanagementsystem_jdbc.dto.RequestDetails;
import com.capgemini.librarymanagementsystem_jdbc.dto.UserDetails;
import com.capgemini.librarymanagementsystem_jdbc.exception.LibraryManagementSystemException;
import com.capgemini.librarymanagementsystem_jdbc.utility.LibraryUtility;

public class AdminDAOImplementation implements AdminDAO{

	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet rs = null;
	Statement stmt = null;


	@Override
	public List<BookIssueDetails> bookHistoryDetails(int uId) {

		connection = LibraryUtility.getConnection();

		try (PreparedStatement statement = connection.prepareStatement(QueryMapper.bookHistroyQuery);) {
			statement.setInt(1, uId);
			rs = statement.executeQuery();
			List<BookIssueDetails> beans = new ArrayList<BookIssueDetails>();
			while (rs.next()) {
				BookIssueDetails issueDetails = new BookIssueDetails();
				issueDetails.setUserId(rs.getInt("uId"));
				beans.add(issueDetails);
			}
			return beans;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<RequestDetails> showRequests() {

		connection = LibraryUtility.getConnection();

		try (Statement stmt = (Statement) connection.createStatement();
				ResultSet rs = stmt.executeQuery(QueryMapper.showRequestsQuery);) {
			List<RequestDetails> beans = new ArrayList<RequestDetails>();
			while (rs.next()) {
				RequestDetails bean = new RequestDetails();
				bean.setuId(rs.getInt("uId"));
				bean.setFullName(rs.getString("fullName"));
				bean.setbId(rs.getInt("bId"));
				bean.setBookName(rs.getString("bookName"));
				beans.add(bean);
			}
			return beans;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}

	}

	@Override
	public List<BookIssueDetails> showIssuedBooks() {

		connection = LibraryUtility.getConnection();

		try (Statement stmt = (Statement) connection.createStatement();
				ResultSet rs = stmt.executeQuery(QueryMapper.showIssuedBooksQuery);) {
			List<BookIssueDetails> beans = new ArrayList<BookIssueDetails>();
			while (rs.next()) {
				BookIssueDetails bean = new BookIssueDetails();
				bean.setBookId(rs.getInt("bookId"));
				bean.setUserId(rs.getInt("userId"));
				bean.setIssueDate(rs.getDate("issueDate"));
				bean.setReturnDate(rs.getDate("returnDate"));
				beans.add(bean);
			}
			return beans;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}

	}

	@Override
	public List<UserDetails> showUsers() {

		connection = LibraryUtility.getConnection();

		try (Statement stmt = (Statement) connection.createStatement();
				ResultSet rs = stmt.executeQuery(QueryMapper.showUsersQuery);) {
			List<UserDetails> beans = new ArrayList<UserDetails>();
			while (rs.next()) {
				UserDetails bean = new UserDetails();
				bean.setuId(rs.getInt("uId"));
				bean.setFirstName(rs.getString("firstName"));
				bean.setLastName(rs.getString("lastName"));
				bean.setEmail(rs.getString("email"));
				bean.setPassword(rs.getString("password"));
				bean.setMobileNumber(rs.getLong("mobile"));
				bean.setRole(rs.getString("role"));
				beans.add(bean);
			}
			return beans;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}



	@Override
	public boolean addBook(BookDetails book) {

		connection =LibraryUtility.getConnection();

		try (PreparedStatement statement = connection.prepareStatement(QueryMapper.addBookQuery);) {

			statement.setInt(1, book.getbId());
			statement.setString(2, book.getBookName());
			statement.setString(3, book.getAuthorName());
			statement.setString(4, book.getBookCategory());
			statement.setString(5, book.getPublisherName());
			int count = statement.executeUpdate();
			if (count != 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean removeBook(int bId) {

		connection = LibraryUtility.getConnection();

		try (PreparedStatement statement = connection.prepareStatement(QueryMapper.removeBookQuery);) {

			statement.setInt(1, bId);
			int count = statement.executeUpdate();
			if (count != 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateBook(BookDetails book) {

		connection = LibraryUtility.getConnection();

		try (PreparedStatement statement = connection.prepareStatement(QueryMapper.updateBookQuery);) {

			statement.setString(1, book.getBookName());
			statement.setInt(2, book.getbId());
			int count = statement.executeUpdate();
			if (count != 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean issueBook(int bId, int uId) {

		connection = LibraryUtility.getConnection();

		try (PreparedStatement statement = connection.prepareStatement(QueryMapper.issueBookQuery1);) {

			statement.setInt(1, uId);
			statement.setInt(2, bId);
			statement.setInt(3, uId);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				try (PreparedStatement pstmt1 = connection.prepareStatement(QueryMapper.issueBookQuery2);) {
					pstmt1.setInt(1, bId);
					pstmt1.setInt(2, uId);
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					Calendar cal = Calendar.getInstance();
					String issueDate = sdf.format(cal.getTime());
					pstmt1.setDate(3, java.sql.Date.valueOf(issueDate));
					cal.add(Calendar.DAY_OF_MONTH, 7);
					String returnDate = sdf.format(cal.getTime());
					pstmt1.setDate(4, java.sql.Date.valueOf(returnDate));
					int count = pstmt1.executeUpdate();
					if (count != 0) {
						try (PreparedStatement pstmt2 = connection.prepareStatement(QueryMapper.issueBookQuery3);) {
							pstmt2.setInt(1, uId);
							pstmt2.setInt(2, bId);
							pstmt2.setInt(3, uId);
							int isBorrowed = pstmt2.executeUpdate();
							if (isBorrowed != 0) {
								return true;
							} else {
								return false;
							}
						}
					} else {
						throw new LibraryManagementSystemException("Book Not issued");
					}
				}
			} else {
				throw new LibraryManagementSystemException("The respective user have not placed any request");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
