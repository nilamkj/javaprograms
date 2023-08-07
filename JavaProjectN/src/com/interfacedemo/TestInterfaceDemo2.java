package com.interfacedemo;

interface language
{
	void showName(String name);
	
}
class ProgrammingLanguage implements language
{
	public void showName(String name)
	{
		System.out.println("Programming language name: "+name);
	}
}
class CommunicationLanguage implements language
{
	public void showName(String name)
	{
		System.out.println("Communication language name: "+name);
	}
}
public interface TestInterfaceDemo2 
{
	public static void main(String arg[])
	{
		language ob;
		
		ob=new ProgrammingLanguage();
		ob.showName("Java");
				
		ob=new CommunicationLanguage();
		ob.showName("English");
	}
}
