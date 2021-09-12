package com.nitin.assignment.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nitin.assignment.dto.BookDTO;
import com.nitin.assignment.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/registration")
	public String reg(Map<String, Object> model) {
		model.put("book", new BookDTO());
		return "Registration";
	}
	
	@PostMapping("/home")
	public String createBook(@ModelAttribute("book") BookDTO bookDTO) {
		bookService.createOrUpdateBook(bookDTO);
		return "redirect:/list";	
	}
	
	@GetMapping("/list")
	public String listOfBook(Model model) {
		List<BookDTO> bookList = bookService.getAllBook();
		model.addAttribute("bookList", bookList);
		return "bookList";
	}
	
	@PostMapping("/delete")
	public String deleteBook(@RequestParam("id") String id) {
		bookService.deleteBook(Long.parseLong(id));
		return "redirect:/list";		
	}
	
	@GetMapping("/edit")
	public String editBook(@RequestParam("id") String id, Map<String, Object> model) {
		BookDTO bookDTO = bookService.editBook(Long.parseLong(id));
		model.put("book", bookDTO);
		return "Registration";
	}
	
}
