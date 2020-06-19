package com.capgemini.librarymanagementsystem_jdbc.dao;


import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


import com.capgemini.librarymanagementsystem_jdbc.dto.BooksBorrowedDetails;
import com.capgemini.librarymanagementsystem_jdbc.exception.LibraryManagementSystemException;
import com.capgemini.librarymanagementsystem_jdbc.utility.LibraryUtility;

public class UserDAOImplementation implements UserDAO{

	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet rs = null;
	Statement stmt = null;

	@Override
	public boolean request(int uId, int bId) {
	
		connection = LibraryUtility.getConnection();
try {
	try (PreparedStatement pstmt1 = connection.prepareStatement(QueryMapper.requestBookQuery1);){
			
		pstmt1.setInt(1, bId);
		ResultSet rs = pstmt1.executeQuery();
		if(rs.next()) {
			try (PreparedStatement pstmt2 = connection.prepareStatement(QueryMapper.requestBookQuery2);){
				pstmt2.setInt(1, uId);
				pstmt2.setInt(2, bId);
				pstmt2.setInt(3, uId);
				rs = pstmt2.executeQuery();
				if(rs.next()) {
					int isBookExists = rs.getInt("uId");
					if(isBookExists==0) {
						try (PreparedStatement pstmt3 = connection.prepareStatement(QueryMapper.requestBookQuery3);) {
							pstmt3.setInt(1, uId);
							rs=pstmt3.executeQuery();
							if(rs.next()) {
								int noOfBooksBorrowed = rs.getInt("uId");
								if(noOfBooksBorrowed<3) {
									try (PreparedStatement pstmt4 = connection.prepareStatement(QueryMapper.requestBookQuery4);){
										pstmt4.setInt(1,uId);
										pstmt4.setInt(2, uId);
										pstmt4.setInt(3, bId);
										pstmt4.setInt(4, bId);
										pstmt4.setInt(5, uId);
										int count = pstmt4.executeUpdate();
										if(count != 0) {
											return true;
										}else {
											return false;
										}
									}				 
								}else {
									throw new LibraryManagementSystemException("no Of books limit has crossed");
								}
							}else {
								throw new LibraryManagementSystemException("no of books limit has crossed");
							}		
						}				
					}else{
						throw new LibraryManagementSystemException("You have already borrowed the requested book");
					}		
				}else {
					throw new LibraryManagementSystemException("You have already borrowed the requested book");
				}			
			}

		}else {
			throw new LibraryManagementSystemException("The book with requested id is not present");
		}
	}

} catch(Exception e) {
	System.err.println(e.getMessage());
	return false;
}
	}
	

	@Override
	public boolean returnBook(int bId, int uId, String status) {
		
		connection = LibraryUtility.getConnection();

		try (PreparedStatement statement = connection.prepareStatement(QueryMapper.returnBookQuery1);) {
			statement.setInt(1, bId);
			statement.setInt(2, uId);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				Date issueDate = rs.getDate("issueDate");
				Calendar cal = Calendar.getInstance();
				Date returnDate = cal.getTime();
				long difference = issueDate.getTime() - returnDate.getTime();
				float daysBetween = (difference / (1000 * 60 * 60 * 24));
				if (daysBetween > 7) {
					float fine = daysBetween * 5;
					System.out.println("The user has to pay the fine of the respective book of Rs:" + fine);
					if (status == "yes") {
						try (PreparedStatement pstmt1 = connection.prepareStatement(QueryMapper.returnBookQuery2);) {
							pstmt1.setInt(1, bId);
							pstmt1.setInt(2, uId);
							int count = pstmt1.executeUpdate();
							if (count != 0) {
								try (PreparedStatement pstmt2 = connection
										.prepareStatement(QueryMapper.returnBookQuery3);) {
									pstmt2.setInt(1, bId);
									pstmt2.setInt(2, uId);
									int isReturned = pstmt2.executeUpdate();
									if (isReturned != 0) {
										try (PreparedStatement pstmt3 = connection
												.prepareStatement(QueryMapper.returnBookQuery4);) {
											pstmt3.setInt(1, bId);
											pstmt3.setInt(2, uId);
											int isRequestDeleted = pstmt3.executeUpdate();
											if (isRequestDeleted != 0) {
												return true;
											} else {
												return false;
											}
										}
									} else {
										return false;
									}
								}
							} else {
								return false;
							}
						}
					} else {
						throw new LibraryManagementSystemException("The user has to pay fine for delaying book return");
					}
				} else {
					try (PreparedStatement pstmt1 = connection.prepareStatement(QueryMapper.returnBookQuery2);) {
						pstmt1.setInt(1, bId);
						pstmt1.setInt(2, uId);
						int count = pstmt1.executeUpdate();
						if (count != 0) {
							try (PreparedStatement pstmt2 = connection
									.prepareStatement(QueryMapper.returnBookQuery3);) {
								pstmt2.setInt(1, bId);
								pstmt2.setInt(2, uId);
								int isReturned = pstmt2.executeUpdate();
								if (isReturned != 0) {
									try (PreparedStatement pstmt3 = connection
											.prepareStatement(QueryMapper.returnBookQuery4);) {
										pstmt3.setInt(1, bId);
										pstmt3.setInt(2, uId);
										int isRequestDeleted = pstmt3.executeUpdate();
										if (isRequestDeleted != 0) {
											return true;
										} else {
											return false;
										}
									}
								} else {
									return false;
								}
							}
						} else {
							return false;
						}
					}
				}
			} else {
				throw new LibraryManagementSystemException("This respective user hasn't borrowed any book");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}

	}

	@Override
	public List<BooksBorrowedDetails> borrowedBook(int uId) {
		
		connection = LibraryUtility.getConnection();

		try (PreparedStatement statement = connection.prepareStatement(QueryMapper.borrowQuery);) {
			statement.setInt(1, uId);
			rs = statement.executeQuery();
			List<BooksBorrowedDetails> beans = new ArrayList<BooksBorrowedDetails>();
			while (rs.next()) {
				BooksBorrowedDetails listOfbooksBorrowed = new BooksBorrowedDetails();
				listOfbooksBorrowed.setuId(rs.getInt("sId"));
				listOfbooksBorrowed.setbId(rs.getInt("bId"));
				listOfbooksBorrowed.setEmail(rs.getString("email"));
				beans.add(listOfbooksBorrowed);
			}
			return beans;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
