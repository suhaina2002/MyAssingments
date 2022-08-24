package org.college;

import org.department.DepartmentName;

public class College extends DepartmentName {
	public void collegeName() {
		System.out.println("College Name");
	}
		public void collegeCode() {
			System.out.println("College Code");
		}
			public void collegeRank() {
				System.out.println("College Rank");
				

		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  College coll=new College();
  coll.collegeCode();
  coll.collegeName();
  coll.collegeRank();
  coll.Department();
	}

}
