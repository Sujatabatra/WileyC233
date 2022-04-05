package com.sujata.demo;

public class BookPredicateForAuthorA implements BookPredicate {

	@Override
	public boolean test(Book book) {
		
		return book.getAuthorName().equals("AuthorA");
	}

}
