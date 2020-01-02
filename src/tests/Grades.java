package tests;

import java.util.Scanner;

public class Grades {
	
	private int marks;
	
	private String student;
	
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	/**
	 * @return the student
	 */
	public String getStudent() {
		return student;
	}
	
	/**
	 * @param student the student to set
	 */
	public void setStudent(String student) {
		this.student = student;
	}
	
	private Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		//new Grades().showMarks();
		System.err.println("Hello World from JAVA TECH");
		
	}
	
	public void showMarks() {
		try {
			System.out.println("Enter your name: ");
			student = scanner.nextLine();
			
			System.out.println("Enter your marks: ");
			marks = scanner.nextInt();
			
		}
		catch (ArithmeticException e) {
			System.out.println("Enter an intger");
			
		}
		catch (Exception e) {
			System.err.println("Enter a string" + e.getMessage());
		}
		finally {
			scanner.close();
		}
		System.out.println(student+" obtained "+marks);
		
	}
	
}
