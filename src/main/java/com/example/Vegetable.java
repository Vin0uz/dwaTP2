package com.example;

public class Vegetable {
	String name;
	String color;
	Double price;
	
	Vegetable(){
		name="empty";
		color="empty";
		price=0.0;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
