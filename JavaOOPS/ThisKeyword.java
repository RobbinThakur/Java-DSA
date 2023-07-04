package javaOops;

class Thakur {
	int age;
	String name;
	
	static int count;
	
	public Thakur() {
		count++;
		System.out.println("created");
	}
	
	public Thakur( String name , int age) {
		this();
		this.name=name;
		this.age=age;
	}
}
public class ThisKeyword {
	
	public static void main(String[] args) {
		
		Thakur oo=new Thakur("Robbin",19);
		
		System.out.println(Thakur.count);
		
		System.out.println(oo.age);
		
	}

}
