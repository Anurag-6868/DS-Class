package fourth;

public class InsertAtEnd {
	 public class Node{  
         int data;  
         Node next;  
         public Node(int data) {  
             this.data = data;  
         }  
     }  
         
     public Node head = null;  
     public Node tail = null;  
       
       
     public void addAtEnd(int data){  
         Node newNode = new Node(data);  
         //Checks if the list is empty.  
         if(head == null) {  
              //If list is empty, both head and tail would point to new node.  
             head = newNode;  
             tail = newNode;  
             newNode.next = head;  
         }  
         else {  
             //tail will point to new node.  
             tail.next = newNode;  
             //New node will become new tail.  
             tail = newNode;  
             //Since, it is circular linked list tail will points to head.  
             tail.next = head;  
         }  
     }  
        
     public void display() {  
         Node current = head;  
         if(head == null) {  
             System.out.println("List is empty");  
         }  
         else {  
             System.out.println("Adding nodes to the end of the list: ");  
              do{  
                 //Prints each node by incrementing pointer.  
                 System.out.print(" "+ current.data);  
                 current = current.next;  
             }while(current != head);  
             System.out.println();  
         }  
     }  
       
     public static void main(String[] args) {  
         InsertAtEnd cl = new InsertAtEnd();  
           
           
         cl.addAtEnd(1);  
         cl.display();  
         
         cl.addAtEnd(2);  
         cl.display();  
         
         cl.addAtEnd(3);  
         cl.display();  
       
         cl.addAtEnd(4);  
         cl.display();  
     }  
}
