/* SELF ASSESSMENT 
   1. Did I use appropriate CONSTANTS instead of numbers within the code?  
       Mark out of 5: 5
       Comment: Declared three constants in place of numbers, making it clear what each one represented.
   2. Did I use easy-to-understand, meaningful CONSTANT names? 
       Mark out of 5: 4
       Comment: It is clear what each constant represents, providing one knows what the program does.
   3. Did I format the CONSTANT names properly (in UPPERCASE)? 
       Mark out of 5: 5
       Comment: Constant names are formatted as the coding standard specifies.
   4. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10: 9
       Comment: Variable names may be hard to understand if one does not fully know what the program does.
       	In particular, I could not think of a better name for 'yearSquareOfAge'.
   5. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 10: 10
       Comment: Variable names are formatted as the coding standard specifies.
   6. Did I indent the code appropriately? 
       Mark out of 10: 10
       Comment: Code is indented appropriately.
   7. Did I use an appropriate for loop to test all possibilities?  There should be only one. 
       Mark out of 20:  20
       Comment: Used a 'for' loop instead of a 'while' loop, as instructed. The only possibility is wholly tested.
   8. Did I correctly check if people alive today were or could be alive in a year that is the square of their age in that year. 
       Mark out of 30:  30
       Comment: The program behaves as intended.
   9. How well did I complete this self-assessment? 
       Mark out of 5: 5
       Comment: Put in an appropriate mark and a comment for each criterion.
   Total Mark out of 100 (Add all the previous marks): 99
*/


public class SquaredAges {
	
	public static final int MAXIMUM_AGE = 123;
	public static final int CURRENT_YEAR = 2042;
	
	public static void main(String[] args) {
		
		
		for (int age = 0; (age <= MAXIMUM_AGE); age++) {
			
			int yearSquareOfAge = (int)java.lang.Math.pow(age, 2);
			int yearOfDeath = (MAXIMUM_AGE - age) + yearSquareOfAge;
			int yearOfBirth = yearSquareOfAge - age;
		
			
			if ( (yearOfDeath >= CURRENT_YEAR) && (yearOfBirth <= CURRENT_YEAR) ) {
			
				System.out.println ( "A person who is " + age + " years old in the year " + yearSquareOfAge + " AD will have an age that is the square root of the year.");
			
			
			}
				
		}
		
	}
	
}

/*
import static java.lang.System.out;
import java.util.Scanner;

public class eTest {

	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		out.print("Enter a natural number: ");
		int number = user_input.nextInt();
		user_input.close();
		
		if (number <= 0) {
			out.print("Not a natural number");
		} else {
			
			out.println("The numbers whose squares are less than or equal to " + number + " are:");
			
			int squared = number;
			
			
			while (squared > 0){
				 int root = (int)Math.sqrt(squared);
				 out.println(root);
				 squared--;
			}
			
			out.print(".");
			
		}
		
		
	}

}

 */

