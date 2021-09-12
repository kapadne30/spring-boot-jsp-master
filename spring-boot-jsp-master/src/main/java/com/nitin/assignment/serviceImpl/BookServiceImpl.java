package com.nitin.assignment.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitin.assignment.dto.BookDTO;
import com.nitin.assignment.model.Book;
import com.nitin.assignment.repository.BookRepository;
import com.nitin.assignment.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;

	public void createOrUpdateBook(BookDTO bookDTO) {
		Book book = convertDtoToModel(bookDTO);
		bookRepository.save(book);
	}
	
	public List<BookDTO> getAllBook() {
		List<Book> list = bookRepository.findAll();
		List<BookDTO> bookList = list.stream()
	            .map(BookDTO::new)
	            .collect(Collectors.toCollection(ArrayList::new));
		return bookList;
	}
	
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
	
	public BookDTO editBook(Long id) {
		Book book = bookRepository.getOne(id);
		return convertModelToDTO(book);
	}
	
	private Book convertDtoToModel(BookDTO bookDTO) {
		Book book = new Book();
		if (bookDTO.getId() != null) {
			book.setId(bookDTO.getId());
		}		
		book.setBookName(bookDTO.getBookName());
		book.setAuthor(bookDTO.getAuthor());
		book.setPrice(bookDTO.getPrice());
		return book;
	}
	
	private BookDTO convertModelToDTO(Book book) {
		BookDTO bookDTO = new BookDTO();
		bookDTO.setId(book.getId());
		bookDTO.setBookName(book.getBookName());
		bookDTO.setAuthor(book.getAuthor());
		bookDTO.setPrice(book.getPrice());
		
		return bookDTO;
	}
}
