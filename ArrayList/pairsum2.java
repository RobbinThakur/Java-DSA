package ArrayList;

import java.util.ArrayList;

public class pairsum2 {
	
	public static boolean srpairsum(ArrayList<Integer> list, int target) {
		int bp = -1; //pivot pint(breaking point)
		int n = list.size();
		for(int i=0;i<list.size();i++) {
			if(list.get(i) > list.get(i+1)) {
				bp = i;
				break;
			}
		}
		
		int lp = bp+1;
		int rp =bp;
		
		while(lp != rp) {
		if(list.get(lp) + list.get(rp) == target) {
			return true;
		}
		
		if(list.get(lp) + list.get(rp) < target) {
			lp = (lp+1) % n;
		}else {
			rp = (n+rp-1) % n;
		}
		}
		return false;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		// sorted  and rotated arraylist
		
		list.add(11);
		list.add(15);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);
		
		System.out.print(srpairsum(list,16));
	}
		

}
