package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;

public class BooksDataBase {

	private static List<Book> books=new ArrayList<>();
	
	static {
		books.add(new Book(101, "Book 1", "AuthorA", 1200, 2500));
		books.add(new Book(102, "Book 2", "AuthorB", 3200, 2000));
		books.add(new Book(103, "Book 3", "AuthorD", 1800, 500));
		books.add(new Book(104, "Book 4", "AuthorA", 800, 500));
		books.add(new Book(105, "Book 5", "AuthorB", 200, 1500));
		books.add(new Book(106, "Book 6", "AuthorA", 1000, 2100));
		books.add(new Book(107, "Book 7", "AuthorD", 2100, 3500));
		books.add(new Book(108, "Book 8", "AuthorA", 1900, 5600));
	}

	public static List<Book> getBooks() {
		return books;
	}

	public static void setBooks(List<Book> books) {
		BooksDataBase.books = books;
	}
	
	
}
