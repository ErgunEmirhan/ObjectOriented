package com.eergun.compoundObject;

public class Ogrenci {
	String no;
	String ad;
	
	Bolum bolum;
	Ders[] aldigiDersler;
	Hoca danisman;
	
	public Ogrenci(String no, String ad) {
		this.no = no;
		this.ad = ad;
		aldigiDersler = new Ders[6];
	}
}