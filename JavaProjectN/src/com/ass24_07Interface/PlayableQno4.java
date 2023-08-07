package com.ass24_07Interface;
//4.Write a Java program to create an interface Playable with a method play() that takes no arguments 
//and returns void. Create three classes Football, Volleyball, and Basketball that implement the Playable 
//interface and override the play() method to play the respective sports.



 interface Playable
{
	void play();
}
class Football implements Playable
{
	public void play()
	{
		System.out.println("Playing Football");
	}
}
class Valleyball implements Playable
{
	public void play()
	{
		System.out.println("Playing Valleyball");
	}
}
class Basketball implements Playable
{
	public void play()
	{
		System.out.println("Playing Basketball");
	}
}
public interface PlayableQno4
{
	public static void main(String []arg)
	{
		Playable fooball=new Football();
		Playable valleyball=new Valleyball();
		Playable basketball=new Basketball();
		
		fooball.play();
		valleyball.play();
		basketball.play();
		}
}