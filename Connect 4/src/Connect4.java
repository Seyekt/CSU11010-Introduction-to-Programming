import java.util.Scanner;

public class Connect4 {
	
	public static final int NUMBER_OF_ROWS = 3;
	public static final int NUMBER_OF_COLUMNS = 3;
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		boolean finished = false;
		boolean finished2 = false;
		
		char[][] board = new char [3][3];
		clearBoard(board);
		
		char currentPlayerPiece = 'X';
		int row = -1;
		int column = -1;
		
		int turnNumber = 1;
		
		System.out.println("Enter the desired position row first, then column, separated by a space.");
		
		printBoard(board);
		
		
		while(!finished) {

			if (turnNumber % 2 == 0) {
				
				currentPlayerPiece = 'O';
				System.out.println("Player 2, where will you put an 'O'?");
				
			} else {
				
				currentPlayerPiece = 'X';
				System.out.println("Player 1, where will you put an 'X'?");
				
			}
			
			while (!finished2) {
				
				
				System.out.println("Enter the row and column: ");
				
				if (userInput.hasNextInt()) {
					
					row = userInput.nextInt();
					
					if (userInput.hasNextInt()) {
						
						column = userInput.nextInt();
						
						if (row >= 1 && row <= NUMBER_OF_ROWS && column >= 1 && column <= NUMBER_OF_COLUMNS) {
							
							finished2 = true;
							
						}
						
					}
					
				}
				
				if (!finished2)
					userInput.next();
				
			} 
			
			finished2 = false;
			
			
			if ( canMakeMove (board, row, column) )
				makeMove (board, currentPlayerPiece , row, column);
			
			printBoard(board);
			
			
			
			if (winner(board) != ' ') {
				
				System.out.println("The winner is " + winner(board) + '!');
				finished = true;
				
			}
			
			if (isBoardFull(board)) {
				
				System.out.println("The game ended in a draw; there was no winner.");
				finished = true;
				
			}
			
			
			turnNumber++;
			
		}
		
	
		userInput.close();
		
		
	}
	
	public static void clearBoard (char[][] board) {
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
			
				board[i][j] = ' ';
			
			}
			
		}
		
		
	}
	
	public static void printBoard (char[][] board) {
		
		System.out.println("\n|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "| 1");
		System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "| 2");
		System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "| 3");
		System.out.println(" " + '1' + " " + '2' + " " + "3\n");
	
		
	}
	
	public static boolean canMakeMove (char[][] board, int row, int column) {
		
		if (board[row - 1][column - 1] == ' ') {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public static void makeMove (char[][] board, char currentPlayerPiece , int row, int column) {
		
		board[row - 1][column - 1] = currentPlayerPiece;
		
	}
	
	public static boolean isBoardFull(char[][] board) {
		
		for (int i = 0; i < 3; i++) {
					
			for (int j = 0; j < 3; j++) {
					
				if (board[i][j] == ' ')
					
					return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public static char winner ( char[][] board) {
		
		for (int i = 0; i < 3; i++) {
			
			if (board[i][0] == board[i][1] && board[i][0] == board[i][2])
				return board[i][0];
			
			else if (board[0][i] == board[1][i] && board[0][i] == board[2][i])
				return board[0][i];
			
		}
		
		
		if ( (board[1][1] == board[0][0] && board[1][1] == board[2][2]) || (board[1][1] == board[2][0] && board[1][1] == board[0][2]) ) 
			return board[1][1];
		
			
		
		return ' ';
	}

}