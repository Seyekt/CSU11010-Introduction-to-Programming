public class Harness {
    
    private static final int MAX_NUMBER = 25;
    
    private String make;
    private int modelNumber;
    private int numberOfTimesUsed;
    private String instructor;
    boolean onLoan;
    private String borrower;
    
    public Harness(String make, int modelNumber, int numberOfTimesUsed, String instructor, boolean onLoan, String borrower) {
   	 
   	 this.make = make;
   	 this.modelNumber = modelNumber;
   	 this.numberOfTimesUsed = numberOfTimesUsed;
   	 this.instructor = instructor;
   	 this.onLoan = onLoan;
   	 this.borrower = borrower;
   	 
    }
    
    
    
    public Harness(String make, int modelNumber, String instructor) {
    	
    	this.make = make;
	    this.modelNumber = modelNumber;
	   	this.numberOfTimesUsed = 0;
	   	this.instructor = instructor;
	   	this.onLoan = false;
	   	this.borrower = "";
   	 
    }
    
    
    
    public void checkHarness(String instructor) {
   	 
   	 if(!onLoan) {
   		 this.instructor = instructor;
   		 numberOfTimesUsed = 0;
   	 }
   	 
    }
    
    public boolean isHarnessOnLoan() {
   	 
   	 if(borrower.equals("")){
   		 return false;
   	 }
   	 
   	 return true;
    }
    
    public boolean canHarnessBeLoaned() {
   	 
   	 if (!isHarnessOnLoan() && numberOfTimesUsed < 25) {
   		 
   		 return true;
   		 
   	 }
   	 
   	 return false;
   	 
    }
    
    public void loanHarness(String member) {
      	 
      	 if(!onLoan) {
      		 borrower = member;
      		numberOfTimesUsed++;
      		 onLoan = true;
      	 }    
      		 
       }
    
    public void returnHarness() {
   	 
   	 if(onLoan) {
   		 borrower = "none";
   		 onLoan = false;
   	 }    
   		 
    }
    
    public String getMakeModel() {
   	 
   	 return make + "" + modelNumber;
   	 
    }
    
    public String toString() {
      	 
      	 
   	 return "Make: " + make + " Model Number: " + modelNumber + " Number of times used: " + numberOfTimesUsed + " Instructor: " + instructor + " Borrower: " + borrower + "\n";
   	 
    }

}
