package com.jspider.cardekho.entity;

import com.jspider.cardekho.menu.CarDekhoMainMenu;

public class Car {
	  CarDekhoMainMenu cardekhomenu = new CarDekhoMainMenu();
	    private int id;
	    private String name;
	    private String company;
	    private String fuelType;
	    private String color;
	    private double price;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getFuelType() {
			return fuelType;
		}
		public void setFuelType(String fuelType) {
			this.fuelType = fuelType;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Car [id = " + id + ", name = " + name + ", company = " + company + ", fuelType = " + fuelType + ", color = "
					+ color + ", price = " + price + "]";
		}
		

}
