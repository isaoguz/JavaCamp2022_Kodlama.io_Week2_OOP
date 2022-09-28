package RecapDemo;

public class DortIslem {
	public int Topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public int Cikarma(int sayi1,int sayi2) {
		return sayi1-sayi2;
	}
	
	public int Carp(int sayi1,int sayi2) {
		return sayi1*sayi2;
	}
	public int Bolme(int sayi1,int sayi2) {
		if (sayi1==0 || sayi2 ==0) {
			System.out.println("Sıfır Girilemez");
		}
			return sayi1/sayi2;
	
	}
}
