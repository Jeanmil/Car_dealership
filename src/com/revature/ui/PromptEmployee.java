package com.revature.ui;

import java.util.Scanner;

import com.revature.pojo.Car;

public class PromptEmployee implements Screen{
	
	
		public static int choice;
		public static Scanner input;
		public static Car car = new Car();

	@Override
	public void display() {
//		System.out.println(emplyeeOptions);
		
		input = new Scanner(System.in);
		
	do {	
		
		System.out.println("Please enter the following choices "
				+ "\n[1]View Cars"
				+ "\n[2]Add Car"
				+ "\n[3]Remove Car"
				+ "\n[4]Offer Status");
		
		choice=input.nextInt();
			
	switch(choice) {
	
		case 1 :
				viewcars();
				break;
		case 2: 
				addCar();
				break;
		case 3:
				removeFromList();
				break;
		case 4: 
				System.out.println("offer");
			 	break;
		default: 
				System.out.println("Invalid choices");
			}
		
	}
	
	while(choice!=1 && choice!=2 && choice!=3 && choice!=4);
	
}

	
	private void removeFromList() {
		System.out.println("Remove a car");
		input=new Scanner(System.in);
		int i =input.nextInt();
		Car.carlist.remove(i);
	
		display();

}

	private void viewcars() {
		System.out.println(Car.carlist);
		display();
}


	private void addCar() {
		System.out.println("Enter Make Year Price");
		input=new Scanner(System.in);
		String n=input.nextLine();
		String m=input.nextLine();
		int i =input.nextInt();
	
		car = new Car(n,m,i);
		Car.carlist.add(car);
		display();

}
}
