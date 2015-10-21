package com.example;

import java.util.ArrayList;

public interface VegetableRep {

	ArrayList<Vegetable> findAll(TempVegetableRep temp);
	
	void add(Vegetable veg);
}
