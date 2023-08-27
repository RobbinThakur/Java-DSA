package divideConquer;

public class quickSort {
	public static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();	
	}
	
	public static void quicksort(int a[],int si,int ei) {
		if(si >= ei) {
			return;
		}
		
		int pIdx = partition(a,si,ei);
		quicksort(a,si,pIdx-1);
		quicksort(a,pIdx+1,ei);
	}
	
	public static int partition(int a[],int si,int ei) {
		int pivot = a[ei];
		int i = si-1; // jagah bnayega jo element pivot se chotee hpnge unke liye.
		
		for(int j=si;j<ei;j++) {
			if(a[j] <= a[ei]) {
				i++;
				//swap
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				   
			}
			
		}
		i++;
		int temp = a[i];
		a[i] = a[ei];
		a[ei] = temp;
		return i;
	}
	
	
	public static void main(String[] args) {
		int a[] = {6,3,9,8,2,5};
		
		print(a);
		quicksort(a,0,a.length-1);
		print(a);
		
	}

}
