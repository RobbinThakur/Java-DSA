package arrays;

public class deleteanelementfromarray {
	
	public static int delete(int a[], int key) {
		int i=0;
		int n=a.length;
		for(; i<n;i++) {
			if(a[i]==key) {
				break;
			}
			
		}
		if(i == n) return n;
		for (int j=i;j<n-1;j++) {
			a[j]=a[j+1];
		}
		return n-1;
		
	}
	public static void main(String[] args) {
		
		int a[]= {2,1,3,4,5};
		int key=3;
		
		delete(a, key);
		
		for(int r: a) {
			System.out.print(r+" ");
		}
	}

}
