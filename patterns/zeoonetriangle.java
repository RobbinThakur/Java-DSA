package pattern;

public class zeoonetriangle {
	public static void zeroone(int n) {
		//outer loop
		for(int i = 1;i<=n;i++) {
			//inner loop
			for(int j=1;j<=i;j++) {
				//for printing 0 or 1
				if((i+j)%2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		zeroone(5);
	}

}
