package recursion;

public class arrayissortedornot {
	public static boolean isSorted(int a[],int i) {
		// i is starting index
		
		if(i == a.length-1) {
			return true;
		}
		
		if( a[i] > a[i+1]) {
			return false;
		}
		
		return isSorted(a,i+1);
	}
	
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		
		System.out.print(isSorted(a,0));
	}

}
