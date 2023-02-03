package Assignment;

import java.util.Scanner;

public class Armstrong 
{
   
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int d,m,n,length,sum=0;
	     System.out.print("Enter number : ");
	     m=n=sc.nextInt();
	     length=Integer.toString(m).length();
	     
	     while(m!=0)
	     {
	    	 d=m%10;
	    	 sum+=(int)(Math.pow(d,  length));
	    	 m=m/10;
	    	 
	     }
	     if(sum==n)
	    	 System.out.println(+ n + " is an Armstrong number");
	     else
	    	 System.out.println(+ n + " is not an Armstrong number");

	}

}
