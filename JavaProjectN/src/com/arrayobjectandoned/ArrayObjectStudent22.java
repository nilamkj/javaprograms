package com.arrayobjectandoned;

public class ArrayObjectStudent22 {

	public static void main(String[] args) {
		
		Student22 s1=new Student22(101,"Spana",new double[] {45,67,89});
		s1.display();
		//or
		double m1[]= {34,65,90};
		double m2[]= {67,40,56};
		double m3[]= {94,23,48};
		double m4[]= {73,20,81};
		
		Student22 s2=new Student22(102,"rahul",m1);
		s2.display();
		Student22 s3=new Student22(103,"rajesh",m2);
		s3.display();
		Student22 s4=new Student22(104,"hina",m3);
		s3.display();


	}
}


