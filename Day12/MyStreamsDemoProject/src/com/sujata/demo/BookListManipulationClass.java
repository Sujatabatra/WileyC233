package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;

public class BookListManipulationClass {

	public static void main(String[] args) {
		List<Book> bookList=BookDataBase.getBookList();
		
//		bookList.stream()
//		.map(book->book.getAuthorName())
//		.distinct()
//		.forEach(System.out::println);
		
		bookList.stream()
		.map(Book::getAuthorName)
		.distinct()
		.forEach(System.out::println);
		
		
	}

}
