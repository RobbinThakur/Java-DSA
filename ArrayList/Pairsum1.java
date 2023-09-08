package ArrayList;

import java.util.ArrayList;

public class Pairsum1 {
	
	public static boolean pairsum(ArrayList<Integer> list,int target) {
		int lp = 0;
		int rp =list.size()-1;
		
		while(lp < rp) {
			//case1
			if(list.get(lp) + list.get(rp) == target) {
				return true;
			}
			
			//case2
			if(list.get(lp) + list.get(rp) < target) {
				lp++;
			}else { //case3
				rp--;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		// sorted arraylist
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(pairsum(list,5));
		
		
	}

}
