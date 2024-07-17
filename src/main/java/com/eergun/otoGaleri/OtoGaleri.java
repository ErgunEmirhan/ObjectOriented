package com.eergun.otoGaleri;

public class OtoGaleri {
	
	// Nesne değişkenleri:
	private Araba[] arabalar;
	private int galeridekiArabaSayisi;
	
	public OtoGaleri(int capacity) {
		this.arabalar = new Araba[capacity];
	}
	
	public void arabaEkle(Araba araba) {
		arabalar[galeridekiArabaSayisi++] = araba;
	}
	
	
	public void arabaListele() {
		for (int i = 0; i < galeridekiArabaSayisi; i++) {
			System.out.println(arabalar[i]);
		}
	}
}