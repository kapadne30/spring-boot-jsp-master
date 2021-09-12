package com.nitin.assignment.dto;

import com.nitin.assignment.model.Book;

public class BookDTO {
	
	private Long id;
	private String bookName;
	private String author;
	private String price;
	
	 public BookDTO() {  
     }

     public BookDTO(Book book) {
    	 this.id=book.getId();
         this.bookName = book.getBookName();
         this.author = book.getAuthor();
         this.price = book.getPrice();
        
     }
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	

}
