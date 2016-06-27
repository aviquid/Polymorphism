package com.training.domain;

import com.training.ifaces.Automobile;

public class ShowRoom {
	
	public Automobile getModel(int key)
	{
		switch(key)
		{
		case 1: 
			{
				MarutiCar m1=new MarutiCar(); 
				return m1;
			}
			/*
			 * this can be done as : return new MarutiCar();
			 */
		case 2: {
			ToyotaCar m1=new ToyotaCar();
			return m1;
		}
		default: return null;
		}
	}
	
	public void printQuote(Automobile polyAuto)
	{
		System.out.println(Automobile.SHOWROOM_NAME);
		/*
		 * since showroom_name is static, it has to be called in static way only. but not in
		 * a instance way like polyAuto.SHOWROOM_NAME;
		 */
		
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getPrice());
		
		
	}

}
