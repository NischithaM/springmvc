package com.cruds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.entity.Book;
import com.cruds.entity.Department;
import com.cruds.service.BookService;

@Controller
public class BookController {

	@Autowired 
	BookService bookservice;
	
	@RequestMapping(value="/book",method=RequestMethod.GET)
	public String showBookForm(Model model)
	{
		model.addAttribute("command", new Book());
		return "book";
	}
	
	@RequestMapping(value="/listbook",method=RequestMethod.GET)
	public String showlistBook(Model model)
	{
		model.addAttribute("BOOK_LIST", bookservice.getall());
		return "booklist";
		
	}
	
	@RequestMapping(value="/book",method=RequestMethod.POST)
	public String doBookForm(@ModelAttribute("book") Book b)
	{
		System.out.println(b.getIsbn()+":"+b.getTitle()+":"+b.getPrice());
		bookservice.create(b);
		return "success";
		
	}
}
