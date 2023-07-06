package arrays;

public class containerwithmostwater {
	
	static void container(int a[],int len) {
		int maxarea=Integer.MIN_VALUE;
		int l=0;
		int r=len-1;
		
        while (l<r) {
        	int height=Math.min(l,r);
        	int distance=r-l;
        	
        	int area=height*distance;
        	if (area > maxarea) {
        		maxarea = area;
        	}
        	
        	
        	if(a[l] < a[r]) {
        		l++;
        		
        	}else {
        		r--;
        	}
        }
        
        
        System.out.println(maxarea);
        
			

		
		}
	
	
	public static void main(String[] args) {
		 int b[]= {1,8,6,2,5,4,8,3,7};
		 int len = 9;
		 container(b,len);
		 
		 
	}

}
