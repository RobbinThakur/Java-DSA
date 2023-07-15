package string;

public class str2 {
	public static void main(String[] args) {
		String a= "rlk";
		StringBuilder b= new StringBuilder("Robbin");
		 
		b.append(" Hi");
		b.replace(0,3, "CA");
		b.reverse();
		
	
		System.out.println(a);
		System.out.println(b);
	}

}
