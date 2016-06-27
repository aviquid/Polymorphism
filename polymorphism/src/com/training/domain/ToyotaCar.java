package com.training.domain;

import com.training.ifaces.Automobile;

public class ToyotaCar implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 56756;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "etios";
	}

}
