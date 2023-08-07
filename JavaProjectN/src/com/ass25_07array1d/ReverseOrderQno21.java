package com.ass25_07array1d;
//21. WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your output must
//be 78, 37, 29, 45, 90, 3 
public class ReverseOrderQno21 {
	public static void reverseOrder(int a[])
	{
		int i,len=a.length;
		System.out.println("---Array in reverse place");
		for(i=len-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int num[]= {3,90,45,29,37,78};
		reverseOrder(num);
	}

}
