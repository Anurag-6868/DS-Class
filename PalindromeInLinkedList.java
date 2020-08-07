package fifth;

public class PalindromeInLinkedList {

	    
	    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> root){
	         LinkedListNode<Integer>  prev=null;
	        while(root!=null){
	            LinkedListNode<Integer> nextNode = root.next;
	            root.next=prev;
	            prev=root;
	            root=nextNode;
	        }
	        return prev;
	    }

		public static boolean isPalindrome(LinkedListNode<Integer> head) {
			//Your code goes here
	   LinkedListNode<Integer>   fast = head;
	   LinkedListNode<Integer> slow = head;

	  while (fast != null && fast.next != null) {
	    slow = slow.next;
	    fast = fast.next.next;
	  }

	  fast = head;
	  slow = reverse(slow);

	  while (slow != null) {
	    if (slow.data.equals(fast.data)) {
	      return false;
	    }
	    slow = slow.next;
	    fast = fast.next;
	  }

	  return true;

		}

	}

