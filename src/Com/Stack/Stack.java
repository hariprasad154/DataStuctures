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
}
