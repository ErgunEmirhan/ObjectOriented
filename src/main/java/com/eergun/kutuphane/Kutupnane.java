package com.eergun.kutuphane;

import java.util.Arrays;

public class Kutupnane {
	
	private Kitap[] kitaplar;
	private Uye[] uyeler;
	private Odunc[] oduncListesi;
	
	private int kitapSayisi;
	private int uyeSayisi;
	private int oduncSayisi;
	
	private int oduncSuresiGun;
	private double gecikmeGunBasinaDusulecekPuan;
	
	public Kutupnane(){
	}
	
	public Kutupnane(double gecikmeGunBasinaDusulecekPuan, int oduncSuresiGun, int oduncSayisi, int uyeSayisi, int kitapSayisi, Odunc[] oduncListesi, Uye[] uyeler, Kitap[] kitaplar) {
		this.gecikmeGunBasinaDusulecekPuan = gecikmeGunBasinaDusulecekPuan;
		this.oduncSuresiGun = oduncSuresiGun;
		this.oduncSayisi = oduncSayisi;
		this.uyeSayisi = uyeSayisi;
		this.kitapSayisi = kitapSayisi;
		this.oduncListesi = oduncListesi;
		this.uyeler = uyeler;
		this.kitaplar = kitaplar;
	}
	
	public double getGecikmeGunBasinaDusulecekPuan() {
		return gecikmeGunBasinaDusulecekPuan;
	}
	
	public void setGecikmeGunBasinaDusulecekPuan(double gecikmeGunBasinaDusulecekPuan) {
		this.gecikmeGunBasinaDusulecekPuan = gecikmeGunBasinaDusulecekPuan;
	}
	
	public int getOduncSuresiGun() {
		return oduncSuresiGun;
	}
	
	public void setOduncSuresiGun(int oduncSuresiGun) {
		this.oduncSuresiGun = oduncSuresiGun;
	}
	
	public int getOduncSayisi() {
		return oduncSayisi;
	}
	
	public void setOduncSayisi(int oduncSayisi) {
		this.oduncSayisi = oduncSayisi;
	}
	
	public int getUyeSayisi() {
		return uyeSayisi;
	}
	
	public void setUyeSayisi(int uyeSayisi) {
		this.uyeSayisi = uyeSayisi;
	}
	
	public int getKitapSayisi() {
		return kitapSayisi;
	}
	
	public void setKitapSayisi(int kitapSayisi) {
		this.kitapSayisi = kitapSayisi;
	}
	
	public Odunc[] getOduncListesi() {
		return oduncListesi;
	}
	
	public void setOduncListesi(Odunc[] oduncListesi) {
		this.oduncListesi = oduncListesi;
	}
	
	public Uye[] getUyeler() {
		return uyeler;
	}
	
	public void setUyeler(Uye[] uyeler) {
		this.uyeler = uyeler;
	}
	
	public Kitap[] getKitaplar() {
		return kitaplar;
	}
	
	public void setKitaplar(Kitap[] kitaplar) {
		this.kitaplar = kitaplar;
	}
	
	@Override
	public String toString() {
		return "Kutupnane{" + "kitaplar=" + Arrays.toString(getKitaplar()) + ", uyeler=" + Arrays.toString(getUyeler()) + ", oduncListesi=" + Arrays.toString(getOduncListesi()) + ", kitapSayisi=" + getKitapSayisi() + ", uyeSayisi=" + getUyeSayisi() + ", oduncSayisi=" + getOduncSayisi() + ", oduncSuresiGun=" + getOduncSuresiGun() + ", gecikmeGunBasinaDusulecekPuan=" + getGecikmeGunBasinaDusulecekPuan() + '}';
	}
}