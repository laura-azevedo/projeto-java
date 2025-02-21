package bookstore.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

import bookstore.interfaces.BookOperations;
import bookstore.models.Book;

public class BookService implements BookOperations {
	
    private List<Book> books = new ArrayList<>();
    
    private int number = 0;

    @Override
    public void addBook(Book book) {
    	 int bookId = idGenerator();
    	 book.setBookId(bookId);
    	 books.add(book);
    	 System.out.println("Book added: " + book.getTitle());
    }

    @Override
    public void updateBook(int bookId, Book updatedBook) { 
    	Book book = getBookById(bookId);
    	if (book == null) { 
    		System.out.println("Book not found."); 
    		return; 
    	}
    	int index = books.indexOf(book); 
    	books.set(index, updatedBook);
		System.out.println("Book updated: " + updatedBook.getTitle()); 
	}

    @Override
    public void deleteBook(int bookId) {
    	Book book = getBookById(bookId); 
    	if (book == null) { 
    		System.out.println("Book not found."); 
    		return; 
    	} 
    	books.remove(book);
    	System.out.println("The book was deleted.");
	}

    @Override
    public Book getBookById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void listAllBooks() { 
    	if (books.isEmpty()) { 
    		System.out.println("There are no books available. "); 
    		return;
    	}
    	books.forEach(book -> book.displayInfo(true));
    }

    @Override
    public List<Book> findByAuthor(String author) { 
    	return books.stream()
    			.filter(book -> book.getAuthor().equalsIgnoreCase(author))
    			.collect(Collectors.toList()); 
    	}

	@Override
    public List<Book> findByGenre(String genre) { 
    	return books.stream()
    			.filter(book -> book.getGenre().equalsIgnoreCase(genre))
    			.collect(Collectors.toList()); 
    	}

	@Override 
    public List<Book> findByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

	@Override
    public List<Book> findByPublisher(String publisher) {
        return books.stream()
                .filter(book -> book.getPublisher().equalsIgnoreCase(publisher))
                .collect(Collectors.toList());
    }

	@Override
    public List<Book> findByLanguage(String language) {
        return books.stream()
                .filter(book -> book.getLanguage().equalsIgnoreCase(language))
                .collect(Collectors.toList());
    }
	
	public int idGenerator() { 
		return ++ number; 
	}
}