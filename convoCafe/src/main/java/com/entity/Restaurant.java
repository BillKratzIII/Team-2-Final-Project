package com.entity;

/*
 * 12 Week Team A, Group 2
 * Restaurant class holds the constructor to make a new restaurant object. Variables along with their
 * getters and setters are used to make matches with users looking to meet up.
 */
public class Restaurant {
	//variables
	int restaurantId = 0;
	String name = null;
	String streetAddress = null;
	String city = null;
	String state = null;
	int zipCode = 00000;
	String language = null;
	
	//constructor
	public Restaurant(int restaurantId, String name, String streetAddress, String city, String state, int zipCode,
			String language) {
		this.restaurantId = restaurantId;
		this.name = name;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.language = language;
	}//constructor

	//default constructor
	public Restaurant() {
	}
	
}//class
