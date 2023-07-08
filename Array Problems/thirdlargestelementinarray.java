package arrays;

public class thirdlargestelementinarray {
	
	public static void main(String[] args) {
		
		int a[]={19, -10, 20, 14, 2, 16, 10};
		int large=0;
		int secondlarge =-1;
		int thirdlarge=-2;
		int b=a.length;
		if (b < 2) {
			System.out.println("-1");
		}
		for(int i=1;i<b;i++) {
			if(a[i] >= a[large]) {
				thirdlarge = secondlarge;
				secondlarge = large;
				large = i;
			}else if (secondlarge == -1 || a[i] >= a[secondlarge] ) {
				thirdlarge = secondlarge;
				secondlarge = i;
			}else if (thirdlarge == -2 || a[i] > a[thirdlarge]) {
				thirdlarge = i;
			}
		}
		
		System.out.println(a[thirdlarge]);
	
		
		
		
		
		
	}

}
