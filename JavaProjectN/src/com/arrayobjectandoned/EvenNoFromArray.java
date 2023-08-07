package com.arrayobjectandoned;

public class EvenNoFromArray {
	
	public static void evenNoFromArray(int a[])
	{
		int i,len=a.length;
		
		for(i=0;i<len;i++)		//for loop
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		//for(int n:a) {	//for-each or enhance loop
		//	System.out.println(n);
		//}
	}
	
	public static void main(String[] args) {
		
		int number[]= {12,10,7,9,24};
		System.out.println("Even numbers from array");
		evenNoFromArray(number);
		
		}

}
