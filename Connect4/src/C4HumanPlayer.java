
public class C4HumanPlayer extends ConnectPlayer {
	
	
	public C4HumanPlayer(char disc) {
		
		this.disc = disc;
		
	}
	
	
	
	public int columnToPlay(){
		
		return 1;
		
	}
	
	public char getPiece() {
		
		return disc;
	}
	
}
