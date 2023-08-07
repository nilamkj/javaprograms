package com.ass19_07inheritance;
//3.	Define a class ‘Human’ having data members name and gender. Create classes ‘Woman’ and ‘Man’ 
//derived from ‘Human’ having data member age in both. Create objects of ‘Man’ and ‘Woman’ having a 
//constructor to initialize all data members (including super class) for both classes. Define method find()
//in ‘Human’ to pass objects of ‘Man’ and ‘Woman’. It will find who is elder.
class Human 
{
	String name;
	String gender;
	
	public Human(String name,String gender)
	{
		this.name=name;
		this.gender=gender;
	}	
		public void find(int mAge,int wAge)
		{
			if(mAge>wAge)
			{
				System.out.println(name+" :Man is elder");
			}
			else
			{
				System.out.println(name+" :Woman is elder");
			}
		}
}

class Woman extends Human 
{
	public Woman(String name,String gender)
	{
		super(name, gender);
	}
}

class Man extends Human
{
	public Man(String name,String gender)
	{
		super(name, gender);
	}
}
public class HumanQno3 {

	public static void main(String[] args) {
		Human h=new Woman("Shreya","F");
		h.find(23, 31);
		
		h=new Man("Aditya","M");
		h.find(40,25);

	}

}
