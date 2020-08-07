package fifth;

public class DoublyLinkedList {  
	
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    Node head, tail = null;  
  
   
    public void addNode(int data) {  
    
        Node newNode = new Node(data);  
  
 
        if(head == null) {  
            head = tail = newNode;  
    
            head.previous = null;  
    
            tail.next = null;  
        }  
        else {  
            //newNode ko tail ke next mae dal denge  
            tail.next = newNode;  
            //tail ke purane value ko newnode ke previous mae dal denge 
            newNode.previous = tail;  
            //newNode nae tail ban jaege 
            tail = newNode;  
            //ab jis newnode ko hamne tail bnaya tha uske next mae null dal denge because it is last value
            tail.next = null;  
        }  
    }  
  
  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
  
    public static void main(String[] args) {  
  
        DoublyLinkedList dList = new DoublyLinkedList();  
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  
 
        dList.display();  
    }  
}