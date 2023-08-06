package BitManupulation;

public class bitwise {
	public static void main(String[] args) {
	// Binary And(&)
	System.out.println("Binary And of 5 & 6 :" + (5 & 6));
	
	// Binary OR(|)
	System.out.println("Binary OR of 5 | 6 :" + (5 | 6));
	
	// Binary XOR(^)
	System.out.println("Binary XOR of 5 ^ 6 :" + (5 ^ 6));
	
	// Binary 1's Complement(~)   --- NOT
	System.out.println("Binary 1's Complement of 5:" + (~5));
	
	//Binary left shift  a<<b = a*2^b
	System.out.println("Binary left shift of 5<<2 :" + (5<<2));
	
	//Binary right shift a>>b = a/2^b
	System.out.println("Binary Right shift of 6>>1 :" + (6>>1));

}
}
