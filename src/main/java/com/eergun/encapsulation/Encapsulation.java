package com.eergun.encapsulation;

public class Encapsulation {
	/*
	
	 */
	private int kdvOrani;
	
	public void setKdvOrani(int kdvOrani){
		if (kdvOrani < 30 && kdvOrani > 0)
			this.kdvOrani = kdvOrani;
		else System.out.println("0-30 araliginda deger giriniz. ");
	}
	
}