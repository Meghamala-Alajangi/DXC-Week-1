package Assignment;

import java.util.*;
class movieTickets
{
	private int movieId;
	private int noOfSeats;
	private double costPerTicket;
	
	public movieTickets(int movieId,int noOfSeats)
	{
		this.movieId=movieId;
		this.noOfSeats=noOfSeats;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double getCostPerTicket() {
		return costPerTicket;
	}

	public void setCostPerTicket(double costPerTicket) {
		this.costPerTicket = costPerTicket;

	}
}
public class MovieTicket {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Movie ID : ");
		int id=sc.nextInt();
		System.out.println("Enter the number of seats : ");
		int seats=sc.nextInt();
		movieTickets m=new movieTickets( id , seats);
		int iD=m.getMovieId();
		double S=m.getNoOfSeats();
		double total;
		double tax;
		if(iD==111)
		{
			m.setCostPerTicket(7);
			tax=S*m.getCostPerTicket()*0.02;
			total=tax+S*m.getCostPerTicket();
			System.out.println("Total amount of booking is "+Math.round(total));
		}
		else if(iD==112)
		{
			m.setCostPerTicket(8);
			tax=S*m.getCostPerTicket()*0.02;
			total=tax+S*m.getCostPerTicket();
			System.out.println("Total amount of booking is "+Math.round(total));
		}
		else if(iD==113)
		{
			m.setCostPerTicket(8.5);
			tax=S*m.getCostPerTicket()*0.02;
			total=tax+S*m.getCostPerTicket();
			System.out.println("Total amount of booking is "+Math.round(total));
		}
		else
		{
			System.out.println("Sorry! Please enter valid movie Id and number of seats");
		}
	}

}