//leader is an element which do not have larger element on right side
package arrays;

public class leaderinanarray {
	
	public static void main(String[] args) {
		
		int a[]= {2,7,1,2,4};
		
		for(int i=0;i<a.length;i++) {
			int current=a[i];
			boolean isleader = true;
			for(int j=i+1;j<a.length;j++) {
				if(a[j] > a[i]) {
				isleader=false;
				}
			}
			if(isleader) {
				System.out.println(a[i]);
			}
		}
	}
	

}
