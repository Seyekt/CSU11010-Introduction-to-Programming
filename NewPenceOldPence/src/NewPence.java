import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NewPence {
	
	public static final int OLD_PENCE_IN_NEW_PENCE = 67;
	public static final int SHILLINGS_IN_NEW_PENCE = 804;
	public static final int OLD_POUNDS_IN_NEW_PENCE = 16080;

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int numberOfOldPounds;
		int numberOfShillings;
		int numberOfOldPennies;
		
		while(true){
			try{
				out.print("Enter the number of old pounds: ");
				numberOfOldPounds = userInput.nextInt();
				
				out.print("Enter the number of shillings: ");
				numberOfShillings = userInput.nextInt();
				
				out.print("Enter the number of old pennies: ");
				numberOfOldPennies = userInput.nextInt();
				
				break;
				
		} catch (InputMismatchException e){
			
			out.println("Wrong; Enter numbers!");
			userInput.next();
			
			}
			
		}
		
		
		if (numberOfShillings < 0 || numberOfOldPennies < 0 || numberOfOldPounds < 0){
			
			out.println("Wrong; Enter neutral or positive numbers!");
			System.exit(0) ; 
	
		}
		
		
		userInput.close();
		
		int answerInNewPence = OLD_PENCE_IN_NEW_PENCE *(numberOfOldPennies) + SHILLINGS_IN_NEW_PENCE *(numberOfShillings)
				+ OLD_POUNDS_IN_NEW_PENCE *(numberOfOldPounds); 
		
		double answerInNewPounds = (double)answerInNewPence / 100;
		
		out.printf (numberOfOldPounds + " old pound(s), " + numberOfShillings + " shilling(s) and " + numberOfOldPennies
				+ " old penny/pence = £%.2f", answerInNewPounds);
		
		
		
	}

}