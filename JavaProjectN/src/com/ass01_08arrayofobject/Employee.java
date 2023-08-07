package com.ass01_08arrayofobject;
//3. WAP to create Array of Employees and display the employee data by 
//traversing array. Employee class has (id, name, salary, Dept), Departments 
//has (did, dname). Hint : Object inside object
public class Employee
{
	int id;
	String name;
	double salary;
	Department dept;

	public Employee(int id,String name, double salary,Department dept)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public  Department setDept(Department dept)
	{
		return this.dept=dept;
	}
	public String toString()
	{
		return "Emp id:"+id+"  Emp name: "+name+"  Salary: "+salary;                        
	}
	
	public static void main(String[] args) {
		

	}

}
