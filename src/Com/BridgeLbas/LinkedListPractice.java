package Com.BridgeLbas;


public class LinkedListPractice <T> {

    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
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
        current.next=newNode;

    }
   
    public void display() {
        Node<T> temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
