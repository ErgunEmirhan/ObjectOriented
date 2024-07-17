package com.eergun.compoundObject;

public class Ders {
	String kod;
	String ad;
	int kredi;
	
	Hoca hoca; //Dersin hocası
	Bolum bolum; //Ders bir bölüme ait olur
	Ogrenci[] ogrenciler; // Dersi alan öğrencilier
	
	public Ders(String kod, String ad, int kredi) {
		this.kod = kod;
		this.ad = ad;
		this.kredi = kredi;
		
		ogrenciler = new Ogrenci[20];
	}
}