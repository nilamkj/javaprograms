package com.lab_20_07_23.service;
import com.lab_20_07_23.model.sub.Employee;

public class EmployeeService extends Employee {
	
	public static boolean isGreater;
	
	
	public EmployeeService(int personId,String name,int personAge,String designation)
	{
		super(personId,name,personAge,designation);
	}
	
	public boolean isEligibleForRetirement()
	{
		if(personAge>=60)
		{
			return isGreater=true;
		}
		else
		{
			return isGreater=false;
		}
		
	}

}
