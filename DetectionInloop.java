package fifth;


public class DetectionInloop {
	Node head ; 
	static class Node { 
	    int data;
		Node next;
		Node(int data) 
		{ 
			this.data = data; 
			next = null; 
		} 
	} 
	public static boolean hasLoop(Node first) {
	    Node slow = first;
	    Node fast = first;

	    while(fast != null && fast.next != null) {
	        slow = slow.next;       
	        fast = fast.next.next;     

	        if(slow == fast)  
	            return true;
	    }
	    return false;  
	}
	public static void main(String[]args) {
		Node head = new Node(7);
		boolean re= hasLoop(head);
		System.out.print(re);
	}

}
