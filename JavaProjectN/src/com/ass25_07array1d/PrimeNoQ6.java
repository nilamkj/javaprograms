package com.ass25_07array1d;

//6.WAP to take array and print prime numbers

public class PrimeNoQ6
{
	public static void primeNo(int a[])
	{
		int len=a.length;
		int i,count=0,n=0;
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}if(count==0)
		{
			System.out.println("Prime Numbers are: "+a[i]);
		}
		
	}


	public static void main(String[] args) {
				
		int n[]=new int[] {34,5,89,21,9,10,32};
		int len=n.length;
		for(int i=0;i<len;i++)
		{
		primeNo(n);
		}
	}
}
