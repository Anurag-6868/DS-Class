package fifth;

public class ReverseLinkedList {

		public static void printReverse(LinkedListNode<Integer> root) {
			//Your code goes here
	        LinkedListNode<Integer>  prev=null;
	        while(root!=null){
	            LinkedListNode<Integer> nextNode = root.next;
	            root.next=prev;
	            prev=root;
	            root=nextNode;
	        }
	        while(prev!=null){
	            System.out.print(prev.data+" ");
	            prev=prev.next;
	        }
		}

}
