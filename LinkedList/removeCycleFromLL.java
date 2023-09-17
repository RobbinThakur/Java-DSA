package linkedlist;

public class removeCycleFromLL {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = next;
		}
	
	public static void removeLoop(Node head){
       
        
        Node slow = head;
        Node fast = head;
        Node prev = null;
        boolean cycle =false;
        ;
         
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow){
                cycle =true;
                break;
            }
        }
        
        if(cycle){
            
            slow = head;
            
            while(slow != fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
                
                
            }
        }
        
        
        prev.next =null;
    }
	
	public static void main(String[] args) {
		
	}
}

}
