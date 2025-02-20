package bookstore;

import java.util.Scanner;

public class Bookstore {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Welcome to Laura's Book Store! Please, choose one of the options below: ");
			System.out.println("1. Add a book");
			System.out.println("2. Show list of books");
			System.out.println("3. Update book information");
			System.out.println("4. Search for a book");
			System.out.println("5. Delete book");
			System.out.println("6. Exit");
			System.out.print("Choose an option: ");
		
			int option = scanner.nextInt();
			scanner.nextLine();

			switch (option) {
			    case 1:
			    	System.out.println("Adding book");
			    	break;
		    	case 2:
		    		System.out.println("showing book list");
		    		break;
	    		case 3:
	    			System.out.println("updating book.");
	    			break;
			    case 4:
			        System.out.println("searching for a book.");
			        break;
		        case 5:
		        	System.out.println("deleting book.");
		        	break;
	        	case 6:
	        		System.out.println("Exiting!");
	        		scanner.close();
	        		return;
	    		default:
	    			System.out.println("Invalid option, please try again.");
			}
		}
	}
}
