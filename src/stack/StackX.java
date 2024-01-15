package stack;

public class StackX {
	private int maxSize;
	private int top;
	private double[] stack;
	
	public StackX() {	
		this.maxSize = 5;
		this.top = -1;
		stack = new double [maxSize];
	}
		
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	}
	
	public double push(double data) {
		
		if(isFull()) {
			System.out.println("Stack is Full");
		};
		return stack[++top] = data;
	}
	
	public double pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		return stack[top--];
	}
	
	public double peek() {
		return stack[top];
	}
	
	public void display() {
		for (double i:stack) {
			System.out.println(i);
			
		}
	}

public static void main(String[] args) {
		StackX stack = new StackX();
		
		stack.push(34);
		stack.push(14);
		stack.push(16);
		stack.push(56);
		stack.push(89);
		
		System.out.println(stack.isEmpty()); //check stack is empty
		System.out.println(stack.isFull()); //check stack is full
		System.out.println(stack.maxSize); //check maxsize
		System.out.println(stack.peek()); //display element without deleting it
		System.out.println(stack.pop()); //delete a element
		System.out.println();
		stack.display();
		
		
	}
}
