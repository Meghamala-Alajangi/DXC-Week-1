package Javafsd;

import java.util.*;
import java.util.Scanner;

public class Bmi {
	  private String name;
	  private int age;
	  private double weight; 
	  private double height; 
	  public static final double kg = 0.45359237; 
	  public static final double meter = 0.0254;  
	  
	  public Bmi(String name, int age, double weight, double height) {
	    this.name = name;
	    this.age = age;
	    this.weight = weight;
	    this.height = height;
	  }
	  
	  public Bmi(String name, double weight, double height) {
	    this(name, 20, weight, height);
	  }
	  
	 public double getBmi() {
	    double bmi = weight * kg / 
	      ((height * meter) * (height * meter));
	    return Math.round(bmi * 100) / 100.0;
	  }
	  
	  public String getStatus() {
	    double bmi = getBmi();
	    if (bmi < 18.5)
	      return "Underweight";
	    else if (bmi < 25)
	      return "Normal";
	    else if (bmi < 30)
	      return "Overweight";
	    else
	      return "Obese";
	  }
	  
	  public String getName() {
	    return name;
	  }
	  
	  public int getAge() {
	    return age;
	  }
	  
	  public double getWeight() {
	    return weight;
	  }
	  
	  public double getHeight() {
	    return height;
	  }

      public static void main(String[] args)
      {
    	  Bmi bmi1 = new Bmi("person A", 18, 145, 70); 
    	  System.out.println("The BMI for " + bmi1.getName() + " is : " + bmi1.getBmi() + " " + bmi1.getStatus());
    	 
    	  Bmi bmi2 = new Bmi("Person B", 215, 70); 
    	  System.out.println("The BMI for " + bmi2.getName() + " is : "+ bmi2.getBmi() + " " + bmi2.getStatus());
      }
      
}