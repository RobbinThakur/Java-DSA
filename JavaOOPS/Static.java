package javaOops;

class Rubbu {
	String name;
	int age;
	
	static int count;
	
	
    
	
	public Rubbu() {
		count++;
		System.out.println("person is being created");
	}
}

public class Static {
	
	public static void main(String[] args) {
		
		Rubbu a1=new Rubbu();
		Rubbu a2=new Rubbu();
		
		System.out.println(a1.count);
		
		
		
	}

}
