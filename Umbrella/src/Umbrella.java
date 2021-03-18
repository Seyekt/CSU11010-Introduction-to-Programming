/* SELF ASSESSMENT 
   1. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10: 8
       Comment: Could not think of a better name for the string that is converted to a character.
   2. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 10: 10
       Comment: Variable names are formatted as the coding standard specifies.
   3. Did I indent the code appropriately? 
       Mark out of 10: 7
       Comment: I believe I indented the code to the best of my ability but it may still be hard to read.
   4. Did I read the input correctly from the user using appropriate questions? 
       Mark out of 20: 20
       Comment: I took the user's input using easy to understand English sentences.
   5. Did I use an appropriate (i.e. not more than necessary) series of if statements? 
       Mark out of 30: 25
       Comment: I reused the code checking for 'y' or 'n' instead of putting this in a function.
   6. Did I output the correct answer for each possibility in an easy to read format? 
       Mark out of 15: 15
       Comment: Gave the answer in easy to understand English sentences.
   7. How well did I complete this self-assessment? 
       Mark out of 5: 5
       Comment: Gave an appropriate score and comment for each heading.
   Total Mark out of 100 (Add all the previous marks): 90
*/

import static java.lang.System.out;
import java.util.Scanner;

public class Umbrella {
	

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		out.println("Is it raining now? (y/n)");
		String answerString = userInput.next();
		char yesNo = answerString.charAt(0);
		
		if (yesNo != 'y' && yesNo != 'n') {
		
		out.println("You may only enter a lowercase 'y' or 'n'.");
			
		System.exit(0); 
		
		} else if (yesNo == 'n') {
		
			out.println("Does it look like it might rain? (y/n)");
			answerString = userInput.next();
			yesNo = answerString.charAt(0);
			
			if (yesNo != 'y' && yesNo != 'n') {
				
				out.println("You may only enter a lowercase 'y' or 'n'.");
					
				System.exit(0); 
			
			} else if (yesNo == 'n') {
				
				out.println("You needn't bring an umbrella.");
				
			} else {
				out.println("Bring an umbrella but don't put it up.");
			}
			
			
		} else {
			
			out.println("Bring an umbrella.");
		
		}
		
		userInput.close();
		
		}
		
	}



