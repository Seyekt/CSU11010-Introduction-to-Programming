import java.util.Scanner;
import java.util.Random;


public class HiLo {
	
	public static final int MAX_NUMBER = 12; // + 2
	
	
	public static void main(String[] args) {
		
		boolean finished = false;
		int successes = 0;
	
		Scanner userInput = new Scanner(System.in);	
		Random generator = new Random();
		
		int cardNumber = generator.nextInt(MAX_NUMBER) + 2;
		String cardString = "";
		
		System.out.println("Welcome to the Hi-Lo Card Game! Will the next card be higher or lower? Get four right in a row to win. \nEnter 'higher', 'lower' or 'same' (or type 'exit' or 'quit') ");
		
		while (!finished && successes < 4) {
			
			switch (cardNumber) {
			
			case 11: cardString = "jack"; 
					break;
			case 12: cardString = "queen";
					break;
			case 13: cardString = "king";
					break;
			case 14: cardString = "ace";
					break;
					
			}
			
			if (cardNumber <= 10) 
				System.out.println ("\nThe card is a " + cardNumber + ".");
			else
				System.out.println ("\nThe card is a " + cardString + ".");
			
			int last = cardNumber;
			cardNumber= generator.nextInt(MAX_NUMBER) + 1;
			
			System.out.print ("Do you think the next card will be higher, lower or equal? ");
			
			if (userInput.hasNext("higher")) {
			
				if (cardNumber > last) {
					System.out.println("Success! The next card is higher");
					successes++;
				} else {
					System.out.println("Failure...");
					successes = 0;
				}
				
			} else if (userInput.hasNext("lower")) {
				
				if (cardNumber < last) {
					System.out.println("Success! The next Card is lower.");
					successes++;
				} else {
					System.out.println("Failure...");
					successes = 0;
				}
				
			} else if (userInput.hasNext("same")) {
				
				if (cardNumber == last) {
					System.out.println("Success! The next Card is the same.");
					successes++;
				} else {
					System.out.println("Failure...");
					successes = 0;
				}
				
			} else if (userInput.hasNext("exit") || userInput.hasNext("quit")) {
			
				finished = true;
		
			} else {
				System.out.println("Not a valid input. Try again.");
			}	
			
			userInput.next();
			
		} 
		
		userInput.close();
		
		if (successes == 4) {
			System.out.println("\nCongratulations!  You got them all right.");
		}
		
		System.out.println("\nGoodbye.");
	
		
	}

	
}