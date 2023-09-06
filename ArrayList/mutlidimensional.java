package ArrayList;

import java.util.ArrayList;

	public class mutlidimensional {
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		
		
		list1.add(10);
		list1.add(80);
		list1.add(90);
		list1.add(20);
		list1.add(60);
		
		mainList.add(list1);
		
		
		
		ArrayList<Integer> list2 = new ArrayList<>();
			
			
			list2.add(1);
			list2.add(8);
			list2.add(9);
			list2.add(2);
			list2.add(6);
			
		mainList.add(list2);
		
		
		for(int i=0;i<mainList.size();i++) {
			ArrayList<Integer> cur = mainList.get(i);
			for(int j=0;j<cur.size();j++) {
				System.out.print(cur.get(j) + " ");
			}
			System.out.println();
		}
		
		System.out.print(mainList);
		
	}

}
