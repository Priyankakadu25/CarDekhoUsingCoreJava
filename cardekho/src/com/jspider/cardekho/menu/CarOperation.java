package com.jspider.cardekho.menu;
import java.util.*;

import com.jspider.cardekho.entity.Car;

public class CarOperation {
       
	CarDekhoMainMenu cardekhomenu = new CarDekhoMainMenu(); 
	 ArrayList<Car> cars = new ArrayList<>();
	 public void viewAllCar() {
		 for (Car car : cars) {
			System.out.println(car);
		}
		 
		 CarDekhoMainMenu.menu();
	 }
    public void addCars() {
   	System.out.println("How many cars You want to add? ");
   	Scanner sc = new Scanner(System.in);
   	int choice = sc.nextInt();
   	for(int i = 1; i<=choice; i++) {
   		Car car = new Car();
   		System.out.println("Enter id : ");
   		car.setId(sc.nextInt());
   		System.out.println("Enter name : ");
   		car.setName(sc.next());
   		System.out.println("Enter company: ");
   		car.setCompany(sc.next());
   	    System.out.println("Enter FuelType: ");
   	    car.setFuelType(sc.next());
   	    System.out.println("Enter Color: ");
   	    car.setColor(sc.next());
   	    System.out.println("Enter Price: ");
   	    car.setPrice(sc.nextDouble());
   	    cars.add(car);
   	    System.out.println("Added cars");
   	}
   	CarDekhoMainMenu.menu();
   }
    Scanner scanner = new Scanner(System.in);
    public void searchCarById() {
   	 boolean flag = true;
   	 System.out.println("Enter car id: ");
   	 int id = scanner.nextInt();
   	 for(Car car : cars) {
   		 if(car.getId() == id) {
   			 System.out.println(car);
   			 flag = false;
   			 break;
   		 }
   		 else {
   			 System.out.println("Car not found");
   		 }
   	 }
    }
    public  void searchCarByName() {
   	 boolean flag = true;
   	 System.out.println("Enter car name: ");
   	 String name = scanner.next();
   	 for(Car car : cars) {
   		 if(car.getName().equals(name)) {
   			 System.out.println(car);
   			 flag = false;
   			 break;
   		 }
   		 else {
   			 System.out.println("Car not found");
   		 }
   		 
   	 }
    }
    public  void searchCarByCompany() {
   	 boolean flag = true;
   	 System.out.println("Enter car comapny: ");
   	 String company = scanner.next();
   	 for(Car car : cars) {
   		 if(car.getCompany().equals(company)) {
   			 System.out.println(car);
   			 flag = false;
   			 break;
   		 }
   		 else {
   			 System.out.println("Car not found");
   		 }
   	 }
    }
    public void searchCarByFuelType() {
   	 boolean flag = true;
   	 System.out.println("Enter car FuelType: ");
   	 String fuelType = scanner.next();
   	 for(Car car : cars) {
   		 if(car.getFuelType().equals(fuelType)) {
   			 System.out.println(car);
   			 flag = false;
   			 break;
   		 }
   		 else {
   			 System.out.println("Car not found");
   		 }
   	 }
    }
    public void searchCarByColor() {
   	 boolean flag = true;
   	 System.out.println("Enter car color: ");
   	 String color = scanner.next();
   	 for(Car car : cars) {
   		 if(car.getColor().equals(color)){
   			 System.out.println(car);
   			 flag = false;
   			 break;
   		 }
   		 else {
   			 System.out.println("Car not found");
   		 }
   	 }
    }
    public void searchCarByPrice() {
   	 boolean flag = true;
   	 System.out.println("Enter car price: ");
   	 double price = scanner.nextDouble();
   	 for(Car car : cars) {
   		 if(car.getPrice()== price) {
   			 System.out.println(car);
   			 flag = false;
   			 break;
   		 }
   		 else {
   			 System.out.println("Car not found");
   		 }
   	 }
    }
    public void removeCars() {
   	 boolean flag = false;
        System.out.println("Enter car id to remove: ");
        int id = scanner.nextInt();
        for (Car car : cars) {
       	 if (car.getId() == id) {
                cars.remove(car);
                System.out.println("Car removed successfully");
                flag = true;
                break;
            } 
		}
        if (!flag) {
				System.out.println("Car not found");
			}
        CarDekhoMainMenu.menu();
    }
    public void editCars() {
	 boolean flag = false;
    System.out.println("Enter car id to update car details: ");
    int id = scanner.nextInt();
    for (Car car : cars) {
   	 if (car.getId() == id) {
            System.out.println("Enter car name:");
            String name = scanner.next();
            car.setName(name);
            System.out.println("Enter car company:");
            String company = scanner.next();
            car.setCompany(company);
            System.out.println("Enter car FuelType:");
            String fuelType = scanner.next();
            car.setFuelType(fuelType);
            System.out.println("Enter car color:");
            String color = scanner.next();
            car.setColor(color);
            System.out.println("Enter car price:");
            double price = scanner.nextDouble();
            car.setPrice(price);
            System.out.println("Car details updated");
            flag = true;
            break;
        } 
	}
    if (!flag) {
			System.out.println("Car not found");
		}
    CarDekhoMainMenu.menu();
}
    public void filterCars() {
   	 boolean flag = false;
        for (Car car : cars) {
       	 if (car.getPrice()>=1000000 && car.getPrice()<=20000000) {
       		 System.out.println("Filtered record is: ");
                System.out.println(car);
                flag = true;
                break;
            } 
		}
        if (!flag) {
				System.out.println("Car not found");
			}
        CarDekhoMainMenu.menu();
    }
}