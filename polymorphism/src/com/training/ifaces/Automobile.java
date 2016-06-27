package com.training.ifaces;

/*
 * top level interface for representing automobile
 */

public interface Automobile {

	public static final String SHOWROOM_NAME="avi cars";
	
	/*
	 * all the methods in the interface are implicitly public and abstract
	 */
	public abstract double getPrice();
	public String getColor();
	String getModel();
}
