/* SELF ASSESSMENT 

Class Rational 
I declared two member variables: numerator and denominator (marks out of 4: 4).
Comment: declared two member variables: numerator and denominator

Constructor 1 
My program takes two integers as parameters (for numerator and denominator) and initialises the member variables with the corresponding values. If the denominator is equal to 0 I throw an exception (marks out of 5: 5).
Comment: The program takes two integers as parameters (for numerator and denominator) and initialises the member variables with the corresponding values. If the denominator is equal to 0 an exception is thrown.

Constructor 2 
My program takes only one integer as parameter (numerator), and set the numerator to this value . I set the denominator to 1 in this case, as the resulting rational number in this case is an integer (marks out of 3: 3).
Comment: The program takes only one integer as parameter (numerator), and sets the numerator to this value. I set the denominator to 1 in this case, as the resulting rational number in this case is an integer.

Add Method 
My program takes only a rational number as a parameter and returns a new rational number which has a numerator and denominator which the addition of the two objects - this and the parameter. My program does not overwrite any of the other two rational numbers (marks out of 8: 8).
Comment: The program takes only a rational number as a parameter and returns a new rational number which has a numerator and denominator which the addition of the two objects - this and the parameter. My program does not overwrite any of the other two rational numbers

Subtract Method 
I have implemented this the same as add method, except it implements subtraction (marks out of 8: 8).
Comment:  This is implemented the same as add method, except it implements subtraction

Multiply Method 
I have implemented this the same as add method, except it implements multiplication (marks out of 8: 8).
Comment: I have implemented this the same as add method, except it implements multiplication.

Divide Method 
I have implemented this the same as add method, except it implements divide (marks out of 8: 8).
Comment: I have implemented this the same as add method, except it implements divide.

Equals Method 
My program takes a rational number as a parameter and compares it to the reference object. I only use multiplication between numerators/denominators for the purpose of comparison, as integer division will lead to incorrect results. I return a boolean value ((marks out of 8: 8).
Comment: My program takes a rational number as a parameter and compares it to the reference object. I only use multiplication between numerators/denominators for the purpose of comparison, as integer division will lead to incorrect results. I return a boolean value.

isLessThan 
My program takes a rational number as a parameter and compares it to the reference object. I only use multiplication as integer division will lead to incorrect results. I return a boolean value (marks out of 8: 8).
Comment: My program takes a rational number as a parameter and compares it to the reference object. I return a boolean value.

Simplify Method 
My program returns a rational number but not a new rational number, instead it returns the current reference which is this. It doesn't take any parameters as it works only with the reference object. I first find the greatest common divisor (GCD) between the numerator and denominator, and then obtain the new numerator and denominator by dividing to the GCD (marks out of 8: 8).
Comment: My program returns a rational number but not a new rational number, instead it returns the current reference which is this. It doesn't take any parameters as it works only with the reference object. I first find the greatest common divisor (GCD) between the numerator and denominator, and then obtain the new numerator and denominator by dividing to the GCD.

gcd function 
My program returns the greatest common divisor of two integers: the numerator and the denominator (marks out of 6: 6).
Comment: The program returns the greatest common divider of two integers: the numerator and the denominator

toString Method 
The program returns a string showing the fraction representation of the number, eg. "1/2". It takes no parameters (marks out of 4: 4).
Comment: The program returns a string showing the fraction representation of the number, eg. "1/2". It takes no parameters.

Test Client Class 
My program asks the user for two rational numbers, creates two rational objects using the constructor and passing in the provided values, calls addition, subtraction, multiplication, division, comparison and simplification and prints out the results (marks out of 22: 22).
Comment: My program asks the user for two rational numbers, creates two rational objects using the constructor and passing in the provided values, calls addition, subtraction, multiplication, division, comparison and simplification and prints out the results.
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class RationalTest {

	public static void main(String[] args) {
   	 	
    	Scanner userInput = new Scanner(System.in);
    	userInput.useDelimiter("/|\r\n");
    	
    	int numerator1 = -1;
    	int denominator1 = -1;
    	
    	int numerator2 = -1;
    	int denominator2 = -1;
   	 	
    	boolean finished = false;
    	
    	while(!finished) {
    		
	    	try {
				
	    		System.out.println("Enter your first rational number in the form 'a/b': ");
	    		numerator1 = userInput.nextInt();
	        	denominator1 = userInput.nextInt();
				
				finished = true;
				
	    	} catch (InputMismatchException e) {
			
	    		System.out.println("Wrong; Enter whole numbers!");
	    		userInput.next();
			
			}

    	}
    	
    	finished = false;
    	
    	while(!finished) {
    		
	    	try {
				
	    		System.out.println("Enter your second rational number in the form 'a/b': ");
	        	numerator2 = userInput.nextInt();
	        	denominator2 = userInput.nextInt();
	        	
				finished = true;
				
	    	} catch (InputMismatchException e) {
			
	    		System.out.println("Wrong; Enter whole numbers!");
	    		userInput.next();
			
			}

    	}
    	
    	
    	
    	
   	 
    	Rational userRational1 = new Rational(numerator1, denominator1);
    	Rational userRational2 = new Rational(numerator2, denominator2);
    	
    	System.out.println("Added: " + userRational1.add(userRational2) + "\n" +
    			"Subtracted: " + userRational1.subtract(userRational2) + "\n" +
    	   		 "Multiplied: " + userRational1.multiply(userRational2) + "\n" +
    	   		 "Divided: " + userRational1.divide(userRational2) + "\n" +
    	   		 "Do they equal one another?: " + userRational1.equals(userRational2) + "\n" +
    	   		 "Is one less than the other?: " + userRational1.isLessThan(userRational2) + "\n" +
    	   		 "Simplified: " + userRational1.simplify() + ", " + userRational2.simplify());
   	 
    	userInput.close();

	}

}
