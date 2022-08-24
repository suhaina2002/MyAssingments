package org.system;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id ,String name) {
		System.out.println(id+" "+ name);
	}
	public void getStudentInfo(String email ,int phonenumber) {
		System.out.println(email+" "+ phonenumber);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.getStudentInfo(1);
		s.getStudentInfo(1, "suhai");
		s.getStudentInfo("suhai@gmail.com", 12345890);
		
		

	}

}
