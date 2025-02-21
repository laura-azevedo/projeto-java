package bookstore;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import bookstore.models.Book;
import bookstore.models.ChildrenBook;
import bookstore.models.Textbook;
import bookstore.service.BookService;

public class Bookstore {

	public static void main(String[] args) {
	    BookService bookService = new BookService();
		Scanner scanner = new Scanner(System.in);   
		int option;
		
		/** p testar
		bookService.addBook(new Textbook(bookService.idGenerator(), "Algoritmo 1", "autor 1", "123", "Computer Science", "MIT Press", 89.99f, 1111, "English", "Undergrads", "Advanced", "MIT"));
        bookService.addBook(new Textbook(bookService.idGenerator(), "Fisica", "autor 3", "456", "Physics", "editora 3", 79.99f, 2222, "German", "Undergrads", "Intermediate", "Stanford"));
        bookService.addBook(new Textbook(bookService.idGenerator(), "Quimica", "autor 3", "789", "Chemistry", "editora 3", 74.99f, 3333, "English", "Undergrads", "Advanced", "Harvard"));
        bookService.addBook(new Textbook(bookService.idGenerator(), "Graça infinita", "David Foster Wallace", "101112", "tema", "editora 3", 79.99f, 4444, "Korean", "Undergrads", "Intermediate", "Cambridge"));
        bookService.addBook(new Textbook(bookService.idGenerator(), "Breves entrevistas com homens hediondos", "David Foster Wallace", "131415", "aaaaa", "W. W. Norton & Company", 89.99f, 5555, "English", "Undergrads", "Beginner", "Yale"));

        bookService.addBook(new ChildrenBook(bookService.idGenerator(), "Chapeuzinho Vermelho", "autor 1", "111", "Fiction", "World Publishing", 12.99f, 32, "English", "toddler", "growth", "matematica"));
        bookService.addBook(new ChildrenBook(bookService.idGenerator(), "Cinderela", "autor 1", "222", "Fantasy", "Harper & Row", 14.99f, 48, "German", "child", "adventure", "development"));
        bookService.addBook(new ChildrenBook(bookService.idGenerator(), "O segredo da casa amarela", "autor 1", "333", "Classic", "HarperCollins", 18.99f, 192, "English", "pre-teen", "friendship", "kindness"));
        bookService.addBook(new ChildrenBook(bookService.idGenerator(), "Matilda", "autora 2", "444", "Fantasy", "editora xyz", 10.99f, 240, "English", "pre-teen", "intelligence", "love for learning"));
        bookService.addBook(new ChildrenBook(bookService.idGenerator(), "Boa noite", "autora 2", "555", "Fiction", "editora xyz", 9.99f, 32, "German", "toddler", "family", "bedtime routine"));
**/
		while (true) {
			
				System.out.println("Welcome to Laura's Book Store! Please, choose one of the options below: ");
				System.out.println("1. Add a book");
				System.out.println("2. Show list of books");
				System.out.println("3. Update book information");
				System.out.println("4. Search for a book");
				System.out.println("5. Delete book");
				System.out.println("6. Exit");
				System.out.print("Choose an option: ");
			
				
				try {
					option = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("That's not a valid input! Please, type a number. ");
					scanner.nextLine();
					option = 0;
		        } 
				
				if (option == 6) {
					System.out.println("Goodbye!");
					scanner.close();
					System.exit(0);
				}
				

				switch (option) {
				    case 1:
				    	System.out.println("Adding book");
				    	keyPress();
				    	break;
			    	case 2:
			    		bookService.listAllBooks();
			    		keyPress();
			    		break;
		    		case 3:
		    			System.out.println("updating book.");
		    			keyPress();
		    			break;
				    case 4:
				    	bookSearch(scanner, bookService);
				        keyPress();
				        break;
			        case 5:
			        	System.out.println("What's the book's id? ");			        	
			        	keyPress();
			        	break;
		    		default:
		    			System.out.println("Invalid option, please try again.");
		    			keyPress();
		    			break;
				}
				

		}
	}
	
	public static void bookSearch(Scanner scanner, BookService bookService) {
		
		int searchOption;

		System.out.println("What do you want to search by? "); 
		System.out.println("1. Title"); 
		System.out.println("2. Author"); 
		System.out.println("3. Genre"); 
		System.out.println("4. Publisher"); 
		System.out.println("5. Language");
		
		while (true) {
			try {
				searchOption = scanner.nextInt();
				scanner.nextLine();
				if (searchOption < 1 || searchOption > 5) { 
					System.out.println("That option is not valid. Please, try one of the options on the menu.");
					continue;
				}
				break;
			} catch(InputMismatchException e) {
				System.out.println("That's not a valid input. Please, type a number."); 
				scanner.nextLine();
			}
		}
		
		System.out.print("Enter the search term: "); 
		String searchTerm = scanner.nextLine(); 
		List<Book> results = 
				switch (searchOption) { 
					case 1 -> bookService.findByTitle(searchTerm); 
					case 2 -> bookService.findByAuthor(searchTerm); 
					case 3 -> bookService.findByGenre(searchTerm); 
					case 4 -> bookService.findByPublisher(searchTerm); 
					case 5 -> bookService.findByLanguage(searchTerm); 
					default -> List.of(); }; 
						if (results.isEmpty()) 
							System.out.println("No results.");
						else 
							results.forEach(book -> book.displayInfo(true)); 
	}
	
	public static void keyPress() {
		try {
			System.out.println("\nType Enter to continue...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("You've typed a different key!");
		}
	}
}
