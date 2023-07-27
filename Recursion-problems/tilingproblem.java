package recursion;

public class tilingproblem {
	public static int tilingways(int n) { // size of floor : 2*n
		if(n == 0 || n==1) {
			return 1;
		}
		
		int fnm1 = tilingways(n-1);
		
		int fnm2 = tilingways(n-2);
		
		int totways = fnm1 + fnm2;
		 
		return totways;
	}
	
	public static void main(String[] args) {
		int n = 2;
		
		System.out.print(tilingways(n));
		
	}

}
