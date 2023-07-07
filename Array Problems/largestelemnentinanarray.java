package arrays;

public class largestelemnentinanarray {
	
	public static int maxOf(int a[]) {
		if(a.length==0) return -1;
		int maxindex=0;
		for(int i=1;i<a.length;i++) {
			if(a[i] >= a[maxindex]) {
				maxindex=i;
			}
		}
		return maxindex;
	}
	
	public static void main(String[] args) {
		int a[]= {2,5,6,7,4,8};
		int index;
		index=maxOf(a);
		
		System.out.println(a[index]);
		
		
	}

}
