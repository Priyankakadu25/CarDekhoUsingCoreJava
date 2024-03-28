package com.jspider.cardekho.menu;

import java.util.Scanner;

public class CarDekhoMainMenu {
	static CarOperation caroperations = new CarOperation();
	static boolean loop = true;
	public static void menu(){
		System.out.println("====== MENU ======\n" 
                +"1.View All Cars\n"
		           +"2.Search Car\n"
                +"3.Add Car\n"
		           +"4.Remove Car\n"
                +"5.Edit Car\n"
		          +"6.Filter Car By Price\n"
		           +"7.Exit");
Scanner sc = new Scanner(System.in);
int choice = sc.nextInt();
while(loop) {
	switch(choice) {
	case 1:
		caroperations.viewAllCar();
		break;
	case 2:
		System.out.println("===== SEARCH CAR =====\n"
				+ "1.Search by id\n"
				+ "2.Search by name\n"
				+ "3.Search by company\n"
				+ "4.Search by fuelType\n"
				+ "5.Search by color\n"
				+ "6.Search by price\n"
				+ "7.Go back");
		int choice1 = sc.nextInt();
		switch(choice1) {
		case 1:
			caroperations.searchCarById();
			break;
		case 2:
			caroperations.searchCarByName();
			break;
		case 3: 
			caroperations.searchCarByCompany();
			break;
		case 4:
			caroperations.searchCarByFuelType();
			break;
		case 5:
			caroperations.searchCarByColor();;
			break;
		case 6:
			caroperations.searchCarByPrice();
			break;
		case 7:
			loop = false;
			menu();
			break;
		default:
			System.out.println("Invalide Input. Please try again!");
			break;
		}
		break;
	case 3:
		caroperations.addCars();
		break;
	case 4:
		caroperations.removeCars();
		break;
	case 5:
		caroperations.editCars();
		break;
	case 6:
		caroperations.filterCars();
		break;
	case 7:
		System.out.println("Thank You");
		loop = false;
		break;
	default:
		System.out.println("Invalide inpute. please try again");
	}
	}
	}
    public static void main(String[] args) {
    	
    	while (loop) {
			menu();
		}
		
	}
}

