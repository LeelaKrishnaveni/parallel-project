package com.capgemini.librarymanagementsystem_jdbc.dao;

public interface QueryMapper {

String registerQuery = "insert into userdetails values(?,?,?,?,?,?,?)";
	
	String loginQuery = "select * from userdetails where email=? and password=?";
	
	String addBookQuery = "insert into bookdetails values(?,?,?,?,?)";
	
	String removeBookQuery = "delete from bookdetails where bId=?";
	
	String updateBookQuery = "update bookdetails set bookName=? where bId=?";
	
	String issueBookQuery1 = "select * from request_details where uId=? and bId=? and email=(select email from userdetails where uId=?)";
	
	String issueBookQuery2 = "insert into book_issue_details values(?,?,?,?)";
	
	String issueBookQuery3 = "Insert into borrowed_books values(?,?,(select email from userdetails where uId=?))";
	
	String requestBookQuery1="select * from bookdetails where bId=?";
			
	String requestBookQuery2="select count(*) as userId from book_issue_details where userId=?";;
			
	String requestBookQuery3="\"insert into request_details values(?,(select concat(firstName,'_',lastName) from userdetails where uId=?)\"\r\n" + 
			"			+ \",?,(select bookName from bookdetails where bId=?),(select email from userdetails where uId=?))\";\r\n" + 
			"";
			
	String requestBookQuery4="insert into request_details values(?,(select concat(firstname,'_',lastname) from userdetails where uId=?),?,(select bookName from bookdetails where bId=?),(select email from userdetails where uId=?))";
	
	String titleQuery = "select * from bookdetails where bookName=?";
	
	String authorQuery = "select * from bookdetails where authorName=?";
	
	String getAllBooksQuery = "select * from bookdetails";
	
	String bookHistroyQuery = "select count(*) as uId from book_issue_details where uId=?";
	
	String borrowQuery = "select * from borrowed_books where uId=?";
	
	String searchIdQuery = "select * from bookdetails where bId=?";
	
	String returnBookQuery1 = "select * from book_issue_details where bId=? and uId=?";
	
	String returnBookQuery2 = "delete from book_issue_details where bId=? and uId=?";
	
	String returnBookQuery3 = "delete from borrowed_books where bId=? and uId=?";
	
	String returnBookQuery4 = "delete from request_details where bId=? and uId=?";
	
	String showRequestsQuery = "select * from request_details";
	
	String showIssuedBooksQuery = "select * from book_issue_details";
	
	String showUsersQuery = "select * from userdetails";
	
	String updatePasswordQuery1 = "select * from userdetails where email=? and role=?";
	
	String updatePasswordQuery2 = "update userdetails set password=? where email=? and password=?";

}
