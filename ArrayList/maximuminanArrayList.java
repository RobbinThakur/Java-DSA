package ArrayList;

import java.util.ArrayList;

public class maximuminanArrayList {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		
		list.add(10);
		list.add(26);
		list.add(34);
		list.add(84);
		list.add(25);
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i < list.size();i++) {
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		
		System.out.println("maximum in this ArrayList is : " + max);
		

}
}
