package com.ass20_07abstract;
//6) A company has employees and wants to keep a track of their names, id and hours of work.
//The employees are specifically categorised into part-time and full-time. Salary needs to be calculated
//for both however, where part-time employees get 200 rs. Per hour and Full-time employees get 500 rs.
//per hour. Write a program which does the same.
abstract class Company
{
	String name;
	int id;
	double workHrs;
	abstract void partTime();
	abstract void fullTime();
	Company(String name,int id,double workHrs)
	{
		this.name=name;
		this.id=id;
		this.workHrs=workHrs;
	}	
}
class Employee extends Company
{
	String name;
	int id;
	double workHrs;
	Employee(String name,int id,double workHrs)
	{
		super(name,id,workHrs);
	}
	@Override
	void partTime( ) {
		
		double salary=workHrs*200;
		System.out.println("Part-time employees salary: "+salary);
	}
	@Override
	void fullTime() {
		double salary=workHrs*500;
		System.out.println("Full-time employees salary: "+salary);
	}
}
public class CompanyQno6 {

	public static void main(String[] args) {
		Company e=new Employee("Shivani",202,7.30);
		e.partTime();
		e.fullTime();

	}

}
