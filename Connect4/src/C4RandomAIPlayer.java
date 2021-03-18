import java.util.Random;

public class C4RandomAIPlayer extends ConnectPlayer{

	public C4RandomAIPlayer(char disc) {
		
		this.disc = disc;
		
	}
	
	
	
	public int columnToPlay() {
		Random generator = new Random();
		int columnToPlay = generator.nextInt(NUMBER_OF_COLUMNS);
		return columnToPlay;
	}
	
	public char getPiece() {
		
		return disc;
	}
	
	
}
