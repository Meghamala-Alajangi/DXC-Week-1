package Assignment;

import java.util.Scanner;

public class RabbitsChickens
{
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int Legs,Heads,TH,l,Chickens,Rabbits;
	
	System.out.println("Enter number of Heads : ");
	Heads=sc.nextInt();
	
	System.out.println("Enter number of Legs : ");
	Legs=sc.nextInt();

	TH=Heads*2;
	l=Legs-TH;
	
	if(l%2==0)
	{
		Rabbits=l/2;
		Chickens=Heads-Rabbits;
		System.out.println("Number of Rabbits : "+Rabbits);
		System.out.println("Number of Chickens : "+Chickens);
	}
	else
	{
		System.out.println("The number of Chikens and Rabbits cannot be found");
	}
}
}
