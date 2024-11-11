package com.nt.beans;


public class AtherEletriceBike implements Bike {
	
	public AtherEletriceBike() {
		System.out.println("AtherEletriceBike:: 0-param constructor");
	}

	@Override
	public void drive() {
		System.out.println("Ather Bike:: driving the back");
	}

}
