import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineBookStore {
	
	public static int ISBN_INDEX = 0;
	public static int TITLE_INDEX = 1;
	public static int AUTHOR_INDEX = 2;
	public static int PUBLISHER_INDEX = 3;
	public static int PUBLISHER_YEAR_INDEX = 4;
	public static int QUANTITY_INDEX = 5;
	public static int PRICE_INDEX = 6;
	
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<Book>();
		try {
			FileReader fileReader = new FileReader("books.txt");// Enter the entire path of the file if needed
			BufferedReader bufferedReader = new BufferedReader(fileReader);  
			boolean endOfFile = false;
	        while(!endOfFile){
	        	String bookLine = bufferedReader.readLine();
	        	if (bookLine != null) {
	        		String[] bookData = bookLine.split(", ");
	        		String isbn = bookData[ISBN_INDEX];
	        		String title = bookData[TITLE_INDEX];
	        		String author = bookData[AUTHOR_INDEX];
	        		String publisher = bookData[PUBLISHER_INDEX];
	        		int publishYear = Integer.parseInt (bookData[PUBLISHER_YEAR_INDEX]);
	        		int quantity = Integer.parseInt (bookData[QUANTITY_INDEX]);
	        		double price = Double.parseDouble (bookData[PRICE_INDEX]);
	        		Book book = new Book(isbn, title, author, publisher, publishYear, quantity, price);
	        		bookList.add(book);

	        	} else {
	        		endOfFile = true;
	        	}
	        }
	        
	        bufferedReader.close();    
	        fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		printBookDetails(bookList);
		purchaseBook(bookList);
	}
	
	public static void printBookDetails(ArrayList<Book> bookList) {
		for(int i = 0; i < bookList.size(); i++) {
			Book book = bookList.get(i);
			System.out.println(book);
		
		}
	}
	
	public static Book getBook(ArrayList<Book> bookList, String title) {
		
		Book book;
		
		for(int i = 0; i < bookList.size(); i++) {
			book = bookList.get(i);
			if (book.getTitle().equals(title)) {
				
				return book;
				
			}
		
		}
		
		return null;
		
	}
	
	public static void topUpCard(ChargeCard card, double amount) {
		
		card.topUpFunds(amount);
		
	}
	
	public static void purchaseBook(ArrayList<Book> bookList) {
		
		String title = " ";
		Scanner userInput = new Scanner(System.in);
		Scanner userInput2 = new Scanner(System.in);
		 
		
		System.out.println("Enter an amount: ");
		double amount = userInput.nextDouble();
		ChargeCard card = new ChargeCard();
		topUpCard(card, amount);
		
		boolean finished =  false;
		
		while(!finished){
			
			System.out.println("Which book?");
			title = userInput2.nextLine();
			
			Book book1 = getBook(bookList, title);
			
		
			if (book1.getQuantity() > 0 && card.getFunds() > 0) {

				for(int i = 0; i < bookList.size(); i++) {
					
					Book book = bookList.get(i);
					
					if ( book == bookList.get(i)) {
						
						bookList.get(i).setQuantity(bookList.get(i).getQuantity() - 1); 
						
					}
				
				}
				
				System.out.println("Book purchased.");
			}
			
			printBookDetails(bookList);
			
			
		
			
			
			
		}
		
	}	
		
}