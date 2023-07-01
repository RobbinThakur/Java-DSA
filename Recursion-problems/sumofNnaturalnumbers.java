package recursion;

public class sumofNnaturalnumbers {
	
	static int add(int N) {
		if (N == 0) return 1;
		
		return add (N-1) + N;		
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(5));
		
	}

}
