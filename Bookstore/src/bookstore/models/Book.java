package bookstore.models;

public abstract class Book {
	private int bookId;
	private String title;
	private String author;
	private String isbn;
	private String genre;
	private String publisher;
	private float price;
	private int pageCount;
	private String language;
	
	public Book(
			int bookId,
			String title, 
			String author, 
			String isbn, 
			String genre, 
			String publisher, 
			float price,
			int pageCount, 
			String language) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
		this.publisher = publisher;
		this.price = price;
		this.pageCount = pageCount;
		this.language = language;
	}
	
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
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
	
	public void displayInfo() {
		System.out.println("Showing basic info: ");
		System.out.println("Title: " + title); 
		System.out.println("Author: " + author); 
		System.out.println("Price: " + price);
	}
	
	public void displayInfo(boolean fullDetails) {
		if (fullDetails) {
			System.out.println("Book ID: " + bookId);
			System.out.println("Title: " + title);
			System.out.println("Author: " + author);
			System.out.println("ISBN: " + isbn);
			System.out.println("Genre: " + genre);
			System.out.println("Publisher: " + publisher);
			System.out.println("Price: " + price);
			System.out.println("Page count: " + pageCount);
			System.out.println("Language: " + language);
			System.out.println("\n");
			return;
		}
		displayInfo();
	}
	
	public void displayInfo(String infoType) { 
		switch (infoType.toLowerCase()) { 
			case "author": 
				System.out.println("Author: " + author); 
				break; 
			case "price": 
				System.out.println("Price: " + price); 
				break; 
			case "title": 
				System.out.println("Title: " + title); 
				break; 
			case "genre": 
				System.out.println("Genre: " + genre); 
				break; 
			case "isbn": 
				System.out.println("ISBN: " + isbn); 
				break; 
			case "publisher": 
				System.out.println("Publisher: " + publisher); 
				break; 
			case "pageCount": 
				System.out.println("Page Count: " + pageCount); 
				break; 
			case "language": 
				System.out.println("Language: " + language); 
				break; 
			default: 
				System.out.println("Invalid info type"); 
		} 
	}
}
