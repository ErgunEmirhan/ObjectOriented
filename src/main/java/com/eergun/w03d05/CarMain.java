package com.eergun.w03d05;

public class CarMain {
	public static void main(String[] args) {
		new Car();
		// Constructor metodlar geriye değer dönme ile ilgili bir tanımlaa içermezler ancak geriye oluşturulan nesnenin bellek adresini dönerler.
		Car araba1 = new Car();
		araba1.marka="Audi"; araba1.model = "A3"; araba1.yil="2028"; araba1.km=10_000; araba1.hiz=0;
		
		Car araba2 = new Car();
		araba2.marka="Toyota"; araba2.model="Corolla"; araba2.yil="2022"; araba2.km=10_000; araba2.hiz=50;
		
		System.out.println(araba1);
		System.out.println(araba2);
		araba2.hiz = 100;
	}
}