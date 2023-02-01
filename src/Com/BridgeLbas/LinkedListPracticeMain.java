package Com.BridgeLbas;



public class LinkedListPracticeMain {
	public static void main(String[] args) {
		
	LinkedListPractice<Integer> linkedList1 = new LinkedListPractice();
    System.out.println("the list-1");
	linkedList1.push(70);
    linkedList1.push(30);
    linkedList1.push(56);

    linkedList1.display();
    
    LinkedListPractice<Integer> linkedList2 = new LinkedListPractice();
    System.out.println("the list-2");
    linkedList2.Append(56);
    linkedList2.Append(30);
    linkedList2.Append(70);
    
    linkedList2.display();
    
    LinkedListPractice<Integer> linkedList3 = new LinkedListPractice();
    System.out.println("the list-3");
    linkedList3.Append(70);
    linkedList3.Append(30);
    linkedList3.insert(56);
    
    linkedList3.display();
    System.out.println("the list-2");
    linkedList2.pop();
    linkedList2.display();
    
    System.out.println("the list-1");
    
    System.out.println(linkedList1.popLast());
    linkedList1.display();
    System.out.println("the list-3");    
    linkedList3.display();
    
    
    linkedList3.search(56);
    
}
}