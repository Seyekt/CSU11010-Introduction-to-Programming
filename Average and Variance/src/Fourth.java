/* SELF ASSESSMENT 
   1. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10: 10
       Comment: It is clear what each variable represents, providing one knows what the program does.
   2. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 5: 5
       Comment: Variable names are formatted as the coding standard specifies.
   3. Did I indent the code appropriately? 
       Mark out of 10: 10
       Comment:  Code is indented appropriately.
   4. Did I input the numbers one at a time from the command line?
       Mark out of 10:  10
       Comment: The command line was used to input each number, one after the other.
   5. Did I check the input to ensure that invalid input was handled appropriately?
       Mark out of 10:  10
       Comment: The program can deal with invalid inputs, indeed the program continues to function rather than closing.
   6. Did I use an appropriate while or do-while loop to allow the user to enter numbers until they entered exit/quit?
       Mark out of 20:  20
       Comment: Two 'while' loops were used so that the user may enter their numbers until they enter 'exit' or 'quit'.
   7. Did I implement the loop body correctly so that the average and variance were updated and output appropriately?
       Mark out of 30:  30
       Comment: The program computes the average and variance correctly within the loop body. 
   8. How well did I complete this self-assessment? 
       Mark out of 5: 5
       Comment: I put in an appropriate mark and a comment for each criterion.
   Total Mark out of 100 (Add all the previous marks): 100
*/

import java.util.Scanner;


public class Fourth {
	
	public static void main(String[] args) {
		
		boolean finished = false;
		double n = 1;
		double variance = 0;
			
		Scanner userInput = new Scanner(System.in);	
		
		System.out.println("This program computes the average and variance of all numbers entered. \nEnter a number (or type 'exit' or 'quit'): ");
		
		while (!finished) {
		
			if (userInput.hasNextDouble()) {
				double average = userInput.nextDouble(); // The first number is always the average while it is the only number.
			
				System.out.println("So far the average is " + average + " and the variance is " + variance);
				
				while(!finished) {
				
					System.out.println("Enter another number (or type 'exit' or 'quit'): ");
				
					if (userInput.hasNextDouble()) {
					
						double inputNumber = userInput.nextDouble();
					
						double previousAverage = average;
						average =  average + ( (inputNumber - average) / ++n);
						
						variance = ((variance * (n - 1)) + (inputNumber - previousAverage) * (inputNumber - average)) / n;
					
						System.out.println("So far the average is " + average + " and the variance is " + variance);
					
					}else if (userInput.hasNext("exit") || userInput.hasNext("quit"))
						finished = true;
					
					else {
						System.out.println("Not a valid number. Try again.");
						userInput.next();
					}
				
				}
			
			} else if (userInput.hasNext("exit") || userInput.hasNext("quit"))
			
				finished = true;
		
			else {
				System.out.println("Not a valid number. Try again.");
				userInput.next();
			}	
			
		} 
		
		userInput.close();
		
		System.out.println("\nGoodbye.");
	
		
	}

	
}



