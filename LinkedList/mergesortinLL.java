package linkedlist;





public class mergesortinLL {
	
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
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void print() {
		Node temp =head;
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public Node getmid(Node head) {
		Node slow = head;
		Node fast = head.next;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			
		}
		
		return slow;
		
	}
	
	public Node merge(Node head1, Node head2) {
		Node mergedLL = new Node(-1);
		Node temp = mergedLL;
		
		while(head1 != null && head2 != null) {
		 if(head1.data <= head2.data) {
			 temp.next = head1;
			 head1 = head1.next;
			 temp = temp.next;
		 }else {
			 temp.next = head2;
			 head2 = head2.next;
			 temp = temp.next;
		 }
		 
		}
		
		while(head1!=null) {
			temp.next = head1;
			 head1 = head1.next;
			 temp = temp.next;
		}
		
		while(head2!=null) {
			temp.next = head2;
			 head2 = head2.next;
			 temp = temp.next;
		}
		
		return mergedLL.next;
	}
	
	public Node mergesort(Node head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		
		
		//middle
		Node mid = getmid(head);
		
		//divide
		Node righthead = mid.next;
		mid.next = null;
		Node newright = mergesort(righthead);
		Node newleft = mergesort(head);
		
		
		//merge
		return merge(newleft, newright);
		
	}
	
	public static void main(String args[]) {
		LinkedList lll = new LinkedList();
		
		
		
		
	}
}
