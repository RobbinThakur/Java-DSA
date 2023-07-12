package pattern;

public class butterflypattern {
	public static void butterfly(int n) {
		//outter loop
		for(int i=1;i<=n;i++) {
			//inner loop ( phle stars print krwane k liye)
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			// spaces k liye
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			// last wale stars print krwane k liye
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
	
			System.out.println();
			
		}
		for(int z=n;z>=1;z--) {
			for(int y =z;y>=1;y--) {
				System.out.print("*");
			}
			for(int y=2*(n-z);y>=1;y--) {
				System.out.print(" ");
			}
			for(int y =z;y>=1;y--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		butterfly(7);
		
	}

}
