package Assignment;

import java.util.Scanner;

public class LuckyNumber {
	
	public static String verify(int num) {
		String numString = Integer.toString(num);
		int total=0;
		for(int i=0;i<numString.length();i++) {
			int indexValue=i+1;
			if(indexValue%2==0) {
				int placeValue=Integer.parseInt(""+numString.charAt(i));
				total=total+(placeValue*placeValue);
			}
		}
		if(total !=0 && total%9==0) {
			return"The number "+num+" is a lucky number";
		}
		return"The number "+num+" is not a lucky number";
	}
	
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		Integer inputNum=inScanner.nextInt();
		System.out.println(verify(inputNum));
		inScanner.close();
		System.exit(0);
				
	}
}