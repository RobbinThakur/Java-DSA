package BitManupulation;

public class clearRangeOfBits {
	public static int clearrange(int n, int i,int j) {
		int a = ((-1) << j+1);
		int b = ((1<<i) -1);
		
		int bitmask = a|b;
		
		return (n & bitmask);
		
	}
	public static void main(String[] args) {
		System.out.println(clearrange(15,1,7));
	}

}
