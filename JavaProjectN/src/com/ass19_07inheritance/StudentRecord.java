package com.ass19_07inheritance;
//4.	Declare a class ‘student’ with data members ‘name’ and ‘roll number’. Also declare a class 
//‘Record’ which inherits class ‘student’. Display name and roll number with address by creating the
//object of class ‘Record’.
//public class StudentRecord {

class Student1
{
	String name="Abhi";
	int rollNo=3;
	
	public void showDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rollNo);
	}
}
	class Record extends Student1
	{
		String address="pune";
		public void showDetails()
		{
			System.out.println("Name: "+name);
			System.out.println("RollNo: "+rollNo);
			System.out.println("Address: "+address);
		}

	}
	public class StudentRecord
	{
	public static void main(String[] args) {
		Record r1=new Record();
		r1.showDetails();
		
		

	}

}
