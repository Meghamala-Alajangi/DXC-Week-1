package Javafsd;

import java.util.*;

class Fan {
	private static final int
	SLOW =1,MEDIUM=2,FAST=3;
	
	private int speed;
	private boolean f_on;
	private double radius;
	String color;
	
	Fan(){
		speed=SLOW;
		f_on=false;
		radius=5;
		color="blue";
		
	}
	Fan(int speed,double radius,String color,boolean f_on)
	{
		this.speed=speed;
		this.radius=radius;
		this.color=color;
		this.f_on=f_on;
	}
	void display()
	{
		if(f_on==true)
		{
			System.out.println("Fan is on\nthe speed is="+speed+"\nthe color is="+color+"\nthe radius is="+radius);
		}
		else
		{
			System.out.println("Fan is off\nthe color is="+color+"\nthe radius is="+radius);
		}
	}
	void getDetails()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter speed : ");
		speed=s.nextInt();
		System.out.println("Enter f_on : ");
		f_on=false;
		System.out.println("Enter radius : ");
		radius=s.nextInt();
		System.out.println("Enter color : ");
		color=s.next();
		
	}
	void showDetails()
	{
		System.out.println("Speed : "+speed);
		System.out.println("f_on : "+f_on);
		System.out.println("Radius : "+radius);
		System.out.println("Color : "+color);
	}


public static void main (String[] args)
{
	Fan obj=new Fan();
	Fan obj1=new Fan(MEDIUM,5,"blue",true);
	obj.display();
	obj1.display();
}
	
}

