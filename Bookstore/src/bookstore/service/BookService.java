package bookstore.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;

import bookstore.interfaces.BookOperations;
import bookstore.models.Book;

public class BookService implements BookOperations {
	
    private Map<String, Book> books = new HashMap<>();

    @Override
    public void addBook(Book book) {
        books.put(book.getBookId(), book);
        System.out.println("Book added: " + book.getTitle());
    }

    @Override
    public void updateBook(String bookId, Book updatedBook) { 
    	
    	if(!books.containsKey(bookId)) {
    		System.out.println("Book not found. ");
    		return;
    	}
		books.put(bookId, updatedBook); 
		System.out.println("Book updated: " + updatedBook.getTitle()); 
	}

    @Override
    public void deleteBook(String bookId) { 
    	if(books.remove(bookId) == null) {
    		System.out.println("Book not found."); 
    		return;
    	}
    	System.out.println("The book was deleted.");
	}

    @Override
    public Book getBookById(String bookId) {
    	return books.get(bookId); 
    }

    @Override
    public void listAllBooks() { 
    	if (books.isEmpty()) { 
    		System.out.println("There are no books available. "); 
    		return;
    	}
    	books.values().forEach(book -> System.out.println(book.getTitle())); 
    }

    @Override
    public List<Book> findByAuthor(String author) { 
    	return books.values().stream()
    			.filter(book -> book.getAuthor().equalsIgnoreCase(author))
    			.collect(Collectors.toList()); 
    	}

	@Override
    public List<Book> findByGenre(String genre) { 
    	return books.values().stream()
    			.filter(book -> book.getGenre().equalsIgnoreCase(genre))
    			.collect(Collectors.toList()); 
    	}

	@Override 
    public List<Book> findByTitle(String title) {
        return books.values().stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

	@Override
    public List<Book> findByPublisher(String publisher) {
        return books.values().stream()
                .filter(book -> book.getPublisher().equalsIgnoreCase(publisher))
                .collect(Collectors.toList());
    }

	@Override
    public List<Book> findByLanguage(String language) {
        return books.values().stream()
                .filter(book -> book.getLanguage().equalsIgnoreCase(language))
                .collect(Collectors.toList());
    }
}