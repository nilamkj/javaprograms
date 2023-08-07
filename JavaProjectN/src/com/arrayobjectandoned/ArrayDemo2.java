package com.arrayobjectandoned;

public class ArrayDemo2 {

	public static void main(String[] args) {
		//array literal
		char ch[]= {'a','b','c','d','e','f'};
		
		int len=ch.length,i;
		
		System.out.println("Length of ch:"+len);
		System.out.println("First element of ch:"+ch[0]);
		System.out.println("Last element of ch:"+ch[len-1]);
		System.out.println("Last element index no:"+(len-1));
		
		//Accessing array element using loop
		for(i=0;i<len;i++)
		{
			System.out.println("Element of ch at" +i+":"+ch[i]);
		}

	}

}
