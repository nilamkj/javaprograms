package com.ass_methodoverriding;
//1) WAP to create a class Kid with method readBook() and another method readBook () with 2
//parameters. The method readBook here is over-loaded (same method name but different
//parameters) Create a class BigKid which extends Kid created above. Implement readBook() differently in
//BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()

class Kid
{
	public void readBook()
	{
		System.out.println("read a book ");
	}
	public void readBook(String name, int page)
	{
		System.out.println("read a book "+name+" of pages "+page);
	}
}
class BigKid extends Kid
{
	public void readBook()
	{
		System.out.println("Read a book");
	}
}
public class KidPolymorphism {

	public static void main(String[] args) {
		Kid k=new Kid();
		k.readBook();
		k.readBook("java",100);
		
		BigKid b=new BigKid();
		b.readBook();
		b.readBook("php",179);
		
		
	}

}
