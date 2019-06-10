package com.revature.services;
import java.util.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CarLogin {

	private static final Scanner SCAN = new Scanner(System.in);
	
	String uName (String username) {
		
		String input = SCAN.next();
		
		if (input == "Jean") {
			System.out.println("Please enter password");
			
			String password = SCAN.next();
			
			if (password == "1234") {
				System.out.println("You are an employee!\n"
					+ "What would you like to do today?\n"
					+ "Add cars[1]\n"
					+ "Accept or Reject Offer[2]\n"
					+ "Remove Cars[3]\n"
					+ "View all payments[4]");
			}
		}
		
		return input;
		
		
	}
//	public static void main (String[] args) {
//		Scanner myObject = new Scanner(System.in);
//		
//		String identifier;
//		
//		// Welcome message 
//		System.out.println("Welcome to my car dealership application\n"
//				+ "Please log in with your USERNAME\n"
//				+ "Need an account?  Register now, type 'register'");
//		identifier = myObject.next();
//		
//		
////	int ui = 0;
////	switch (ui) {
////	case 1:
////		System.out.println("You are an employee!\n"
////				+ "What would you like to do today?");
////	break;
////	case 2:
////		System.out.println("You are a costumer!\n"
////				+ "What would you like to do today?");
////	break;
////	}
//			
//	
////		if (identifier ) {
////		System.out.println("You are an employee!\n"
////				+ "What would you like to do today?\n"
////				+ "Add cars[1]\n"
////				+ "Accept or Reject Offer[2]\n"
////				+ "Remove Cars[3]\n"
////				+ "View all payments[4]");
////		} else if (identifier ) {
////		System.out.println("You are a costumer!\n"
////				+ "What would you like to do today?\n"
////				+ "View cars[1]\n"
////				+ "Offer for a car[2]\n"
////				+ "View owned cars[3]\n"
////				+ "View remaining payments[4]");
////		} else {
////			identifier = myObject.nextInt();
////		}
////		
////	}
////		
//
//	JOptionPane.showMessageDialog(null, "Invalid Log in \n"
//		+ "Please input the number 1 or 2", null, JOptionPane.ERROR_MESSAGE);
//
//}
//
//	private static Class<Integer> type(int identifier) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
