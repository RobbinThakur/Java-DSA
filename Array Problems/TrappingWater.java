package Arrays;

public class TrappingWater {
	public static int Trap(int a[]) {
		int left[]=new int[a.length];
		
		left[0]=a[0];
		for(int i=1;i<left.length;i++) {
			// we can also use   left[i] = MATH.max[a[i],left[i-1];
			if(a[i] > left[i-1]) {
				left[i] = a[i];
			} else {
				left[i] = left[i-1];
			}
		}
		
		int right[] =new  int[a.length];
		
		right[right.length-1] = a[a.length-1];
		for(int i=right.length-2;i>=0;i--) {
			// we can also use  right[i] = MATH.max[a[i],right[i+1];
			if(a[i] > right[i+1]) {
				right[i] = a[i];
			} else {
				right[i] = right[i+1];
			}
		}
		
		int totalwatertrapped = 0;
		
		for(int i=0;i<a.length;i++) {
			int waterlevel = Math.min(left[i],right[i]);
			
			int watertrapped = waterlevel - a[i];
			
			totalwatertrapped += watertrapped;
			
		}
		
		return totalwatertrapped;
		
	}
	
	public static void main (String[] args) {
		int a[]= {4,2,0,6,3,2,5};
		
		System.out.println("Total watertrapped is : " + Trap(a));
		
	}

}
