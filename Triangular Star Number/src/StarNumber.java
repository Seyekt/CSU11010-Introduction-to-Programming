public class StarNumber {
	
	public static final int MINIMUM_VALUE = 0;
	
	public static void main(String[] args) {
		
		System.out.println("The numbers that are both star and triangle numbers are: \n");
		
		int n = 1;
	
		int triangleNumber = determineTriangleNumber(n);
		
		while (triangleNumber >= MINIMUM_VALUE ) {
			triangleNumber = determineTriangleNumber(n++);
			
			if(isStarNumber(triangleNumber))
				System.out.println(triangleNumber);
		}
		
	}
	
	public static boolean isStarNumber(int triangleNumber) {
		
		int starNumberN = 0;
		int starNumber = 1;
		
		while (triangleNumber > starNumber) {
			starNumber = (6 * starNumberN) * (starNumberN - 1) + 1;
			starNumberN++;
		}
		
		if (starNumber == triangleNumber)
			return true;
		else
			return false;
	}
	
	public static int determineTriangleNumber(int triangleNumberN) {
		
		int triangleNumber = 1;
		
		while (triangleNumberN > 1) {
			triangleNumber = triangleNumber + triangleNumberN;
			triangleNumberN--;
		}
		
		return triangleNumber;
		
	}
		
	
	
}