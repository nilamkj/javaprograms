package com.ass19_07inheritance;
//1.Declare a class ‘Student’ with data members ‘name’, ‘roll number’ and ‘marks’. Also declare a 
//class ‘MyRecord’ which inherited from class ‘Student’. Display name, roll number and percentage by 
//creating the object of class MyRecord.

class Student 
{
	String name="Renu";
	int rollNo=21;
	int marks=87;
	
	public void show()
	{
		System.out.println("Name= "+name+"\nRoll No= "+rollNo+"\nMarks= "+marks);
	}
}
class MyRecord extends Student
{
	double percentage=75;
	public void show()
	{
		System.out.println("Name= "+name+"\nRoll No= "+rollNo+"\nMarks= "+marks+"\nPercentage= "+percentage);
	}
}
public class StudentInheritance {

	public static void main(String[] args) {
		MyRecord m=new MyRecord();
		m.show();

	}

}
