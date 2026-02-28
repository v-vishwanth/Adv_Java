package com.loose_coupling;

public class Ride {
	Vehicle v;
	public void startRide() {
		v.start();
	}
	public static void main(String[] args) {
		Ride r = new Ride();
		r.v = new Car();
		r.startRide();
		
		r.v = new Bike();
		r.startRide();
	}
}
