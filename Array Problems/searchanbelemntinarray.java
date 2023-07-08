package arrays;

public class searchanbelemntinarray {
	
	public static void main(String[] args) {
		
		int a[] = {2,1,4,3,5};
		int key = 3;
		int result=-1;
		//search for key
		
		for(int i =0; i<a.length; i++) {
			if(a[i] == key) {
				result=i;
				break;
				
			}
		}
		
		if( result == -1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Key is present");
		}
		
		
	}

}
