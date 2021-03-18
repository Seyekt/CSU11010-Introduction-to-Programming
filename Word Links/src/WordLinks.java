import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;



public class WordLinks {
	
	public static String[] dictionary = readDictionary();

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter a comma separated list of words (or an empty list to quit): ");
		
		String[] listToCheck = readWordList();
		
		if(isWordChain(listToCheck)) {
			System.out.println("Valid chain of words from Lewis Carroll's word-links game.");
		}	
		
		

	}
	
	
	
	public static String[] readDictionary() {
		
		ArrayList<String> words = new ArrayList<String>();
		
		try {
			
			FileReader fileReader = new FileReader("words.txt");// Enter the entire path of the file if needed
			BufferedReader bufferedReader = new BufferedReader(fileReader);  
			boolean endOfFile = false;
	        while(!endOfFile){
	        	String dictionaryLine = bufferedReader.readLine();
	        	if (dictionaryLine != null) {
	        		words.add(dictionaryLine);
	        	} else {
	        		endOfFile = true;
	        	}
	        }
	        
	        bufferedReader.close();    
	        fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return words.toArray(new String[words.size()]);
		
	}
	
	public static String[] readWordList() {
		
		boolean finished = false;
		
		ArrayList<String> wordList = new ArrayList<String>();
		
		Scanner userInput = new Scanner(System.in);
		userInput.useDelimiter("[,\n]");
		
		if (!finished && userInput.hasNext()) {
			String newWord = userInput.next();
			wordList.add(newWord);
			
			if(!userInput.hasNext()) {
				finished = true;
			}
		}
		
		System.out.println("Enter a comma separated list of words (or an empty list to quit): ");
		
		return wordList.toArray(new String[wordList.size()]);
		
	}
	
	public static boolean isUniqueList(String[] listToCheck){
		
		boolean isUniqueList = true;
		
		for (int i = 0; i < listToCheck.length; i++) {
			
			for (int j = 0; j < listToCheck.length; j++) {
			
				if( (listToCheck[i]).equals(listToCheck[j]) ) {
					 isUniqueList = false;
				}	
			}
			
		}
		
		
		return isUniqueList;
		
	}
	
	public static boolean isEnglishWord(String wordToCheck) {
		
		return (Arrays.binarySearch(dictionary, wordToCheck) >= 0 );
		
	}
	
	public static boolean isDifferentByOne(String one, String two){
		
		int differencesAllowed = 1;
		
		if ( one.length() == two.length()) {
		
			for(int i = 0; i < one.length(); i++) {
				
				if(one.charAt(i) != two.charAt(i)) {
					
					differencesAllowed--;
					
					if(differencesAllowed < 0) { 
	                    return false; 
	                }
					
				}
				
			}
			
			return true;
		}
		
		return false;
		
	}
	
	public static boolean isWordChain(String[] listToCheck){
		
		boolean isWordChain = true;
		
		if(isUniqueList(listToCheck)) {
			
			for (int i = 1; i < listToCheck.length; i++) {
				
				if(!(isEnglishWord(listToCheck[i - 1]) && isEnglishWord(listToCheck[i]) && isDifferentByOne(listToCheck[i - 1], listToCheck[i]) ) ) {
					isWordChain = false;
				}
				
			}
		
		}
		
		
		
		return isWordChain;
		
	}
	
	

}
