package com.eergun.compoundObject;

public class Bolum {
	String kod;
	String ad;
	
	Hoca bolumBaskani;
	Ders[] bolumDersleri;
	Ogrenci[] kayitliOgrenciler;
	
	public Bolum(String kod, String ad) {
		this.kod = kod;
		this.ad = ad;

		bolumDersleri=new Ders[50];
		kayitliOgrenciler = new Ogrenci[200];
	}
}