package bookstore.interfaces;

import java.util.List;

import bookstore.models.Book;

public interface BookOperations {
	
	void addBook(Book book);
	void updateBook(int bookId, Book updateBook);
	void deleteBook(int bookId);
	Book getBookById(int bookId);
	void listAllBooks();

    List<Book> findByAuthor(String author);
    List<Book> findByGenre(String genre);
    List<Book> findByTitle(String title);
    List<Book> findByPublisher(String publisher);
    List<Book> findByLanguage(String language);
}
