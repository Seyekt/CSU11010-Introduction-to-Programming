import java.util.Scanner;
import java.util.InputMismatchException;


public class Test {
	
	public static void main(String[] args) {
		
		boolean prime = false;
		
		System.out.println("Please enter a positive whole number: ");
		Scanner userInput = new Scanner(System.in);
		int counter = 1;
		int divisor = 1;
		int num = 0;
		
		while(true){
			try {
				num = userInput.nextInt();
				break; 
				
			} catch (InputMismatchException e){
				System.out.println("Wrong; Enter numbers!");
				userInput.next();
			}
			
		}
		
		System.out.print("The factors of " + num + " are ");
					
		for(divisor = 1; divisor != num; divisor++) {
						
			int factor = num / divisor;
						
						
						
			if (num % divisor == 0){
				System.out.print (counter + "x" + factor + ", ");
			}
						
			++counter;
					
		}
					
			
		System.out.println(".\n\n");
		
		if (counter == 1)
			prime = true;
			
		
		if (prime){
			System.out.println( num + " is a prime number.");
		} else {
			System.out.println( num + " is not a prime number.");
		}
			
		userInput.close();
				
			
			
		}
	
	
	}
	
