package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;

public class BookDataBase {

	static private List<Book> bookList=new ArrayList<>();
	static {
		bookList.add(new Book(101, "Book 1", "Mr. A", 1200, 800));
		bookList.add(new Book(102, "Book 2", "Mr. B", 1800, 1000));
		bookList.add(new Book(103, "Book 3", "Mr. A", 2500, 1800));
		bookList.add(new Book(104, "Book 4", "Mr. B", 250, 1700));
		bookList.add(new Book(105, "Book 5", "Mr. C", 1000, 400));
		bookList.add(new Book(106, "Book 6", "Mr. A", 8200, 1600));
		bookList.add(new Book(107, "Book 7", "Mr. X", 3400, 1400));
		bookList.add(new Book(108, "Book 8", "Mr. A", 500, 900));
		bookList.add(new Book(109, "Book 9", "Mr. M", 700, 650));
		bookList.add(new Book(110, "Book 10", "Mr. A", 1200, 780));
	}
	public static List<Book> getBookList() {
		return bookList;
	}
	public static void setBookList(List<Book> bookList) {
		BookDataBase.bookList = bookList;
	}
	
	
}
