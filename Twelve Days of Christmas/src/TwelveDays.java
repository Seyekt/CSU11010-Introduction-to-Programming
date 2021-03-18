public class TwelveDays {
	
	public static void main(String[] args) {
		
		int verse = 1;
		String dayOfChristmas = "first";
		
		while (verse <= 12) {
			
			System.out.println("On the " + dayOfChristmas + " day of Christmas my true love sent to me:");
			
			switch (verse){
			
			case 12:
				System.out.println("Twelve drummers drumming,");
			
			case 11:
				System.out.println("Eleven pipers piping,");
				if (verse == 11)
					dayOfChristmas = "twelfth";
			
			case 10:
				System.out.println("Ten lords a-leaping,");
				if (verse == 10)
					dayOfChristmas = "eleventh";
			
			case 9:
				System.out.println("Nine ladies dancing,");
				if (verse == 9)
					dayOfChristmas = "tenth";
			
			case 8:
				System.out.println("Eight maids a-milking,");
				if (verse == 8)
					dayOfChristmas = "ninth";
			
			case 7:
				System.out.println("Seven swans a-swimming,");
				if (verse == 7)
					dayOfChristmas = "eighth";
			
			case 6:
				System.out.println("Six geese a-laying,");
				if (verse == 6)
					dayOfChristmas = "seventh";
			
			case 5:
				System.out.println("Five gold rings,");
				if (verse == 5)
					dayOfChristmas = "sixth";
			
			case 4:
				System.out.println("Four colly birds,");
				if (verse == 4)
					dayOfChristmas = "fifth";
			
			case 3:
				System.out.println("Three French hens,");
				if (verse == 3)
					dayOfChristmas = "fourth";
				
			case 2:
				System.out.println("Two turtle doves and");
				if (verse == 2)
					dayOfChristmas = "third";
				
			case 1:
				System.out.println("a partridge in a pear tree. \n");
				if (verse == 1)
					dayOfChristmas = "second";
			}
			
			verse++;
			
		}
		
				
			
			
	}
	
	
}
	