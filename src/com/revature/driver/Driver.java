package com.revature.driver;
import java.io.Serializable;
import java.util.*;

import javax.swing.JOptionPane;

import com.revature.pojo.Car;
import com.revature.services.CarLogin;
import com.revature.ui.PromptCostumer;
import com.revature.ui.PromptEmployee;
import com.revature.ui.PromptRegister;
import com.revature.ui.PromptUsername;
import com.revature.ui.Screen;
import com.revature.ui.WelcomeScreen;

public class Driver {



	private static Screen welcome = new WelcomeScreen();
	private static Screen logInUsername = new PromptUsername();
	private static Screen registerUser = new PromptRegister();
	private static Screen empOptions = new PromptEmployee();
	private static Screen cosOptions = new PromptCostumer();
	private static Car car=new Car();
	
	
	public static void main (String[] args) {
		//Cars already in the lot
		car.addToList(new Car("Ford", "2019", 12000));
		car.addToList(new Car("Toyota", "2019", 12000));
		car.addToList(new Car("Honda", "2019", 12000));
		car.addToList(new Car("Nissan", "2019", 12000));
		
		welcome.display();
		logInUsername.display();
		registerUser.display();
		boolean quit = false;
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		//User inputing 
		if (input.equalsIgnoreCase("Jean")) 
			System.out.println("Please enter password");
			String password = scan.nextLine();
		if (password.equalsIgnoreCase("1234")) 
			empOptions.display();
		else if (input.equalsIgnoreCase("1"))
			cosOptions.display();
		
	}
}
