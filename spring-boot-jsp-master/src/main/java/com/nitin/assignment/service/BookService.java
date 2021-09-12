package com.nitin.assignment.service;

import java.util.List;

import com.nitin.assignment.dto.BookDTO;

public interface BookService {

	public void createOrUpdateBook(BookDTO bookDTO);
	
	public List<BookDTO> getAllBook();
	
	public void deleteBook(Long id);
	
	public BookDTO editBook(Long id);
	
}
