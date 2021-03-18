import java.util.Scanner;
import java.util.InputMismatchException;

public class Test {
	
	public static void main(String[] args) {
		
		boolean finished = false;
		
		System.out.println("Enter the number of Stones, Pounds and Ounces seperated by spaces (or enter 'quit')");	
		
		Scanner userInput = new Scanner(System.in);	
//		userInput.useDelimiter("/|\r\n");
		
		while (!finished) {
			
			try {
				
				if(userInput.hasNext("quit"))
					finished = true;
				
				else {
					
					double stones = userInput.nextDouble();
					double pounds = userInput.nextDouble();
					double ounces = userInput.nextDouble();
				
					System.out.println(getFormattedWeightString (stones, pounds, ounces));
				
				}
				
				userInput.next();
					
			} catch (java.util.InputMismatchException e) {
				System.out.println("That is not a valid weight. Please enter it in the correct format.");
				finished = true;
			}
			
		}
		
		System.out.println("Goodbye.");	
		userInput.close();
		
	}
	

	
	public static String getFormattedWeightString (double stones, double pounds, double ounces) {
	
		String stoneString = (stones + " stones, ");	
		String poundString = (pounds + " pounds, ");
		String ounceString = (ounces + " ounces ");	
		
		
		if (stones == 0) {
			stoneString = "";
		} else if (stones == 1){
			stoneString = "1 stone,";	
		}
		
		if (pounds == 0) {
			poundString = "";
		} else if (stones == 1){
			poundString = " 1 pound,";	
		}
		
		if (ounces == 1){
			ounceString = "1 ounce ";	
		}
			
		String formatted = (stoneString + poundString + " and " + ounceString + "is equal to " + convertToKilograms (stones, pounds, ounces) + "kg.");
	
		return formatted;
	}

	
	public static double convertToKilograms (double stones, double pounds, double ounces) {
		
		return (ounces + (pounds * 16) + (stones * 16 * 14)) * 0.02834952;
		
	}
}