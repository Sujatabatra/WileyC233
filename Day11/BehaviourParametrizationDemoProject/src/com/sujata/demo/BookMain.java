package com.sujata.demo;

import java.util.List;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		
		BookSearch bookSearch=new BookSearch();
		
//		List<Book> booksByAuthor=bookSearch.searchBookByAuthorA();
		List<Book> booksByAuthorA=bookSearch.searchBooks(new BookPredicateForAuthorA());
		System.out.println(booksByAuthorA);
		
//		bookList<Book> expensiveBooks=bookSearch.searchExpensiveBooks();
		List<Book> expensiveBooks=bookSearch.searchBooks(new ExpensiveBookPredicate());
		System.out.println(expensiveBooks);
		
		List<Book> thickBooks=bookSearch.searchBooks(new BookPredicate() {
			@Override
			public boolean test(Book book) {
				
				return book.getNoOfPages()>2500;
			}
		});

	}

}
