package com.revature.ui;

import java.util.Scanner;

import com.revature.pojo.Car;

public class PromptCostumer implements Screen{
	
	public static int choice;
	public static Scanner input;
	public static Car car = new Car();

@Override
public void display() {
//	System.out.println(emplyeeOptions);
	
	input = new Scanner(System.in);
	
do {	
	
	System.out.println("You are a costumer!"
			+ "\nPlease enter the following choices "
			+ "\n[1]View Cars"
			+ "\n[2]Offer for a car"
			+ "\n[3]View owned cars"
			+ "\n[4]View remainin payments");
	
	choice=input.nextInt();
		
switch(choice) {

	case 1 :
			viewcars();
			break;
	case 2: 
			offerCar();
			break;
	case 3:
			viewOwnedCars();
			break;
	case 4: 
			remainingPayments();
		 	break;
	default: 
			System.out.println("Invalid choices");
		}
	
	}

	while(choice!=1 && choice!=2 && choice!=3 && choice!=4);

	}
	
	private void viewcars() {
		System.out.println(Car.carlist);
		display();
	}


	private void remainingPayments() {
		System.out.println("These are your remaining payments");
		display();
	}


	private void offerCar() {
		System.out.println("Offering a car");
		display();
	}
	
	private void viewOwnedCars() {
		System.out.println("These are the cars you own");
		display();
	
	}



	


	

}
