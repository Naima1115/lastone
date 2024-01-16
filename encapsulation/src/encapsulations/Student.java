package encapsulations;

import java.util.List;

//write a java program to create a class called student with private instance 
//variables student_id,student_name and grades. provide public getter and setter methods
//to modify the student_id and student_name variables. provide a method called addGrade()
//that allows adding a grade to the grades variable while performing additional validation.

public class Student {
	
	private int student_id;
	private String student_name;
	private List<Double> grades;
	
	public int getStudent_id() {
		
		return student_id;
	}
	
	public void setStudent_id(int student_id) {
		
		this.student_id = student_id;
	}
	
	public String getStudent_name() {
		
		return student_name;
	}
	
	public void setStudent_name(String student_name) {
		
		this.student_name = student_name;
	}
	

	public static void main(String[] args) {
		
		

	}

}
