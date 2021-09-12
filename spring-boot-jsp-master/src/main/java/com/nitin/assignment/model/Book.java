package com.nitin.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bookid")
	private Long id;
	
	@Column(name="bookname")
	//private String firstName;
	private String bookName;
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Column(name="author")
	private String author;
	
	@Column(name="price")
	private String price;
	
	/*
	 * @Column(name="email_id") private String emailId;
	 * 
	 * @Column(name="book_id") private String bookId;
	 * 
	 * @Column(name="blood_gp") private String bloodGp;
	 * 
	 * @Column(name="age") private int age;
	 * 
	 * @Column(name="personal_email") private String personalEmail;
	 * 
	 * @Column(name="mobile_no") private String mobileNo;
	 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
}
