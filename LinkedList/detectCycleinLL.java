package linkedlist;

public class detectCycleinLL {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = next;
		}
	}
	
	public static boolean hasCycle(Node head) {
	       Node slow = head;
	       Node fast = head;
	       while(fast != null && fast.next != null){
	           slow = slow.next;
	           fast = fast.next.next;
	           if(slow == fast){
	               return true;
	           }
	       }
	       return false;
	    }
	
	public static void main(String[] args) {
		
	}

}
