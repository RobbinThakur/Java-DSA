package ArrayList;

import java.util.ArrayList;

public class mostwaterTwoPointerApproach {
	
	public static int twopointer(ArrayList<Integer> list) {
		int maxwater =0;
		int lp = 0;
		int rp = list.size()-1;
		
		while(lp < rp) {
			int height = Math.min(list.get(lp), list.get(rp));
			int width = rp-lp;
			int curwater = height * width;
			maxwater = Math.max(maxwater,curwater);
			
			
			//updation
			if(lp < rp) {
				lp++;
			}else { //rp < lp
				rp--;
			}
		}
		return maxwater;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(3);
		list.add(7);
		
		System.out.print(twopointer(list));
		
	}

}
