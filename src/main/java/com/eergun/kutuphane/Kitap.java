package com.eergun.kutuphane;
/*
kitap
isbn
ad
fiyat
tur
sayfasayisi
yazar
yayınevi
yayınyılı
 */

public class Kitap {
	// 1- Object Variables
	private String ISBN;
	private String ad;
	private double fiyat;
	private String tur;
	private int sayfaSayisi;
	private int adet;
	private String yazar;
	private String yayinEvi;
	private String yayinYili;
	
	// 2- Constructors
	
	public Kitap(){
	}
	
	public Kitap(String ISBN, String ad, double fiyat, String tur, int sayfaSayisi, int adet, String yazar, String yayinEvi, String yayinYili) {
		this.ISBN = ISBN;
		this.ad = ad;
		this.fiyat = fiyat;
		this.tur = tur;
		this.sayfaSayisi = sayfaSayisi;
		this.adet = adet;
		this.yazar = yazar;
		this.yayinEvi = yayinEvi;
		this.yayinYili = yayinYili;
	}
	
	// 3- Getters & Setters
	
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public double getFiyat() {
		return fiyat;
	}
	
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	public String getTur() {
		return tur;
	}
	
	public void setTur(String tur) {
		this.tur = tur;
	}
	
	public int getSayfaSayisi() {
		return sayfaSayisi;
	}
	
	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}
	
	public int getAdet() {
		return adet;
	}
	
	public void setAdet(int adet) {
		this.adet = adet;
	}
	
	public String getYazar() {
		return yazar;
	}
	
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}
	
	public String getYayinEvi() {
		return yayinEvi;
	}
	
	public void setYayinEvi(String yayinEvi) {
		this.yayinEvi = yayinEvi;
	}
	
	public String getYayinYili() {
		return yayinYili;
	}
	
	public void setYayinYili(String yayinYili) {
		this.yayinYili = yayinYili;
	}
	
	// 4- toString()
	
	
	@Override
	public String toString() {
		return "Kitap{" + "ISBN='" + ISBN +
				'\'' + ", ad='" + ad +
				'\'' + ", fiyat=" + fiyat + ", tur='" + tur +
				'\'' + ", sayfaSayisi=" + sayfaSayisi + ", adet=" + adet + ", yazar='" + yazar +
				'\'' + ", yayinEvi='" + yayinEvi +
				'\'' + ", yayinYili='" + yayinYili +
				'\'' + '}';
	}
}