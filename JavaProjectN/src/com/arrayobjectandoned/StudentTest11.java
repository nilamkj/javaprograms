package com.arrayobjectandoned;

public class StudentTest11 {
	//find which student got marks greater than 80
	public static void showNames(Student11 s[])
	{
		int i,len=s.length;
		for(i=0;i<len;i++)
		{
			if(s[i].getMarks()>=80)
			{
				System.out.println(s[i]);
			}
		}
	}

	public static void main(String[] args) {
		Student11 stuarr[];
		
		stuarr=new Student11[5];
		
		System.out.println(stuarr[0]);
		System.out.println(stuarr[1]);

		stuarr[0]=new Student11(11,"rahul",75);
		stuarr[1]=new Student11(12,"swati",55);
		stuarr[2]=new Student11(13,"leena",89);
		stuarr[3]=new Student11(14,"asha",90);
		stuarr[4]=new Student11(15,"prasad",87);
		
		//how to display elements
		System.out.println(stuarr[0]); //toString
		System.out.println(stuarr[1]);
		System.out.println(stuarr[2]);
		System.out.println(stuarr[3]);
		System.out.println(stuarr[4]);
		
		System.out.println("---Student details by using for loop----");
		
		for(int i=0;i<stuarr.length;i++)
		{
			System.out.println(stuarr[i]);
		}
		
		System.out.println("---Students details by using for-each loop---");
		
		for(Student11 s:stuarr)
		{
			System.out.println(s);
		}
		System.out.println("---Student name who got marks>80----");
		showNames(stuarr);
		
	}

}
