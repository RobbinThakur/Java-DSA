package string;

public class Str {
	
	public static void main(String[] args) {
		String s1 = "Thakur";
		String s2 = "Thakur";
		String s3= new String("Thakur");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		String s4=s1.concat("tttt").replace('r','y');
		System.out.println(s4);
		String s5= s1.toUpperCase();
		System.out.println(s5);
		
		
	
	}

}
