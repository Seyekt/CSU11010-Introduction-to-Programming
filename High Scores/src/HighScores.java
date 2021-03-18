import java.util.Scanner;

public class HighScores {
	
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner( System.in );
		System.out.println("How many scores do you wish to store?");
		
		if (userInput.hasNextInt()) {
	
			int numberOfScores = userInput.nextInt();
			
			if (numberOfScores > 0) {
			
				int[] scores = new int [numberOfScores + 1];
				
				initialiseHighScores (scores);
				
				System.out.println("Please enter a score.");
				
				while (userInput.hasNextInt()) {
					
					int newScore = userInput.nextInt();
					
					if (scores != null && higherThan(scores, newScore) ) 
						insertScore(scores, newScore);
					
						
					printHighScores(scores);
					System.out.println("Please enter another score.");
						
				}
				
			}
			
		}
		
		System.out.println("Please enter positive, whole numbers.");
		userInput.close();	
	}
		
	
	
	public static void initialiseHighScores (int[]scores) {
		
		
		for (int i = 0; i < scores.length - 1; i++) {
					
			if (scores!= null) 
				scores[i] = 0;
			
		}
		
	}
	
	public static void printHighScores(int[] scores) {
		
		System.out.print("The high scores are: ");
		
			for (int i = 0; i < scores.length - 1; i++) {
				
				if (scores[i] != 0) {
					
					System.out.print(scores[i]);
					
					if (scores[i + 1] != 0)
						System.out.print(", ");
					
				}
			}
			
		System.out.println(".\n");
	}
	
	public static boolean higherThan(int []scores, int newScore){
		
		boolean finished = false;
		int index = 0;
		
		while (index < scores.length - 1 && !finished) {
			if (newScore > scores[index])
				finished = true;
			
				index++;
		}
		
		return finished;
		
		
	}
		
	
	public static void insertScore(int []scores, int newScore) {
		
		boolean finished = false;
		int index = 0;
		
		while (index < scores.length - 1 && !finished) {
			
			if (newScore > scores[index]) {
				int temp = scores[index];
				scores[index] = newScore;
				
				for (int i = index; i < scores.length - 1; i++) {
					
					if (temp > scores[i]) {
						
						int temp2 = scores[i];
						scores[i] = temp;
						temp = temp2;
						
					}
					
				}
				finished = true;
			}
			
				index++;
		}
	
		
	}
	
}
