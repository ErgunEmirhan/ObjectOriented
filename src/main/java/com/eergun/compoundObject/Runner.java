package com.eergun.compoundObject;

public class Runner {
	public static void main(String[] args) {
		Bolum bolum1 = new Bolum("YZMH", "Yazılım Müh.");
		Ogrenci ogrenci1 = new Ogrenci("2024450240","Muzaffer Bilek");
		Ders ders1 = new Ders("YZMH101", "Introduction to Programmiingg",4);
		Hoca hoca1 = new Hoca("Selim AK", "Prof", bolum1);
		
		bolum1.bolumBaskani=hoca1;
		bolum1.bolumDersleri[0] = ders1;
		bolum1.kayitliOgrenciler[0] = ogrenci1;
		
		ogrenci1.bolum=bolum1;
		ogrenci1.aldigiDersler[0] = ders1;
		ogrenci1.danisman = hoca1;
		
		ders1.hoca=hoca1;
		ders1.bolum=bolum1;
		ders1.ogrenciler[0] = ogrenci1;
		
		hoca1.danisanlar[0] = ogrenci1;
		hoca1.verilenDersler[0] = ders1;
		
		//ogrenci1'in aldığı ilk ders
		System.out.println("ogrenci1'in ilk dersi: " + ogrenci1.aldigiDersler[0].ad);
		//ogrenci1'in aldığı iilk dersin hocasının adı
		System.out.println("ogrenci1'in ilk dersinin hocası: " + ogrenci1.aldigiDersler[0].hoca.ad);
		//ogrenci1'in aldığı ilk dersin hocasının bolumunun kodu
		System.out.println("ogrenci1 ilk ders hoca bolum kodu: " + ogrenci1.aldigiDersler[0].hoca.bolum.kod);
	}
}