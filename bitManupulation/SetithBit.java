package BitManupulation;

public class SetithBit {
	public static void Set(int n,int i) {
		int bitmask = 1<<i;
		
		System.out.println((n | bitmask));
	}
	
	public static void main(String[] args) {
		Set(10,2);
	}

}
