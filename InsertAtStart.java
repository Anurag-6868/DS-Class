package fourth;

public class InsertAtStart {
	  public class Node{  
          int data;  
          Node next;  
          public Node(int data) {  
              this.data = data;  
          }  
      }    
      public Node head = null;  
      public Node tail = null;  

      //This function will add the new node at the end of the list.  
      public void addAtStart(int data){  
          Node newNode = new Node(data);  
          //Checks if the list is empty.  
          if(head == null) {  
               //If list is empty, both head and tail would point to new node.  
              head = newNode;  
              tail = newNode;  
              newNode.next = head;  
          }  
          else {  
              //Store data into temporary node  
              Node temp = head;  
              //New node will point to temp as next node  
              newNode.next = temp;  
              //New node will be the head node  
              head = newNode;  
              //Since, it is circular linked list tail will point to head.  
              tail.next = head;  
          }  
      }  
 
      public void display() {  
          Node current = head;  
          if(head == null) {  
              System.out.println("List is empty");  
          }  
          else {  
              System.out.println("Adding nodes to the start of the list: ");  
               do{  
                  //Prints each node by incrementing pointer until current!=head rahe ga.  
                  System.out.print(" "+ current.data);  
                  current = current.next;  
              }while(current != head);  
              System.out.println();  
          }  
      }  

      public static void main(String[] args) {  
          InsertAtStart cl = new InsertAtStart();  

           
          cl.addAtStart(1);  
          cl.display();  
           
          cl.addAtStart(2);  
          cl.display();  
         
          cl.addAtStart(3);  
          cl.display();  
           
          cl.addAtStart(4);  
          cl.display();  
      }
}
