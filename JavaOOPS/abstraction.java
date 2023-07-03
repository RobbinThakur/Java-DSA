package javaOops;

abstract class Animal{
	abstract void walk();
	Animal(){
		System.out.println("Creating a animal");
	}
	
	
	

}

class Horse extends Animal {
	Horse(){
		System.out.println("Horse created");
	}
	public void walk() {
		System.out.println("walks with 4 legs");
		
	}
}

class chicken extends Animal{
	public void walk() {
		System.out.println("this is chicken");
	}
}

public class abstraction {
	
	public static void main(String[] args) {
		Horse horse = new Horse();
		horse.walk();
	}

}
