package com.training.apps;

import com.training.domain.Bike;
import com.training.domain.ShowRoom;
import com.training.ifaces.Automobile;

public class NewShowroom extends ShowRoom {

	@Override
	public Automobile getModel(int key) {
		if(key==3)
			return new Bike();
		else
		return super.getModel(key);
	}

	
}
