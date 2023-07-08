package arrays;

public class secondlargest {
	
	public static int secondLargest(int a[]) {
		if(a.length < 2) return -1;
		int largest=0;
		int secondlargest = -1;
		
		for(int i=1;i<a.length;i++) {
			if(a[i] > a[largest]) {
				
				secondlargest=largest;
				largest=i;
			}else if(secondlargest == -1 || a[i] > a[secondlargest]) {
				secondlargest = i;
			}
		}
		return secondlargest;
	}
	
	public static void main(String[] args) {
		int a[]= {2,4,6,5,7 };
		
		int index = secondLargest(a);
		System.out.println(a[index]);
		
	}

}
