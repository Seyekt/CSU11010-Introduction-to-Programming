import java.util.Random;
import java.util.Scanner;


public class Cipher {
	
	public static final int LETTERS_IN_THE_ALPHABET = 26;
	public static final int LOWERCASE_A_IN_ASCII = 97;
	public static final int SPACE_IN_ASCII = 32;
	
	
	public static void main(String[] args) {
		
		char[] cipher = new char [LETTERS_IN_THE_ALPHABET + 1];
		createCipher(cipher);
		
		Scanner userInput = new Scanner(System.in);
		
		boolean finished = false;
		
		while(!finished) {
		
			System.out.println("Enter a string (or enter 'quit' to end):");
			
			if (userInput.hasNext("quit")) 
				finished = true;
			
			else {
			
				String userString = userInput.next();
				userString = userString.toLowerCase();
				char[] userArray = userString.toCharArray();
				
				char[] encryptedString = encrypt(userArray, cipher);
				
				System.out.println("Encrypted: ");
				System.out.println(encryptedString);
				System.out.println("Decrypted: ");
				System.out.println(decrypt(encryptedString, cipher));
			
			}
			
		}
		
		userInput.close();
		
	}
	
	
	public static void createCipher(char[] cipher) {
		
		for (int i = 0; i < LETTERS_IN_THE_ALPHABET; i++) {
			
			cipher[i] = (char) (i + LOWERCASE_A_IN_ASCII);
					
		}
		
		cipher[LETTERS_IN_THE_ALPHABET] = SPACE_IN_ASCII; //space
		
		Random generator = new Random();
		
	    for (int index1 = cipher.length - 1; index1 > 0; index1--) {
	    	
	      int index2 = generator.nextInt(index1 + 1);
	      char cipherElement  = cipher[index2];
	      cipher[index2] = cipher[index1];
	      cipher[index1] = cipherElement;
	      
	    }
		
	}
	
		
	public static char[] encrypt(char[]userArray, char[] cipher) {
			
		for (int i = 0; i < userArray.length; i++) {
			
			boolean finished = false;
			
			for (int counter2 = 0; counter2 < LETTERS_IN_THE_ALPHABET && !finished; counter2++) {
				
				if (userArray[i] == counter2 + LOWERCASE_A_IN_ASCII) {
					
					userArray[i] = cipher[counter2 + 1];
					finished = true;
					
				}
					
			}
			
		}
		
		return userArray;
				
	}
	

	public static char[] decrypt(char[] userArray2, char[] cipher) {
		
		
		for (int i = 0; i < userArray2.length; i++) {
			
			boolean finished = false;
					
			for (int counter2 = 0; counter2 < LETTERS_IN_THE_ALPHABET && !finished; counter2++) {
						
				if (userArray2[i] == cipher[counter2 + 1]) {
					
					userArray2[i] = (char)(counter2 + 97);
					finished = true;
					
				}
							
			}
				
		}
		
		return userArray2;	
		
	}
	
	
}