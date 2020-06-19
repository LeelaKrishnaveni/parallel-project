package com.capgemini.librarymanagementsystem_collections.dto;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class RequestDetails implements Serializable{

	private BookDetails bookInfo;
	private UserDetails userInfo;
	private boolean isIssued;
	private boolean isReturned;
	private LocalDate issuedDate;
	private LocalDate returnedDate;
	public BookDetails getBookInfo() {
		return bookInfo;
	}
	public void setBookInfo(BookDetails bookInfo) {
		this.bookInfo = bookInfo;
	}
	public UserDetails getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserDetails userInfo) {
		this.userInfo = userInfo;
	}
	public boolean isIssued() {
		return isIssued;
	}
	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}
	public boolean isReturned() {
		return isReturned;
	}
	public void setReturned(boolean isReturned) {
		this.isReturned = isReturned;
	}
	public LocalDate getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}
	public LocalDate getReturnedDate() {
		return returnedDate;
	}
	public void setReturnedDate(LocalDate returnedDate) {
		this.returnedDate = returnedDate;
	}
	
	
}//End of RequestDetails Class
