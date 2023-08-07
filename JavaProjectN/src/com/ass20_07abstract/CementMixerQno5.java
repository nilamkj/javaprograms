package com.ass20_07abstract;
//5)Create an abstract class equipment with an implemented / concrete method fill and an abstract
//method mix. Create a class Cement_mixer which is a type of equipment and implements method mix.
//Now, add another method pour in the class Cement_mixer. In main method,(Interface)
//a. Create an object of type Cement_mixer and call its fill, mix and pour methods.
//b. Create an object of type Cement_mixer with reference variable of Equipment
//(Equipment e = new Cement_mixer). Check the methods available to e.

abstract class Equipment
{
	public abstract void mix();
	public void fill()
	{
		System.out.println("Fill Method");
	}
}
class Cement_mixer extends Equipment
{
	public void mix()
	{
		System.out.println("Implemented Mix method");
	}
	public void pour()
	{
		System.out.println("pour method");
	}
}
public class CementMixerQno5 {

	public static void main(String[] args) {
		Cement_mixer c=new Cement_mixer();
		c.fill();
		c.mix();
		c.pour();
		
		Equipment e=new Cement_mixer();
		e.fill();
		e.mix();
		//e.pour();	//The method pour() is undefined for the type Equipment
	}

}
