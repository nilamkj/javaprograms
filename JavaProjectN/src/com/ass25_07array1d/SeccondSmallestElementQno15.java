package com.ass25_07array1d;
//15.WAP to find the second smallest element in an array.
public class SeccondSmallestElementQno15 {
	public static void secondSmallestElement(int a[])
	{
		int i,len=a.length;
		int min=a[0],secondmin=a[1];
		
		for(i=0;i<len;i++)
		{
			if(a[i]<min)
			{
				secondmin=a[i];
			}
			else
				if(a[i]<secondmin && min<a[i])
				{
					secondmin=a[i];
				}
		}
		System.out.println("Min: "+min);
		System.out.println("Second min: "+secondmin);
	}
	public static void main(String[] args) {
		int num[]= {-20,0,-25,15,19,37,23};
		secondSmallestElement(num);

	}

}
