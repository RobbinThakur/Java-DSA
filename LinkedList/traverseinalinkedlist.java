package linkedlist;

public class traverseinalinkedlist {
	
	 static void printLL(Node head) {
		Node cur = head;
		while(cur !=null) {
			System.out.println(cur.data+" -> ");
			cur = cur.next;
		}
		System.out.println("End");
	}
	
	public static void main(String[] args) {
		
		
		Node n1 = new Node(1);
		Node n2 = new Node(5);
		Node n3 = new Node(2);
		Node n4 = new Node(3);
		Node n5 = new Node(4);
		Node n6 = new Node(10);
		
		Node head = n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		
		printLL(head);
		
		
		
	}

}
class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
	}
}
