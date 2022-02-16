package programAssignment03;

/*
 * Name:				Cameron Leathers
 * Class and Section:	CS 166 01
 * Assignment:			Program Assignment 03
 * Description:			Create a program that takes an order and gives a total using methods
 * Due Date:			1 October 2019
 */

import java.util.Scanner;

public class FastFoodSelection {
	
	public static FastFoodMethod getFoodType(String foodtype) {
		
		double subtotal = 0;
		double grandTotal = 0;
		
		Scanner sc = new Scanner(System.in);
		FastFoodMethod sample = new FastFoodMethod();
		
		System.out.println("Welcome to the fast Food menu\n");
		
		String again = "y";
		while (again.equalsIgnoreCase("y")) {
			System.out.println("Enter your selection: ");
			String select = sc.nextLine();
			System.out.println("Enter how many of this order: ");
			int quantity = Integer.parseInt(sc.nextLine());
			sample.setQuantity(quantity);
			if (select.equalsIgnoreCase("chicken")) {
				sample.setPrice(5.0);
				subtotal = sample.getTotal();
			}
			else if (select.equalsIgnoreCase("fish")) {
				sample.setPrice(9.0);
				subtotal = sample.getTotal();
			}
			else if (select.equalsIgnoreCase("burger")) {
				sample.setPrice(9.0);
				subtotal = sample.getTotal();
			}
			else {
				System.out.println("Please enter a valid selection");
			}
			System.out.println("Subtotal: " + subtotal);
			grandTotal += subtotal;
			System.out.println("Continue? (y/n): ");
			again = sc.nextLine();
		}
		System.out.println("Total: " + grandTotal);
		
		sc.close();
		return sample;
	}

}
