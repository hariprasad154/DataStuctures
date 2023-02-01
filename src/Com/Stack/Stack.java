package Com.Stack;

import Com.LinkedList.LinkedListPractice;

public class Stack<T> {
	LinkedListPractice<T> linkedList;
	public Stack() {
        linkedList = new LinkedListPractice<>();
    }

    public void push(T data) {
        linkedList.push(data);
    }

    
public static void main(String[] args) {
	Stack<Integer> stack =new Stack();
	
	stack.push(70);
	stack.push(30);
	stack.push(56);
	
	stack.linkedList.display();
	
	
}
}
