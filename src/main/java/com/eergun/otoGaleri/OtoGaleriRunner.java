package com.eergun.otoGaleri;

public class OtoGaleriRunner {
	public static void main(String[] args) {
		OtoGaleri kardeslerOto= new OtoGaleri(10);
		
		
		kardeslerOto.arabaEkle(new Araba(0, 20_000, "Marka1", "Model1", new Motor(90, "1600", 200, 200),
		                                 "kirmizi", "2007"));
		
		Motor motor2 = new Motor(100, "2000", 130, 200);
		kardeslerOto.arabaEkle(new Araba(100, 10_000, "Marka2","Model2",motor2, "siyah", "2000"));
		kardeslerOto.arabaEkle(new Araba());
		
		kardeslerOto.arabaListele();
	}
}