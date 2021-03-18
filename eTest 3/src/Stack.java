import java.util.ArrayList;

public class Stack {
	
	private int stackPointer;
	private ArrayList<Integer> stack = new ArrayList<Integer>();
	
	public Stack() {
		
		stackPointer = 0;
	}
	
	public void push(int pushed){
		Integer number = new Integer(pushed);
		stack.add(number);
		stackPointer++;
	}
	
	public Integer pop(){
		
		Integer number = stack.get(stackPointer);
		stack.remove(stackPointer);
		stackPointer--;
		return number;
	}
	
	public Integer peek(){
		
		Integer number = stack.get(stackPointer);
		
		if(number == null) {
			number = new Integer(-1);
		}
		
		return number;
		
	}
	
	public int search(Integer searched){
		
		int number;
		
		for(int i = 0; i < stack.size(); i++) {
			
			number = stack.get(i).getValue();
			
			if (number == searched.getValue()) {
				
				return i;
				
			}
		
		}
		
		
		return -1;
		
	}
	
	public void move(Integer toBeMoved){
		
		int index = search(toBeMoved);
		
		if (index != -1) {
			stack.add(stackPointer + 1, toBeMoved);
		}
				
		
		
	}
	
	public String toString() {
		
		String output = "";
		for(int i = 0; i < stack.size(); i++) {
			Integer number = stack.get(i);
			output += " " + number;
			
		}
		
		return output;
	}
	

}
