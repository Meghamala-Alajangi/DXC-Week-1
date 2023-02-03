package Assignment;

import java.util.Scanner;

public class FoodCorner {
	public static int calculate(String FoodType,int quantity,int dist) {
		int total = 0;
		int FoodPrice = 0;
		if(FoodType.equalsIgnoreCase("V")) 
		{
			FoodPrice = 12;			
		}
		else 
		{
			FoodPrice = 15;
		}
		total = FoodPrice * quantity;
		if(dist>3)
		{
			dist = dist -3;
			
			if(dist <=3) 
			{
				total = total+ (dist*1);
			}
			else 
			{
				total = total + (3*1);
				total = total + ((dist-3)*2);
			}
			
		}
		return total;
	}
	private static boolean isValidData(String FoodType,int quantity,int dist) {
		if(!(FoodType.equalsIgnoreCase("V")|| FoodType.equalsIgnoreCase("N"))) {
			return false;
		}
		if(dist <= 0)
		{
			return false;
		}
		if(quantity < 1) 
		{
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int totalBill = -1;		
		
		Scanner inScanner = new Scanner(System.in); 
		
	    System.out.println("Enter FoodType (V/N) : ");
	    String FoodType = inScanner.next();
	    System.out.println("Enter Quantity : ");
	    Integer quantity = inScanner.nextInt();
	     System.out.println("Enter Distance : ");
	    Integer dist = inScanner.nextInt();
		
	    if(isValidData(FoodType, quantity, dist))
	    {
			totalBill = calculate(FoodType, quantity, dist);	
		}
		System.out.println("Total Bill : "+totalBill);
		inScanner.close();
		System.exit(0);
		
	}
}

