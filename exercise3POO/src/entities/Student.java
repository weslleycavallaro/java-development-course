package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double calculateGrade() {
		
		return grade1 + grade2 + grade3;
		
	}
	
	public String toString() {
		
		if(calculateGrade() >= 60 ) {
		
			return "FINAL GRADE = " + calculateGrade() + "\nPASS";
		
		}else {
			
			return "FINAL GRADE = " + calculateGrade() + "\nFAILED \nMISSED " + (60 - calculateGrade()) + " POINTS";
			
		}
	}
}
 