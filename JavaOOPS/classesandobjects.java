package javaOops;

class Animal{
	int legs;
	String name;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void walk(int steps) {
		System.out.println("Animal Walked " +steps+ " Steps");
	}
	
	public Animal() {
		System.out.println("Calling the constructor");
	}
	
	public Animal(String newname) {
		System.out.println(newname +" was passed while creating ");
	}
}


public class classesandobjects {
	
	public static void main(String[] args) {
		
		Animal r= new Animal();
		Animal k= new Animal();
		Animal t=new Animal("Thakur");
		
		r.name = "robbin";
		r.legs = 2;
		
		k.name = "kk";
		k.legs = 2; 
		
		System.out.println(r.name +" " + r.legs);
		System.out.println(k.legs + " " + k.name);
		
		r.walk();
		k.walk();
		k.walk(10);
	}

}
