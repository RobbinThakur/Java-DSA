package recursion;

public class powerofnumbers {
	
	static int power(int a,int b) {
		if(b == 0) return 1;
		 
	
		int subproblem = (a^b-1);
		
		return subproblem*a;
	}
	
	public static void main(String[] args) {
		
		power(2,3);
	}

}
