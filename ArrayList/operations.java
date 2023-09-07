package ArrayList;

import java.util.*;

public class operations {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		//add element
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//this all above operations will perform in O(1)
		
		//but this will perform in O(n) when we r passing specific index
		list.add(0,0);
		
		System.out.println(list);
		
		//get element - O(1)
		int element = list.get(2);
		System.out.println("Element at index 2 is : " + element);
		
		//Remove element - O(n)
		list.remove(3); // pass the index of the element 
		System.out.println("After implementing remove");
		System.out.println(list);
		
		//set - O(n)
		list.set(1,1 );
		System.out.println("After implementing Set");
		System.out.println(list);
		
		//contains - O(n)
		System.out.println("this list contains 1 : " + list.contains(1));
	}

}
