package com.arrayobjectandoned;
//WAP to print array in reverse
public class PrintArrayReverse {

	public static void main(String[] args) {
		
		int arr[]= {34,56,33,67,88};
		int i,len=arr.length;
		
		//print array in reverse order
		
		System.out.println("-----Array in Reverse-----");
		
		for(i=len-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
