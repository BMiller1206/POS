//***********************************************************************************************
//Name: Brent Miller
//Program Name: POS
//Date: 060415
//Class POS emulates a typical sales transaction 
//***********************************************************************************************

import java.util.Scanner;//Scanner class which allows the user to read values of various types.
import java.text.DecimalFormat;//DecimalFormat class that allows you to format decimal numbers.

//Name of program
public class POS
{
	//Main 
	public static void main(String args[])
	{		
		//Declaration and initialization of variables
		Scanner in = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		double originalPrice = 0;
		double percentageMarkUp = 0;
		final double SALESTAXRATE = 0.085;
		double sellingPrice = 0;
		double salesTax = 0;
		double finalPrice = 0;
		
		//Ask the user to input the price 
		System.out.println("Please enter the original price of the item:");
		originalPrice = in.nextDouble();//assign input value to originalPrice		
		
		//Ask the user for the percentage of mark-up
		System.out.println("Please enter the percentage of the mark-up:");
		percentageMarkUp = in.nextDouble();//assign input value to percentageMarkUp
					
		//Display the original price
		System.out.println("\nThe original price of the item is: $" + originalPrice);
		
		//Display the marked-up percentage
		System.out.println("The marked-up percentage of the item is: %" + twoDecimal.format(percentageMarkUp));
		
		//Calculate the sellingPrice
		sellingPrice = originalPrice + (originalPrice * percentageMarkUp);
		
		//Display the selling price
		System.out.println("The stores selling price of the item is: $" + twoDecimal.format(sellingPrice));
		
		//Display the sales tax rate
		System.out.println("The sales tax rate is: $" + SALESTAXRATE);
		
		//Calculate the sales tax
		salesTax = sellingPrice * SALESTAXRATE;
		
		//Display the sales tax
		System.out.println("The sales tax for this particular sale is: $" + twoDecimal.format(salesTax));
		
		//Calculate the final price
		finalPrice = sellingPrice + salesTax;
		
		//Display the final sales price
		System.out.println("Your final sales price is: $" + twoDecimal.format(finalPrice));
		
	}//End main
}//End class POS