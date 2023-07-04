package javaOops;

interface Ani{
	int eyes = 2;
	void walk();
	
}

interface mal{
	int nose = 1;
	void run();
	
}
// This is multiple Inheritance (jb do base class ko ek hi derived class use kr rhi ho)
class Hor implements Ani, mal{
	public void walk() {
		System.out.println("Walks on 4 legs");
	}
	public void run() {
		System.out.println("Runs very fast");
	}
}

public class interfaces {
	public static void main(String[] args) {
		Hor horse = new Hor();
		horse.walk();
		System.out.println("Eyes =" + " " +horse.eyes);
		horse.run();
		System.out.println("Nose =" + " " + horse.nose);
	}

}
