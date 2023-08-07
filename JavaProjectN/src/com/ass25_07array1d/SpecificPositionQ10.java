package com.ass25_07array1d;

import java.util.Scanner;

//10.WAP to insert an element in a specific position into an array.
public class SpecificPositionQ10
{
public static void InsertElement(int arr[],int idx,int n) {
		
		int i,len=arr.length;
		if(idx<len) 
		{
			arr[idx]=n;
		}
		else {
			System.out.println("index not found");
		}
		//by for-each loop
		//for-each loop not useful when we want to modify an array
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age[]= {78,58,96,69,36};
		////float f[]= {3.3f,45.5f,6,71};
		int index,num,i,len=age.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("you can enter index number from 0 to "+(len-1));

		System.out.println("Enter index for that number which you want to replace:");
		index=sc.nextInt();
		System.out.println("Enter the new number:");
		num=sc.nextInt();
		
		InsertElement(age, index, num);
		System.out.println("-----After replacing with new number-----");
		for(i=0;i<len;i++)
		{
			System.out.println(age[i]);
		}
	}

}

