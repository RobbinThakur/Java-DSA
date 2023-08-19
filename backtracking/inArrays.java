package backtracking;

public class inArrays {
	public static void changearray(int a[],int i ,int val) {
		if(i==a.length) {
			print(a);
			return;
		}
		
		a[i] = val;
		changearray(a,i+1,val+1);
		a[i] = a[i] - 2;
	}
	
	public static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int a[] = new int[5];
		changearray(a,0,1);
		print(a);
	}

}
