package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;

public class BookSearch {

	List<Book> searchBookByAuthorA(){
		List<Book> bookList=new ArrayList<>();
		for(Book book:BooksDataBase.getBooks()) {
			if(book.getAuthorName().equals("AuthorA"))
				bookList.add(book);
		}
		
		return bookList;
	}
	
	List<Book> searchExpensiveBooks(){
		List<Book> bookList=new ArrayList<>();
		for(Book book:BooksDataBase.getBooks()) {
			if(book.getPrice()>1500)
				bookList.add(book);
		}	
		return bookList;
	}
	
	List<Book> searchBooks(BookPredicate bookPredicate){
		List<Book> bookList=new ArrayList<>();
		for(Book book:BooksDataBase.getBooks()) {
			if(bookPredicate.test(book))
				bookList.add(book);
		}	
		return bookList;
	}
	
}
