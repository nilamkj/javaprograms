package com.ass01_08arrayofobject;
//3. WAP to create Array of Employees and display the employee data by 
//traversing array. Employee class has (id, name, salary, Dept), Departments 
//has (did, dname). Hint : Object inside object

public class Department 
{		
	int did;
	String dname;
	
	Department(int did,String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	public void setDid(int did)
	{
		this.did=did;
	}
	public int getDid()
	{
		return did;
	}
	public void setDname(String dname)
	{
		this.dname=dname;
	}
	public String getDname()
	{
		return dname;
	}

	public static void main(String[] args) 
	{
		

	}

}
