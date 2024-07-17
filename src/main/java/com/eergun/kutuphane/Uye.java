package com.eergun.kutuphane;
/*

 */
public class Uye {
	
	// nesne değişkenleri
	private String uyeNo;
	private String ad;
	private String soyad;
	private String telNo;
	private String dogumTarih;
	private String adres;
	private String tcNo;
	private String kayitTarihi;
	private double puan;
	private int oduncAldigiKitapSayisi;
	
	// consturctors
	public Uye(){}
	
	public Uye(String uyeNo, String ad, String soyad, String telNo, String dogumTarih, String adres, String tcNo, String kayitTarihi, double puan, int oduncAldigiKitapSayisi) {
		this.uyeNo = uyeNo;
		this.ad = ad;
		this.soyad = soyad;
		this.telNo = telNo;
		this.dogumTarih = dogumTarih;
		this.adres = adres;
		this.tcNo = tcNo;
		this.kayitTarihi = kayitTarihi;
		this.puan = puan;
		this.oduncAldigiKitapSayisi = oduncAldigiKitapSayisi;
	}
	
	// getters and setters
	
	
	public String getUyeNo() {
		return uyeNo;
	}
	
	public void setUyeNo(String uyeNo) {
		this.uyeNo = uyeNo;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public String getTelNo() {
		return telNo;
	}
	
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	public String getDogumTarih() {
		return dogumTarih;
	}
	
	public void setDogumTarih(String dogumTarih) {
		this.dogumTarih = dogumTarih;
	}
	
	public String getAdres() {
		return adres;
	}
	
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public String getTcNo() {
		return tcNo;
	}
	
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	
	public String getKayitTarihi() {
		return kayitTarihi;
	}
	
	public void setKayitTarihi(String kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}
	
	public double getPuan() {
		return puan;
	}
	
	public void setPuan(double puan) {
		this.puan = puan;
	}
	
	public int getOduncAldigiKitapSayisi() {
		return oduncAldigiKitapSayisi;
	}
	
	public void setOduncAldigiKitapSayisi(int oduncAldigiKitapSayisi) {
		this.oduncAldigiKitapSayisi = oduncAldigiKitapSayisi;
	}
	
	// toString()
	
	
	@Override
	public String toString() {
		return "Uye{" + "uyeNo='" + uyeNo + '\'' + ", ad='" + ad + '\'' + ", soyad='" + soyad + '\'' + ", telNo='" + telNo + '\'' + ", dogumTarih='" + dogumTarih + '\'' + ", adres='" + adres + '\'' + ", tcNo='" + tcNo + '\'' + ", kayitTarihi='" + kayitTarihi + '\'' + ", puan=" + puan + ", oduncAldigiKitapSayisi=" + oduncAldigiKitapSayisi + '}';
	}
}