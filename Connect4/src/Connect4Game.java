/* SELF ASSESSMENT

Connect4Game class (35 marks)
My class creates references to the Connect 4 Grid and two Connect 4 Players. It asks the user whether he/she would like to play/quit inside a loop. If the user decides to play then: 1. Connect4Grid2DArray is created using the Connect4Grid interface, 2. the two players are initialised - must specify the type to be ConnectPlayer, and 3. the game starts. In the game, I ask the user where he/she would like to drop the piece. I perform checks by calling methods in the Connect4Grid interface. Finally a check is performed to determine a win. 
Comment:

Connect4Grid interface (10 marks)
I define all 7 methods within this interface.
Comment:

Connect4Grid2DArray class (25 marks) 
My class implements the Connect4Grid interface. It creates a grid using a 2D array Implementation of the method to check whether the column to drop the piece is valid. It provides as implementation of the method to check whether the column to drop the piece is full. It provides as implementation of the method to drop the piece.  It provides as implementation of the method to check whether there is a win.
Comment:

ConnectPlayer abstract class (10 marks)
My class provides at lest one non-abstract method and at least one abstract method. 
Comment:

C4HumanPlayer class (10 marks)
My class extends the ConnectPlayer class and overrides the abstract method(s). It provides the Human player functionality.
Comment:

C4RandomAIPlayer class (10 marks)
My class extends the ConnectPlayer class and overrides the abstract method(s). It provides AI player functionality. 
Comment:

Total Marks out of 100: 100

*/

import java.util.Scanner;

public class Connect4Game {
	
	public final int NUMBER_OF_SLOTS = 42;
	public final int NUMBER_OF_ROWS = 6;
	public final int NUMBER_OF_COLUMNS = 7;
	
	public static void main(String[] args) {
		
		ConnectPlayer playerOne = null;
		ConnectPlayer playerTwo = null;
		Connect4Grid2DArray theGrid = new Connect4Grid2DArray();
		
		theGrid.emptyGrid();
		System.out.println(theGrid);
		
		Scanner userInput = new Scanner(System.in);
		boolean finished = false;
		while (!finished) {
		
		System.out.println("Single (1) or Two Player (2)?: ");
		
		String playerOneString = userInput.next();
		
		
		if(playerOneString.equals("Human")||playerOneString.equals("human"))
		{
			playerOne = new C4HumanPlayer('R');
		}
		else if(playerOneString.equals("AI")||playerOneString.equals("ai"))
		{
			playerOne = new C4RandomAIPlayer('R');
		}
		else if(playerOneString.equals("Quit")||playerOneString.equals("quit"))
		{
			finished = true;
		}
		
		
		
		int mode = userInput.nextInt();
		
		if(mode == 2) {
			
		}
		
		System.out.println("Enter the desired column: ");
		
	}

}
