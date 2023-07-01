//Print N natural numbers with recursion
package recursion;

public class printNnaturalnumbers {
	
	static void print(int N) {
		if (N==0) return;
		print(N-1);
		System.out.println(N);
		
	}
	
	public static void main(String[] args) {
		print(5);
		
	}

}
