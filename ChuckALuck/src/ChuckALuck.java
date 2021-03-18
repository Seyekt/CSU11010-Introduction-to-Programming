import java.util.Scanner;

public class ChuckALuck {
	
	public static void main(String[] args) {
		
		String betType;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("How much money is in your wallet?");		
		
		double money = userInput.nextDouble();
		
		Wallet player = new Wallet();
		
		player.put(money);
		
		boolean finished = false;
		
		while(!finished) {
			
			if (player.check() <= 0)
				finished = true;
			
			System.out.println("What are you betting -'Triple', 'Field', 'High' or 'Low'? (or enter 'quit' to end the game)");		
			
			betType = userInput.next();
			
			if (betType.equals("quit")) 
				finished = true;
			else
				resolveBet(betType, player); 

		}
		
		userInput.close();
		System.out.println("The game is over. You began with €" + money + " and now have €" + player.check() + ".\nFinal Result: €" + (money - player.check()));		
		
	}
	
	public static void resolveBet(String betType, Wallet player) {
		
		System.out.print( player.toString() );
		System.out.println("\nHow much will you bet?");
		
		Scanner betInput = new Scanner(System.in);
		double wager = betInput.nextDouble();
		
		Dice one = new Dice();
		Dice two = new Dice();
		Dice three = new Dice();
		
		int oneResult = one.roll();
		int twoResult = two.roll();
		int threeResult = three.roll();
		
		System.out.println("You got " + oneResult + ", " + twoResult + ", " + threeResult + ".");
		
		int rollTotal = oneResult + twoResult + threeResult;
		
		boolean triple = (oneResult != 1 && oneResult != 6 && oneResult == twoResult && oneResult == threeResult);
		
		if (wager <= player.check()) {
			
			player.get(wager);
			
			if(betType.equals("Triple") && triple) {
				
				System.out.println("Your bet was: Triple. You won!");
				player.put( (wager * 31) );
				System.out.println(player.check());	
				
			} else if(betType.equals("Field") && rollTotal < 8 || rollTotal > 12) {
				
				System.out.println("Your bet was: Field. You won!");
				player.put( (wager * 2) );
				System.out.println(player.check());	
			}
			
			 else if(betType.equals("High") && rollTotal > 10 && !triple) {
				 
				 System.out.println("Your bet was: High. You won!");				 
				 player.put( (wager * 2) );
				 System.out.println(player.check());	
			}
			
			else if(betType.equals("Low") && rollTotal < 11 && !triple) {
				
				System.out.println("Your bet was: Low. You won!");
				player.put( (wager * 2) );
				System.out.println(player.check());	
			}
			
			else {
				System.out.println("You didn't win that bet.");
				System.out.println(player.check());	
			}
			
		} else {
			System.out.println("You haven't enough money to bet that much. Try again.");
		}

		
	}

}