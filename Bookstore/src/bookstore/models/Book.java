package bookstore.models;

import java.util.Date;

public abstract class Book {
	private String title;
	private String author;
	private String isbn;
	private String genre;
	private String publisher;
	private Date publishDate;
	private float price;
	private int pageCount;
	private String language;
	
	public Book(String title, 
			String author, 
			String isbn, 
			String genre, 
			String publisher, 
			Date publishDate, 
			float price,
			int pageCount, 
			String language) {
		
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.price = price;
		this.pageCount = pageCount;
		this.language = language;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
