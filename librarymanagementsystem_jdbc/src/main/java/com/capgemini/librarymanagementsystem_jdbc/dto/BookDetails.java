package com.capgemini.librarymanagementsystem_jdbc.dto;

import java.io.Serializable;
import javax.annotation.Generated;


@SuppressWarnings("serial")
public class BookDetails implements Serializable{

	@Generated(value = { "bId" })
	private int bId;
	private String bookName;
	private String authorName;
	private String bookCategory;
	private String publisherName;
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}


}//End of BookDetails Method
