package linkedlist;



public class iterativesearch {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = next;
			
			
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;
	
	public void addfirst(int data) {
		Node newNode = new Node(data);
		size++;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		size++;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}
	
	public void printLL() {
		if(head == null) {
			System.out.print("Linked List is Empty");
			return;
		}
		Node temp = head;
		while(temp != null) {
		System.out.print(temp.data + "->");
		temp = temp.next;
		
		}
		System.out.println("null");
		
	}
	
	public int search(int key) {
		Node temp = head;
		int i =0;
		
		while(temp != null) {
			if(temp.data == key) {
				return i;
			}
			temp = temp.next;
			i++;
		}
		
		return -1;
	}
		
		public static void main(String[] args) {
			LinkedList ll = new LinkedList();
			
			
			ll.addfirst(10); 
			ll.printLL();
			
			ll.addfirst(5); 
			ll.printLL();
			
			ll.addLast(15); 
			ll.printLL();
			
			ll.addLast(20); 
			ll.printLL();
			

			System.out.println("Size of Linked list is : " + ll.size);
			
			
			System.out.println(ll.search(15));
			
			
			
		}
	

}
