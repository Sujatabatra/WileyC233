package com.sujata.sort;

import java.util.Comparator;

public class MyBookAuthorNameSort implements Comparator<MyBook> {

	@Override
	public int compare(MyBook book1, MyBook book2) {
		if ((book1.getAuthorName().compareTo(book2.getAuthorName()))==1)
			return 1;
		else if((book1.getAuthorName().compareTo(book2.getAuthorName()))==-1)
		return -1;
		else if(book1.getBookId()==book2.getBookId()&& book1.getBookName().equals(book2.getBookName()) && book1.getAuthorName().equals(book2.getAuthorName())&& book1.getNoOfPages()==book2.getNoOfPages() && book1.getPrice()==book2.getPrice())
			return 0;
		return 1;
			
	}
}
