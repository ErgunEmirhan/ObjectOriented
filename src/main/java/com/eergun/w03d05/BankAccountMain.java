package com.eergun.w03d05;

public class BankAccountMain {
	public static void main(String[] args) {
		
		BankAccount hesap1 = new BankAccount();
		// local variable tanımladık (default constructor ile)
		hesap1.setHesapNo(1);
		hesap1.setHesapSahibi("Tolga Kömeç");
		hesap1.setBakiye(50_000);
		
		BankAccount hesap2 = new BankAccount();
		// hesap2 bizim 2. local variable'ımız (default constructor ile)
		hesap2.setHesapNo(2);
		hesap2.setHesapSahibi("Selin Sancak");
		hesap2.setBakiye(100_000);
		//static olmayanlar her objeye has
		System.out.println("Faiz Oranınız: "+ BankAccount.getFaizOrani());
		
		//static herkeste aynı
		hesap1.setFaizOrani(0.20);
		
		System.out.println(hesap2.getFaizOrani()); // 0.2
		System.out.println(hesap1.getFaizOrani()); // 0.2
		System.out.println(BankAccount.getFaizOrani()); // 0.2
		//static'lere sınıf isminden erişmek daha uygun olur
		
		
		//parametreli constructor ile
		BankAccount hesap3 = new BankAccount("Ozkan Sargin", 150_000);
		
		System.out.println(hesap1.getBakiye());
		BankAccount.faizEkle(hesap1);
		
		BankAccount hehsap4 = new BankAccount();
		System.out.println(hehsap4.getHesapNo());
		System.out.println(hehsap4.getHesapSahibi());
		// instance variable'da değer atamadan çağırırsan default değer atar
		// nesne değişkenlerindeyse hata alırsın
		System.out.println(hesap1);
		System.out.println(hesap2);
		System.out.println(hesap3);
		System.out.println(hehsap4);
	}
	
	
}