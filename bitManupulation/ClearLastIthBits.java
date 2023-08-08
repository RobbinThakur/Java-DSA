package BitManupulation;

public class ClearLastIthBits {
	public static int clearlast(int n,int i) {
		int bitmask = ((-1) << i);
		
		return (n & bitmask);
	}
	public static void main(String[] args) {
		System.out.println(clearlast(7,2));
	}

}
