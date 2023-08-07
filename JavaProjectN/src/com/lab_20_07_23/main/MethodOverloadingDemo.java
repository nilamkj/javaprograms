package com.lab_20_07_23.main;
import com.lab_20_07_23.service.EmployeeService;

public class MethodOverloadingDemo extends EmployeeService
{
	MethodOverloadingDemo(int personId, String name, int personAge, String designation)
	{
		super(personId, name, personAge, designation);
		
	}
//	public void add(int a,float b)
//	{
//		System.out.println("Add-int,float "+a+"\n"+b);
//	}
	public static void main(String[] args) {
		MethodOverloadingDemo m1=new MethodOverloadingDemo(111, "Ulka", 25, "Software Developer");
		//m1.add(2, 4f);
		boolean ans=m1.isEligibleForRetirement();
		System.out.println(ans);
	}

}
