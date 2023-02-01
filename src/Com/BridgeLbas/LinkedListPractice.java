package Com.BridgeLbas;


public class LinkedListPractice <T> {

	Node<T> head;
	Node<T> tail;
	public void push(T data) {
		Node<T> newNode = new Node(data);
		if (head == null) {
			// If the Linked List is empty, 
			// then make the new node as head 
			head = newNode;
			tail = newNode;
		}else{
			// Else traverse till the last node 
			// and insert the new_node there
			newNode.next = head;
			head = newNode;
		}
	}

	public void Append(T data) {
		Node<T> newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node<T> current= head;
		while (current.next != null){
			current =current.next;

		}
		// Insert the new_node at last node 
		current.next=newNode;

	}
	public void insert(T key) {
		Node<T> temptail=head.next;
		Node<T> newNode = new Node(key);
		head.next=newNode;
		newNode.next=temptail;
	}
	public void pop() {
		// Store head node
		Node<T> currentNode = head;
		head=currentNode.next;
		return;
	}
	public T popLast() {
        T popData = tail.data;
        Node<T> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popData;
    }
	public Node<T> search(T searchData) {
        Node<T> temp = head;
        while (temp != null) {
           if(temp.data.equals(searchData))
               return temp;
            temp = temp.next;
        }
        return null;
    }
	public boolean insertAfter(T insertData ,T searchData) {
		Node<T> searchedData =  search(searchData);
	       if(searchedData != null){
	           Node<T> newNode = new Node(insertData);
	           Node<T> nextNode = searchedData.next;
	           searchedData.next = newNode;
	           newNode.next = nextNode;
	           return true;
	       }
	       return false;
		
		
	}
	public void display() {
		Node<T> temp = head;
		while(temp!=null){
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("\n");
	}
}
