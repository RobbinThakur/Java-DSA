//jab koi function apne ap ko hi call kre toh usse recursion kehte hai 
package recursion;

public class mainclass1 {
	static int i = 0;
	static void dummyfunction() {
		System.out.println(i++);
		dummyfunction();
	}
	
	public static void main(String[] args) {
		dummyfunction();
		
	}

}
