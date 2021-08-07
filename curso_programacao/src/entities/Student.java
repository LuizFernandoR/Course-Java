package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double average() {
		return grade1 + grade2 + grade3;
	}
	
	public double missing() {
		return 60- (grade1 + grade2 + grade3);
	}
	
	public String toString() {
		return "Final Grade: " + String.format("%.2f", average());
	}
}
