package com.example;

import java.util.ArrayList;

public class TempVegetableRep implements VegetableRep {
	ArrayList<Vegetable> ArrayVeg;

	TempVegetableRep(){
		ArrayVeg= new ArrayList<Vegetable>(); 
		Vegetable v1= new Vegetable();
		v1.setColor("green");
		v1.setName("pees");
		v1.setPrice(1.15);
		Vegetable v2= new Vegetable();
		v2.setColor("red");
		v2.setName("strawberry");
		v2.setPrice(2.89);
		add(v1);
		add(v2);
	}
	public ArrayList<Vegetable> getArrayVeg() {
		return ArrayVeg;
	}

	public void setArrayVeg(ArrayList<Vegetable> arrayVeg) {
		ArrayVeg = arrayVeg;
	}

	
	public ArrayList<Vegetable> findAll(TempVegetableRep temp) {
		return this.getArrayVeg() ;
	}

	
	public void add(Vegetable veg) {
		this.ArrayVeg.add(veg);
	}
	
}
