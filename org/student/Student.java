package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Rupesh");
	}

	public void studepartment() {
		System.out.println("IT dept");
	}

	public void studentId() {
		System.out.println("12554989");
	}
	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.departmentName();
		stu.studentId();
		stu.studentName();
		stu.studepartment();
	}
}
