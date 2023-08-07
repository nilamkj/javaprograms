package com.ass01_08arrayofobject;
//1. WAP to create Array of Employees and display the employee data by 
//traversing array. Employee class has (id, name, salary)
//2. Same Employee array but print only those employee who has salary greater 
//than 10000.

public class Employee1
	{
	 
		int id;
		String name;
		double salary;

		public Employee1(int id,String name, double salary)
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
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
		public String toString()
		{
			return "Emp id:"+id+"  Emp name: "+name+"  Salary: "+salary;                        
		}
		
		public static void main(String[] args) {
			Employee1 e[]=new Employee1[3];
			
			System.out.println("Employee Details");
			
			e[0]=new Employee1(1,"Ulka",25000);
			e[1]=new Employee1(2,"Shivani",55000);
			e[2]=new Employee1(3,"Neha",5000);
			
			
			for(Employee1 a:e)
			{
				System.out.println(a);
//					System.out.print(a.id+"\t");
//					System.out.print(a.name+"\t");
//					System.out.println(a.salary);
			}
			System.out.println();
			System.out.println("Employees whos salary is greater than 10000");
			for (Employee1 sal:e)
			{
				if(sal.getSalary()>10000)
				{
					System.out.println(sal);
//					System.out.print(sal.getId()+"\t");
//					System.out.print(sal.getName()+"\t");
//					System.out.println(sal.getSalary());

				}
			}
		}
	}


