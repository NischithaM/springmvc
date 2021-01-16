package com.cruds.entity;

public class Book {
	
	private int isbn;
	private String title;
	private int price;
	
	
	public Book() {
		super();
	}
	public Book(int isbn, String title, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	
	

}
