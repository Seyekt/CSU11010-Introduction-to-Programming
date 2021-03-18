public class Rational {
    
	private int numerator;
    private int denominator;
    
    public Rational(int inputNumerator, int inputDenominator) {
  	 
		numerator = inputNumerator;
		denominator = inputDenominator;
  	 
    }
    
    public Rational(int inputNumerator) {
   	 
		numerator = inputNumerator;
		denominator = 1;
  	 
    }
    
    public Rational add(Rational inputRational) {
  		 
		int multiple = inputRational.denominator * denominator;
  	 
		int outputNumerator = (inputRational.denominator * numerator) + (denominator * inputRational.numerator);
  	 
		return new Rational(outputNumerator, multiple);
		
    }
    
    public Rational subtract(Rational inputRational) {
  	 
		int multiple = inputRational.denominator * denominator;
  	 
		int outputNumerator = (inputRational.denominator * numerator) - (denominator * inputRational.numerator);
  	 
		return new Rational(outputNumerator, multiple);
		
    }
    
    public Rational multiply(Rational inputRational) {
  	 
		int outputNumerator = inputRational.numerator * numerator;
		int outputDenominator = inputRational.denominator * denominator;
      		 
		return new Rational(outputNumerator, outputDenominator);
    }
    
    public Rational divide(Rational inputRational) {
 		 
		int outputNumerator = inputRational.numerator * denominator;
		int outputDenominator = inputRational.denominator * numerator;
         		 
		return new Rational(outputNumerator, outputDenominator);
	 }
    
    public boolean equals(Rational inputRational) {
  	 
		return ( (simplify().numerator == inputRational.simplify().numerator) && (simplify().denominator == inputRational.simplify().denominator) );
  	 
    }
    
    public boolean isLessThan(Rational inputRational) {
   	 
		return (double)numerator / (double)denominator < (double)inputRational.numerator / (double)inputRational.denominator;
		
    }
    
    public Rational simplify () {
  	 
		if (denominator < 0) {
			numerator *= -1;
			denominator *= -1;
		}
  	 
		int gcd = gcd(numerator, denominator);
  	 
		return new Rational(numerator/gcd, denominator/gcd);
  	 
    }
    
    public int gcd(int one, int two) {
  	 
		one = ( one > 0) ? one : -one;
		two = ( two > 0) ? two : -two;

		while (one != two) {
  		 
   		 if (one > two)
			one -= two;
   		 else
			two -= one;
		
		}
  	 

		return one;
    
    }
    
    public String toString() {
    	
		if (numerator == 0) 	
			return "0";
  	 
		return simplify().numerator + "/" + simplify().denominator;
    	
   	 
    }

}
