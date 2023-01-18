package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student name is Priya");

	}
	
	public void studentDept() {
		System.out.println("Depeartment is ECE");

	}
	
	public void studentId() {
		System.out.println("Id is 765");

	}
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}

}
