package com.eergun.kutuphane;

public class Odunc {

	private String oduncNo;
	private Uye uye;
	private Kitap kitap;
	private String oduncAlmaTarihi;
	private String teslimTarihi;
	
	public Odunc(){
	}
	
	public Odunc(String oduncNo, Uye uye, Kitap kitap, String oduncAlmaTarihi, String teslimTarihi) {
		this.oduncNo = oduncNo;
		this.uye = uye;
		this.kitap = kitap;
		this.oduncAlmaTarihi = oduncAlmaTarihi;
		this.teslimTarihi = teslimTarihi;
	}
	
	public String getOduncNo() {
		return oduncNo;
	}
	
	public void setOduncNo(String oduncNo) {
		this.oduncNo = oduncNo;
	}
	
	public Uye getUye() {
		return uye;
	}
	
	public void setUye(Uye uye) {
		this.uye = uye;
	}
	
	public Kitap getKitap() {
		return kitap;
	}
	
	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}
	
	public String getOduncAlmaTarihi() {
		return oduncAlmaTarihi;
	}
	
	public void setOduncAlmaTarihi(String oduncAlmaTarihi) {
		this.oduncAlmaTarihi = oduncAlmaTarihi;
	}
	
	public String getTeslimTarihi() {
		return teslimTarihi;
	}
	
	public void setTeslimTarihi(String teslimTarihi) {
		this.teslimTarihi = teslimTarihi;
	}
	
	@Override
	public String toString() {
		return "Odunc{" + "teslimTarihi='" + getTeslimTarihi() + '\'' + ", oduncAlmaTarihi='" + getOduncAlmaTarihi() + '\'' + ", kitap=" + getKitap() + ", uye=" + getUye() + ", oduncNo='" + getOduncNo() + '\'' + '}';
	}
	
}