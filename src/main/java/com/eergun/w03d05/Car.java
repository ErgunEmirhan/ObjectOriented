package com.eergun.w03d05;

public class Car {
	// Özellikler/ Üye Değişkenler/ Field
	public String marka;
	public String model;
	public String yil;
	public int km;
	public int hiz;
	
	// constructor metod.  Sınıf ile aynı isme sahip
	//default constructor (parametre almaz) (bu metod ile nesne üretilecek)(elle yazmasanız bile compile aşamasında .class dosyasına otomatik eklenr)
	public Car() {
	}
	
	@Override
	public String toString() {
		return "Car{" + "hiz=" + hiz + ", km=" + km + ", yil='" + yil + '\'' + ", model='" + model + '\'' + ", marka='" + marka + '\'' + '}';
	}
	
	// Davranışlar/ Üye Metodlar
	public void stop(){
		hiz = 0;
	}
	
	public void speedUp(int yeniHiz){
		hiz += yeniHiz;
	}
	
	public void go(int gidilecekKm){
		km += gidilecekKm;
	}
}