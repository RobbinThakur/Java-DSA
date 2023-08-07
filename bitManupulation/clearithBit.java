package BitManupulation;

public class clearithBit {
	public static int clear(int n,int i) {
		int bitmask = ~(1<<i);
		
		return (n & bitmask);
	}
	public static void main(String[] args) {
		System.out.print(clear(10,1));
	}

}
