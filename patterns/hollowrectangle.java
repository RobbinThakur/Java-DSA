package pattern;

public class hollowrectangle {
	
	public static void hollow(int totrows, int totcols) {
		//outter loop
		for(int i = 1;i<=totrows;i++) {
			//inner loop
			for(int j=1;j<=totcols;j++) {
				//boundary 
				if (i==1 || i==totrows || j == 1 || j == totcols) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		hollow(10,15);
	}

}
