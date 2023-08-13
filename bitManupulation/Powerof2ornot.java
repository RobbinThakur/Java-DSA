package BitManupulation;

public class Powerof2ornot {
	public static boolean IsPowerOfTwo(int n) {
		return ((n&(n-1)) == 0);
	}
	public static void main(String[] args) {
		System.out.println(IsPowerOfTwo(4));
		System.out.println(IsPowerOfTwo(10));
		System.out.println(IsPowerOfTwo(64));
	}

}
