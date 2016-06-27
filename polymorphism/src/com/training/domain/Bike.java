package com.training.domain;

import com.training.ifaces.Automobile;

public class Bike implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 234124;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "white";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "r15";
	}
	

}
