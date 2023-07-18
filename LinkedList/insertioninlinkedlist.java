package linkedlist;

public class insertioninlinkedlist {
	
	static void printList(Node head) {
		Node cur = head;
		while(cur != null) {
			System.out.println(cur.data+" >>>");
			cur = cur.next;
			
		}
		System.out.println(" End <<>>");
	}
	
	static Node insertLL(int data, int position,Node head) {
		Node newNode = new Node(data);
		if(position == 0) {
			newNode.next = head;
			head = newNode;
			return head;
			
		}
		Node cur = head;
		for(int i =0;i<position-1; i++) {
			cur = cur.next;
		}
		newNode.next = cur.next;
		cur.next = newNode;
		return head;
	}
	
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
		
		
		Node head = n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		printList(head);
		head = insertLL(100,4,head);
		
		printList(head);
		
		
	}

}
class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
	}
}
