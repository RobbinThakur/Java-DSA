package backtracking;

public class gridways {
	
	public static int grid(int i,int j,int n,int m) {
		//base
		if(i == n-1 && j == m-1) {
			return 1;
		}
		
		//ek or casee likhenge takii grid se hi bhar na chle jaaye
		
		else if(i == n || j == m) {
			return 0;
		}
		
		
		
		//kaam
		return grid(i+1,j,n,m) + grid(i,j+1,n,m);
	}
	
	public static void main(String[] args) {
		int n=3;
		int m=3;
		
		System.out.println("The total no. of ways is : " + grid(0,0,n,m));
		
		
	}

}
