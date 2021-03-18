import java.util.Scanner;

public class SieveOfEratosthenes {
	
	public static void main(String[] args) {
		
		
		System.out.print("Enter a whole-number value for N that is greater than or equal to 2: ");
		Scanner userInput = new Scanner(System.in);	
		
		if ( userInput.hasNextInt() ) {
	
			int N = userInput.nextInt();
			
			if (N >= 2) {
			
				int[][] sieve = createSequence(N);
				
				sieve (sieve);
				
				for (int i = 0; i < sieve.length; i++) {
					System.out.print(sieve[i][0] + ", ");
				}
				
				
				System.out.println("\n" + sequenceToString(sieve) );
				
				System.out.println(nonCrossedOutSubseqToString(sieve) );
				
			}
			
			
		}
		
		
		userInput.close();
		
		
	}
	
	public static int[][] createSequence(int N) {
		
		int[][] sieve = new int [N - 1][2];
		
		for (int i = N - 2; i >= 0; i--) {
			
			sieve[i][0] = i + 2;
			
		}
		
		return sieve;
	}
	
	public static void crossOutHigherMultiples (int sieve[][], int n) {
		
		int multipleOfN = n * 2;
		
		for (int i = 3; multipleOfN - 2 < sieve.length; i++) {
			
			sieve[multipleOfN - 2][1] = 1;		// subtract 2 for 10 is in the the eighth place of the array, 9 in the seventh, etc. 
			multipleOfN = n * i; 
			
			
		}
		
		
		
	}
	
	public static int[][] sieve (int sieve[][]) {
		
		for (int i = 0; i < sieve.length; i++) {
			
			if (sieve[i][1] != 1) {
				
				crossOutHigherMultiples (sieve, sieve[i][0]);
				
			}
			
		}
		
		return sieve;
	}
	
	
	public static String sequenceToString (int sieve[][]) {
		
		
		String sieveString = "";
		
		for (int i = 0; i < sieve.length; i++) {
			
			if (sieve[i][1] == 1) {
				
				sieveString = sieveString + "[" + sieve[i][0] + "], " ;
				
			} else {
			
				sieveString = sieveString + sieve[i][0] + ", ";
			
			}
			
		}
		
		return sieveString;
				
		
	}
	
	public static String nonCrossedOutSubseqToString (int sieve[][]) {
		
		String sieveString = "";
				
		for (int i = 0; i < sieve.length; i++) {
					
			if (sieve[i][1] == 0) {
						
				sieveString = sieveString + sieve[i][0] + ", ";
						
			}
					
		}
		
				
		return sieveString;
		
	}

}