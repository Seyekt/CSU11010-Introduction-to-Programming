
public class StackTest {

	public static void main(String[] args) {
		
		Stack testStack = new Stack();
		
		System.out.println("Enter numbers: ");
		
		
		for (int i = 1; i <= 10; i++) { 
			testStack.push(i);
		}
		
		System.out.println(testStack);
		
		//testStack.pop();
		
		System.out.println(testStack);
		
		//System.out.println(testStack.peek());
		
		Integer number = new Integer(9);
		
		testStack.move(number);
		
	}
	
}
