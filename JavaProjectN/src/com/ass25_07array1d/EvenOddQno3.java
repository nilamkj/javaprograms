package com.ass25_07array1d;
//3.WAP to take array and find even and odd numbers

public class EvenOddQno3 {
	public static void EvenOddQno3(int a[])
	{
		int i,len=a.length;
		
		for(i=0;i<len;i++)		//for loop
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
}
	
	public static void main(String[] args) {
		
		int number[]= {98,15,7,19,24};
		System.out.println("Even numbers from array");
		EvenOddQno3(number);
		
		}

}


