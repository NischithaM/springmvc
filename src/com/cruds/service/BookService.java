package com.cruds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.db.BookDAO;
import com.cruds.entity.Book;

@Service
public class BookService {

	@Autowired
	BookDAO bookdao;
	
	public Boolean create(Book b)
	{
		return bookdao.create(b);
	}
	
	public List<Book> getall()
	{
		return bookdao.getall();
	}
}
