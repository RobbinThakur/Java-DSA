package ArrayList;

import java.util.ArrayList;

public class reverseanarraylist {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		System.out.println("ArrayList : " + list);
		
		//reverse
		System.out.print("Reverse : ");
		for(int i=list.size()-1;i>=0;i--) {
			
			System.out.print(list.get(i)+ " ");
		}
	}

}
