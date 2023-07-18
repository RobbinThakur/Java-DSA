package linkedlist;

public class middleelement {
	
	static int middlell(Node head) {
		Node slow = head;
		Node fast= head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
		}
		return slow.data;
	}
	
public static void main(String[] args) {
		
		Node n1 = new Node(3);
		Node n2 = new Node(6);
		Node n3 = new Node(12);
		Node n4 = new Node(15);
		Node n5 = new Node(46);
		
		
		Node head = n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		System.out.println(middlell(head));
		
		
	}

}

class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
	}
}



