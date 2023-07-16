package linkedlist;

public class basic {
	
	public static void main(String[] args) {
		
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		
		Node head = n1;
		n1.next = n2;
		n2.next = n3;
		
	}

}

class Node{
	int data;
	Node next;
	
	
	public Node(int data) {
		this.data=data;
	}
}
