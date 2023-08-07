package com.interfacedemo;

interface Cng_car
{
	void drive();
	void cng_car_kit();
}
interface Petrol_car
{
	void drive();
	void petrol_car_kit();
}

class HybridCar implements Cng_car,Petrol_car
{
	public void drive()
	{
		System.out.println("driving a hybrid car");
	}
	public void petrol_car_kit()
	{
		System.out.println("petrol kit");
	}
	public void cng_car_kit()
	{
		System.out.println("car kit");
	}

}
public interface TestInterfaceMulti {
	public static void main(String arg[])
	{
		HybridCar h= new HybridCar();
		h.drive();
		h.petrol_car_kit();
		h.cng_car_kit();
	}
}
