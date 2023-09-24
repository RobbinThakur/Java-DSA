package questionOnStack;

import java.util.*;

public class maxAreaInHistogram {
	
	public static void maxArea(int[] arr) {
		int maxarea = 0;
		int nsl[] = new int[arr.length];
		int nsr[] = new int[arr.length];
		
		Stack<Integer> s = new Stack<>();
		
		//next small right
		for(int i=arr.length-1;i>=0;i--) {  
			while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nsr[i] = arr.length;
			}else {
				nsr[i] = s.peek();
			}
			
			s.push(i);
		}
		
		
		//next small left
		s =new Stack<>();
		
		for(int i=0;i<arr.length;i++) {
			while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nsl[i] = -1;
			}else {
				nsl[i] = s.peek();
			}
			
			s.push(i);
		}
		
		//area
		for(int i=0;i<arr.length;i++) {
			int width = nsr[i] - nsl[i] -1;
			int curarea = arr[i] * width;
			maxarea = Math.max(maxarea, curarea);
		}
		
		System.out.println("max area of histogram is : " + maxarea);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,1,5,6,2,3};
		
		maxArea(arr);
		
		
	}

}
