package com.arrayobjectandoned;

class Food{
	
	int foodid;
	String foodname;
	double foodprice;
	
	public Food(int foodid,String foodname,double foodprice)
	{
		this.foodid=foodid;
		this.foodname=foodname;
		this.foodprice=foodprice;
	}
	public void setFoodid(int foodid)
	{
		this.foodid=foodid;
	}
	public int getFoodid()
	{
		return foodid;
	}
	public void setFoodname(String foodname)
	{
		this.foodname=foodname;
	}
	public String getFoodname()
	{
		return foodname;
	}
	public void setFoodprice(double foodprice)
	{
		this.foodprice=foodprice;
	}
	public double getFoodprice()
	{
		return foodprice;
	}
	@Override
	public String toString() {
		return "Food [foodid=" + foodid + ", foodname=" + foodname + ", foodprice=" + foodprice + "]";
	}
	
}
public class ArrayOfObject {

	public static void main(String[] args) {
		Food foods[];
		foods=new Food[5];
		System.out.println("----Food Details----");
		for(Food f:foods)
		{
			System.out.println(f);
		}
		foods[0]=new Food(11,"Pav Bhaji",150);
		foods[1]=new Food(12,"Dosa ",120);
		foods[2]=new Food(13,"Tea ",15);
		foods[3]=new Food(14,"Biryani ",350);
		foods[4]=new Food(15,"Ice Cream ",250);
		//accessing
		//case 1
		System.out.println(foods[0].foodid);
		System.out.println(foods[0].foodname);
		System.out.println(foods[0].foodprice);
		
		//case 2
		System.out.println(foods[1].getFoodid());
		System.out.println(foods[1].getFoodname());
		System.out.println(foods[1].getFoodprice());
		
		//case 3
		System.out.println("---food details by loop---");
		for(int i=0;i<foods.length;i++)
		{	
		System.out.println(foods[i].foodid);
		System.out.println(foods[i].foodname);
		System.out.println(foods[i].foodprice);
		} 
		//case 4
		System.out.println("----food details by for-each loop----");
		for(Food f:foods)
		{
			System.out.println(f.getFoodid());
			System.out.println(f.getFoodname());
			System.out.println(f.getFoodprice());
			System.out.println("---------------------------------------------");
			
		}
		System.out.println("----food details by loop-----");
		for(int i=0;i<foods.length;i++)
		{
			System.out.println(foods[i]);
			System.out.println("---------------------------------------------------");
		}
			
	}

}
