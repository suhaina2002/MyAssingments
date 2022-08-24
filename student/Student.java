package ord.student;

import org.college.College;

public class Student extends College  {
	public void StudentName() {
		System.out.println("Student Name");
	}
		public void StudentDept() {
			System.out.println("Student Dept");
		}
			public void StudentId() {
				System.out.println("Student Id");
			
			
				 
	 }
	 public static void main(String[]args)
	 {
		 Student stu=new Student();
		 stu.StudentDept();
		 stu.StudentId();
		 stu.StudentName();
		 stu.collegeCode();
		 stu.collegeName();
		 stu.collegeRank();
		 stu.Department();
	 }
		}
	

	
