package com.eergun.compoundObject;

public class Hoca {
	String ad;
	String unvan;
	
	Bolum bolum;
	Ogrenci[] danisanlar;
	Ders[] verilenDersler;
	
	public Hoca(String ad, String unvan, Bolum bolum) {
		this.ad = ad;
		this.unvan = unvan;
		this.bolum = bolum;
		danisanlar = new Ogrenci[10];
		verilenDersler = new Ders[4];
		
	}
}