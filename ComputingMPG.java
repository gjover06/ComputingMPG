/**
Author:George Samu
Date:5/24/2020
Purpose: Chapter 3 number 7

*/

import java.util.Scanner;

public class ComputingMPG
{
	public static void main (String[]args)
	{
	//Collecting information
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please enter your name: ");
	String name =keyboard.nextLine();
	
	System.out.println(" What is your vehicle name: ");
	String vehicleInformation= keyboard.nextLine();
	
	//number of gasoline used
	System.out.println(" Please enter the number of gallons of gasoline used ");
	double numberOfGallons= keyboard.nextDouble();
	
	//initial and final odometer usage
	System.out.println("what is the initial odometer reading? ");
	int initialOdometer=keyboard.nextInt();
	
	System.out.println();
	
	System.out.println("what is the final odometer reading? ");
	int finalOdometer=keyboard.nextInt();
	
	//compute
	int milesTraveled= finalOdometer - initialOdometer;
	
	//conversion (milesTraveled)*(1.6009344/1mile)
	double kmTraveled= milesTraveled * (1.609344);
	
	// (miles traveled)/(numberOfGallons)
	double MPG= milesTraveled/numberOfGallons;
	
    //(miles/gallons)*(1 gallon/3.785412 L)* (1.6009344/1mile)
	double KPL= MPG * (1/3.785412) * (1.6009344/1);
	
	//Print on Screen
	System.out.println("Jamie, here are the statistic of "+
						"your recent trip in your jeep:");
	System.out.println("Initial odometer reading: "+ initialOdometer);
	System.out.println("Final odometer reading: "+ finalOdometer);
	System.out.println("Miles traveled: "+ milesTraveled);
	System.out.println("kilometers traveled: "+ kmTraveled);
	System.out.println("Miles per gallon: " + MPG);
	System.out.println("kilometers per liter: "+ KPL);
	
	}//end main

}//end ComputingMPG