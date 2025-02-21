package bookstore.interfaces;

import java.util.List;

import bookstore.models.Book;

public interface BookOperations {
	
	void addBook(Book book);
	void updateBook(String bookId, Book updateBook);
	void deleteBook(String bookId);
	Book getBookById(String bookId);
	void listAllBooks();

    List<Book> findByAuthor(String author);
    List<Book> findByGenre(String genre);
    List<Book> findByTitle(String title);
    List<Book> findByPublisher(String publisher);
    List<Book> findByLanguage(String language);
}
