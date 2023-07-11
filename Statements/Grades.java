package JavaTutorial;

public class Grades {
	
	public static void main(String[] args) {
		
		int marks = 98;
		
		if(marks>90) {
			System.out.println("A+");
		} else if (marks > 80) {
			System.out.println("A");
		} else if (marks > 70) {
			System.out.println("B+");
		}else if(marks>60) {
			System.out.println("B");
		}else {
			System.out.println("Fail");
		}
	}

}
