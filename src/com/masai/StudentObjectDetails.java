package com.masai;

public class StudentObjectDetails {
	int rollNo = 12345;
	String name = "vineet";
	int mark = 34;
	
	
	

	void displayStudentDetails() { 
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(mark);
	}
	

	public static void main(String[] args) {
	
		StudentObjectDetails d1 = new StudentObjectDetails();
		d1.displayStudentDetails();
	
	}

}
