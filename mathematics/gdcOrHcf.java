package mathematics;

public class gdcOrHcf {
	
	static int gcd(int a,int b) {
		System.out.println(a+" "+b);
		if(a == b) return a;
		if(a < b) return gcd(b,a);
		return gcd(a-b, b);
	}
	
	public static void main(String[] args) {
		int a=36;
		int b=24;
		
		System.out.println(gcd(a,b));
	}

}
