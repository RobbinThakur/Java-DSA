package mathematics;

public class lcm {
	
	static int Lcm(int a, int b) {
		if(a == b) return a;
		if(a < b) return Lcm(b ,a);
		return Lcm(a,b);
	}
	
	public static void main(String[] args) {
		int a=6;
		int b=12;
		
		System.out.println(Lcm(a,b));
		
	}

}
