package com.sujata.sort;

public class Book implements Comparable<Book>{

	private int bookId;
	private String bookName;
	private String authorName;
	private int price;
	private int noOfPages;
	
	public Book() {	
	}

	public Book(int bookId, String bookName, String authorName, int price, int noOfPages) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.noOfPages = noOfPages;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public int compareTo(Book book) {
		if(price>book.price)
			return 1;
		else if(price<book.price)
			return -1;
		if(bookId==book.bookId&& bookName.equals(book.bookName) && authorName.equals(book.authorName) && price==book.price && noOfPages==book.noOfPages)
			return 0;
		return 1;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price
				+ ", noOfPages=" + noOfPages + "]";
	}
	
	
	

}
