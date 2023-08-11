package BitManupulation;

public class getithbit {
	public static void ithbit(int n,int i) {
		int bitwise = (1<<i);
		
		if((n & bitwise) == 0) {
			System.out.println("0");
		}else {
			System.out.println("1");
		}
	}
	public static void main(String[] args) {
		ithbit(4,6);
	}

}
