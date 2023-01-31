package Com.BridgeLbas;



public class LinkedListPracticeMain {
	public static void main(String[] args) {
		
	
	LinkedListPractice<Integer> linkedList1 = new LinkedListPractice();
    linkedList1.push(70);
    linkedList1.push(30);
    linkedList1.push(56);

    linkedList1.display();
    
    LinkedListPractice<Integer> linkedList2 = new LinkedListPractice();
    linkedList2.Append(70);
    linkedList2.Append(30);
    linkedList2.Append(56);
    
    linkedList2.display();
    
    LinkedListPractice<Integer> linkedList3 = new LinkedListPractice();
    linkedList3.Append(70);
    linkedList3.Append(30);
    linkedList3.insert(56);
    
    linkedList3.display();
    
}
}