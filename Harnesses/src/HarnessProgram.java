/* SELF ASSESSMENT

Harness Class: Member variables (8 marks) 8
All my data members are declared, private and the ones that don't change are marked as private. I also have a constant for the maximum number of uses of a harness.
Comment: All my data members are declared, private and the ones that don't change are marked as private. I also have a constant for the maximum number of uses of a harness.

Harness Class: Harness constructor 1 & constructor 2 (6 marks) 6
I initialise all the variables using the parameters given and set the other members to reasonable default values.
Comment: I initialise all the variables using the parameters given and set the other members to reasonable default values.

Harness Class: checkHarness method (5 marks) 5
My method takes an instructor's name as a parameter, and if the harness is not on loan sets the instructor member variable to the given parameter value (assuming the instructor's name is not null/empty). It also resets the number of times the harness was used.
Comment: My method takes an instructor's name as a parameter, and if the harness is not on loan sets the instructor member variable to the given parameter value (assuming the instructor's name is not null/empty). It also resets the number of times the harness was used.

Harness Class: isHarnessOnLoan method (2 marks) 2
My method has no parameters and returns the value of the loan status variable.
Comment: My method has no parameters and returns the value of the loan status variable.

Harness Class: canHarnessBeLoaned method (4 marks) 4
My method has no parameters and returns true if the harness is not on loan and if the number of times it was used is less than the maximum allowed number of times.
Comment: My method has no parameters and returns true if the harness is not on loan and if the number of times it was used is less than the maximum allowed number of times.

Harness Class: loanHarness method (6 marks) 6
My method has a member name as a parameter and it checks if harness can be loaned by using the canHarnessBeLoaned method. If true, it sets the club member value to the parameter value, sets the on loan status to true and increments the number of times used variable.
Comment: My method has a member name as a parameter and it checks if harness can be loaned by using the canHarnessBeLoaned method. If true, it sets the club member value to the parameter value, sets the on loan status to true and increments the number of times used variable.
 
Harness Class: returnHarness method (5 marks) 5
My method has no parameters, checks if the harness is on loan, and if so, changes its on-loan status to false, and resets the club member value.
Comment: My method has no parameters, checks if the harness is on loan, and if so, changes its on-loan status to false, and resets the club member value.

Harness Class: toString method (3 marks) 3
My method returns a String representation of all the member variables.
Comment: My method returns a String representation of all the member variables.

HarnessRecords Class: member variables (3 marks) 3
I declare the member variable as a private collection of Harnesses 
Comment: I declare the member variable as a private collection of Harnesses 

HarnessRecords Class: HarnessRecords constructor 1 & 2 (9 marks) 4
In the first constructor, I set the member variable to null [1 mark]. In the second constructor, I use the set of characteristics in the list to create Harness objects and add them to the collection. 
Comment: In the first constructor, I set the member variable to null [1 mark].

HarnessRecords Class: isEmpty method (1 marks) 1
I return true if the collection is null/empty and, false otherwise.
Comment: I return true if the collection is null/empty and, false otherwise.

HarnessRecords Class: addHarness method (5 marks) 5
My method takes a Harness object as a parameter and adds the harness to the collection.
Comment: My method takes a Harness object as a parameter and adds the harness to the collection.

HarnessRecords Class: findHarness method (6 marks) 6
My method takes a make and model number as parameters. It checks if a harness with such properties exists and if it does it returns harness object, otherwise returns null.
Comment: My method takes a make and model number as parameters. It checks if a harness with such properties exists and if it does it returns harness object, otherwise returns null.

HarnessRecords Class: checkHarness method (6 marks) 6
must take instructor name, make and model number as parameters and return a Harness. If a harness with the make and model number exists by using the findHarness method and is not on loan, the Harness method checkHarness is called with the instructor name as a parameter and the updated Harness object is returned. If the harness is not available returns null.
Comment: must take instructor name, make and model number as parameters and return a Harness. If a harness with the make and model number exists by using the findHarness method and is not on loan, the Harness method checkHarness is called with the instructor name as a parameter and the updated Harness object is returned. If the harness is not available returns null.

HarnessRecords Class: loanHarness method (7 marks) 7
My method takes a club member name as a parameter and looks for an available harness by calling the method canHarnessBeLoaned be loaned. If an available harness is found it is loaned by using the Harness method loanHarness with the club member as a parameter, returning the harness. If there's no available harness null is returned.
Comment: My method takes a club member name as a parameter and looks for an available harness by calling the method canHarnessBeLoaned be loaned. If an available harness is found it is loaned by using the Harness method loanHarness with the club member as a parameter, returning the harness. If there's no available harness null is returned.

HarnessRecords Class: returnHarness method (7 marks) 7
My method takes a make and model number as parameters. It checks if a harness with those properties exists by using the findHarness method. If the found harness is not null, it returns the harness object by using Harness method returnHarness, otherwise returns null.
Comment: My method takes a make and model number as parameters. It checks if a harness with those properties exists by using the findHarness method. If the found harness is not null, it returns the harness object by using Harness method returnHarness, otherwise returns null.


HarnessRecords Class: removeHarness method (8 marks) 8
My method takes a make and model number as parameters and check the collection for a harness with those properties and removes it. It returns the harness object if it is found, otherwise returns null.
Comment: My method takes a make and model number as parameters and check the collection for a harness with those properties and removes it. It returns the harness object if it is found, otherwise returns null.

GUI (Java main line) (5 marks) 5
My test class has a menu which implements at least the five points specified using the HarnessRecords class methods.
Comment: My test class has a menu which implements at least the five points specified using the HarnessRecords class methods.

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class HarnessProgram {

	public static void main(String[] args) {

		HarnessRecords harnessRecords = new HarnessRecords();

		Scanner userInput = new Scanner(System.in);
		userInput.useDelimiter("/|\r\n");

		boolean finished = false;
		
		String make;
	   	int modelNumber;
	   	int numberOfTimesUsed;
	   	String instructor;
	   	boolean onLoan = false;
	   	String borrower;
		
	   	String temp = "";
	   	
		String makeModel;
		Harness harness;

		while (!finished) {

			try {
				
				
				for(int i = 0; i < 2; i++) {
				
					System.out.println("Enter a harness make: ");
					make = userInput.next();
					System.out.println("Enter a harness model number: ");
					modelNumber = userInput.nextInt();
					System.out.println("Enter number of times used: ");
					numberOfTimesUsed = userInput.nextInt();
					System.out.println("Enter an instructor: ");
					instructor = userInput.next();
					System.out.println("Is the harness on loan? ");
					temp = userInput.next();
					
					if(temp.charAt(0) == 'y') {
						
						System.out.println("If so, by whom?");
						borrower = userInput.next();
						
						onLoan = true;
						
					} else {
						
						borrower = "none";
						onLoan = false;
						
					}
						
					
					
					
					harness = new Harness(make, modelNumber, numberOfTimesUsed, instructor, onLoan, borrower);
					
					harnessRecords.addHarness(harness);
					
					System.out.println("Harness added: " + harness);
				
				}
				
				System.out.println(harnessRecords);
				
				System.out.println("Enter a harness make and model to remove: ");
				makeModel = userInput.next();
				harnessRecords.removeHarness(makeModel);
				
				System.out.println("Which harness was checked?: ");
				makeModel = userInput.next();
				
				System.out.println("And by whom?: ");
				instructor = userInput.next();
				harnessRecords.checkHarness(instructor, makeModel);
		
				System.out.println("Who wishes to borrow a harness?: ");
				borrower = userInput.next();
				harnessRecords.loanHarness(borrower);
				
				System.out.println("Which harness was borrowed?: ");
				makeModel = userInput.next();
				harnessRecords.returnHarness(makeModel);
				
				System.out.println(harnessRecords);

				finished = true;

			} catch (InputMismatchException e) {

				System.out.println("Wrong input. Try again.");
				userInput.next();

			}

		}

	}

}
