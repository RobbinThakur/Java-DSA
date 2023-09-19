package linkedlist;

public class mergeTwoSortedList {
	
	public class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
			this.next = next;
		}
	}
	
	public Node mergeTwoLists(Node list1, Node list2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }

        while(list1!=null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }

        while(list2!=null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

}
