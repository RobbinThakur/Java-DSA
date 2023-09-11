package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sorting {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		
		list.add(10);
		list.add(80);
		list.add(90);
		list.add(20);
		list.add(60);
		
		
		System.out.println(list);
		
		Collections.sort(list);// ascending order
		
		
		System.out.println("After sorting : " + list);
		
		//descending order
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("Descending order sorting : " + list);
		
		
	}

}
