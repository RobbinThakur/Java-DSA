package linkedlist;

import linkedlist.iterativesearch.Node;

public class LinkedList {
	
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
	
	public void mid(int index,int data) {
		if(index == 0) {
			addfirst(data);
			return;
		}
		
		Node newNode = new Node(data);
		size++;
		Node temp = head;
		int i =0;
		
		while(i < index-1) {
			temp = temp.next;
			i++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void removefirst() {
		if(size==0) {
			System.out.println("Linked List is Empty");
			return;
		}
		if (size == 1){
			head = tail = null;
			size = 0;
			return;
		}
		
		head = head.next;
		size--;
	}
	
	public void removelast() {
		if(size==0) {
			System.out.println("Linked List is Empty");
			return;
		}
		if (size == 1){
			head = tail = null;
			size = 0;
			return;
		}
		
		Node prev = head;
		for(int i=0;i<size-2;i++) {
			prev = prev.next;
		}
		
		prev.next = null;
		tail = prev;
		size--;
		
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
	
	public int recursivesearch(int key) {
		return helper(head,key);
	}
	
	public int helper(Node head,int key) {
		if(head == null) {
			return -1;
		}
		if(head.data == key) {
			return 0;
		}
		int idx = helper(head.next,key);
		if(idx == -1) {
			return -1;
		}
		
		return idx+1;
	}
	
	public void reverse() {
		Node prev = null;
		Node cur = tail = head;
		Node next;
		
		while( cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		head = prev;
	}
	
	public void deleteNthFromEnd(int n) {
		//calculate size
		int sz = 0;
		Node temp = head;
		while(temp!=null) {
			temp=temp.next;
			sz++;
		}
		
		if(n == sz) {
			head = head.next; // remove first
			return;
		}
		
		int i = 1;
		int j = sz-n; //prev tk pahunchne k liye
		Node prev = head;
		
		while(i < j) {
			prev = prev.next;
			i++;
		}
		
		prev.next = prev.next.next;
		return;
	}
	
	public Node middle(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	public boolean checkPalindrome() {
		//Base Case
		if(head == null || head.next == null) {
			return true;
		}
		
		
		//Step 1 -- Middle Node
		Node mid = middle(head);
		
		//Step 2 -- reverse the right half
		Node prev = null;
		Node cur = mid;
		Node next;
		
		while(cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		Node right = prev; //right half head
		Node left = head;
		

		//step 3 -- check left & right half
		while(right != null) {
			if(left.data != right.data) {
				return false;
			}
			right = right.next;
			left = left.next;
		}
		return true;
	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		
//		ll.addfirst(10); 
//		ll.printLL();
//		
//		ll.addfirst(5); 
//		ll.printLL();
//		
//		ll.addLast(15); 
//		ll.printLL();
//		
//		ll.addLast(20); 
//		ll.printLL();
//		
//		ll.mid(2,12); 
//		ll.printLL();
//		
//
//		ll.removefirst(); 
//		ll.printLL();
//		
//		ll.removelast(); 
//		ll.printLL();
//		
//		
//		
//		System.out.println("Size of Linked list is : " + ll.size);
//		
//		System.out.println(ll.search(3));
//		
//		ll.printLL();
//		
//		System.out.println(ll.recursivesearch(12));
//		
//		ll.reverse();
//		System.out.print("Reverse : ");
//		ll.printLL();
//		
//		ll.addfirst(2);
//		ll.addfirst(8);
//		
//		ll.printLL();
//		
//		ll.deleteNthFromEnd(4);
//		ll.printLL();
		
//		System.out.println("Middle : " + ll.middle(head));
		
		LinkedList l4 = new LinkedList();
		l4.addfirst(1);
		l4.addfirst(0);
		l4.addfirst(2);
		l4.addfirst(0);
		l4.addfirst(1);
		
		l4.printLL();
		
		System.out.println("Linked list is palindrome : " + l4.checkPalindrome());
	}

}
