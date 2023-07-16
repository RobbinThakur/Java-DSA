package linkedlist;

public class insertionatlast {
	static void printll(Node head) {
		Node cur = head;
		while(cur != null) {
			System.out.print(cur.data + "->");
			cur = cur.next;
		}
		System.out.print("End");
	}
	
	static void atlast(Node head) {
		Node newNode = new Node(2000000);
		if (head == null) {
			head = newNode;
			
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
		
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(20);
		Node n2 = new Node(200);
		Node n3 = new Node(2000);
		Node n4 = new Node(20000);
		Node n5 = new Node(200000);
		
		Node head = n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		printll(head);
		atlast(head);
		printll(head);
	}
	

}
class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		
	}
}