public class Connect4Grid2DArray implements Connect4Grid {

	
	

	char[][] grid = new char[NUMBER_OF_COLUMNS][NUMBER_OF_ROWS];


	@Override
	public void emptyGrid() {


		for(int i = 0; i < NUMBER_OF_COLUMNS; i++) {
			
			for(int j = 0; j < NUMBER_OF_ROWS; j++) {

				grid[i][j] = 0x30;
			
			}

		}

	}
	
	@Override
	public boolean isValidColumn(int column) {
		
		if (column >= 0 && column < NUMBER_OF_COLUMNS) {
			if (!isColumnFull(column))
				return true;
		}
			
		
		return false;
	}
	
	@Override
	public boolean isColumnFull(int column) {
		
		for (int i = 0; i < NUMBER_OF_ROWS; i++) { //
			if (grid[column][i] == '0') {
				return false;
			}
		}

		return true;

	}
	
	@Override
	public void dropPiece(ConnectPlayer player, int column) {
		
		for(int i = 0; i < NUMBER_OF_ROWS; i++) {
			
			if (grid[column][i] != '0') {
				grid[column][i - 1] = player.getPiece();
				return;
			}
		}
		grid[column][5] = player.getPiece();

	}
	
	@Override
	public boolean didLastPieceConnect4() {

		return false;
	}
	
	@Override
	public boolean isGridFull() {
		
		for(int i = 0; i < NUMBER_OF_COLUMNS; i++)
		{
			if(grid[i][0] == '0') {
				return false;
			}
		}
		
		return true;

	}
	
	@Override
	public String toString() {
		
		return "\n|" + grid[0][0] + "|" + grid[0][1] + "|" + grid[0][2] + "| 1" +
				"\n|" + grid[1][0] + "|" + grid[1][1] + "|" + grid[1][2] + "| 2" + 
				"\n|" + grid[2][0] + "|" + grid[2][1] + "|" + grid[2][2] + "| 3" + 
				"\n " + '1' + " " + '2' + " " + "3\n";

		
	}

	
}





