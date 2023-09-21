package stack;

public class stackUsingLinkedList {
	
	public class Node{
		int data;
		Node next;
		
		 Node(int data) {
			this.data = data;
			this.next = next;
		}
	}
	
	
	
	static class Stac{
		 static Node head = null;
		 
	
		
		//empty
		public static boolean Isempty() {
			return head == null;
		}
		
		//push
		public static void push(int data) {
			Node neode = new Node(data);
			
			if(Isempty()) {
				head = neode;
				return;
			}
			
			neode.next = head;
			head = neode;
		}
		
		//pop
		public static int pop() {
			if(Isempty()) {
				return -1;
			}
			
			int top = head.data;
			head = head.next;
			return top;
			
		}
		
		//peek
		public static int peek() {
			if(Isempty()) {
				return -1;
			}
			
			return head.data;
		}
		
	}
	
	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		
		s1.push(1);
		s1.push(6);
		s1.push(3);
		
		while(!s1.Isempty()) {
			System.out.println(s1.peek());
			s1.pop();
		}
	}
}




