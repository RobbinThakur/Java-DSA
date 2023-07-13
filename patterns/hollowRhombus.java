package pattern;

public class hollowRhombus {
	public static void khaalirhombus(int totrows, int totcols) {
		//outer loop for lines
		for(int i=1;i<=totrows;i++) {
			//inner loop
			for(int j=1;j<=totrows-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=totcols;j++) {
				if(i==1||i==totrows||j==1||j==totcols) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		khaalirhombus(5,9);
	}

}
