package com.eergun.w03d05;

/**
 *  java'da 3 tip değşken vardır
 *  1. Object Variable ( Nesne değişkeni: Instance Variable)
 *  2. Class variable ( sınıf değişkeni: static variable)
 *  3. Local Variable ( yerel değişken)
 */
public class BankAccount {
	//Nesne değişkenleri (Instance Varable, field, prop, property)
	private int hesapNo;
	private String hesapSahibi;
	private double bakiye;
	
	//bilgisiz constructor alternatif mevcut
	public BankAccount() {
		hesapNoCounter++;
		this.hesapNo = hesapNoCounter;
		// hesap no'yu otomatize ettik.
	}
	
	//Constructor metod: nesne yaratmak girmek bazı bilgi
	public BankAccount(String hesapSahibi, double bakiye) {
		hesapNoCounter++;
		this.hesapNo = hesapNoCounter;
		this.hesapSahibi = hesapSahibi;
		this.bakiye = bakiye;
	}
	
	//Sınıf değişkeni (static variable)
	private static double faizOrani=0.05;
	private static int hesapNoCounter; // bunu static almazsan her seferinde 1 verir numara olarak
	
	
	
	public static double getFaizOrani() {
		return faizOrani;
	}
	
	public static void setFaizOrani(double faizOrani) {
		BankAccount.faizOrani = faizOrani;
	}
	
	public int getHesapNo() {
		return hesapNo;
	}
	
	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}
	
	public String getHesapSahibi() {
		return hesapSahibi;
	}
	
	public void setHesapSahibi(String hesapSahibi) {
		this.hesapSahibi = hesapSahibi;
	}
	
	public double getBakiye() {
		return bakiye;
	}
	
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	
	
	// Metodlarr
	public void paraYatir(double miktar){
		bakiye += miktar;
		System.out.println((miktar + " TL hesaba yatırıldı.  Guncel Bakiye: " + bakiye));
	}
	
	public void paraCek(double miktar) {
		bakiye -= miktar;
		System.out.println((miktar + " TL hesaptan cekildi.  Guncel Bakiye: " + bakiye));
	}
	
	public static void faizEkle(BankAccount hesap){
		double faizGeliri = hesap.getBakiye() * faizOrani;
		hesap.setBakiye(hesap.getBakiye() + faizGeliri);
		System.out.println("Faiz geliri eklendi.  Bakiye: " + hesap.getBakiye());
		
	}
	
	//yazdırırken nasıl yazdırsın diye
	@Override
	public String toString() {
		return "BankAccount{" + "hesapNo=" + hesapNo + ", hesapSahibi='" + hesapSahibi + '\'' + ", bakiye=" + bakiye + '}';
	}
}