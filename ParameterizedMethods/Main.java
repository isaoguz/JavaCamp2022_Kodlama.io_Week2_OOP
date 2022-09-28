package ParameterizedMethods;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel ";
		String yeniMesaj = metinVer("Alooo");
		System.out.println(yeniMesaj);
		
		int sayiTopla = sayiTopla2(4,4);
		System.out.println(sayiTopla);
		

		
		
		int topla = sayilariTopla(3,3,3,3,3,3,3,300);
		System.out.println(topla);
		
		
		
		
		
		

	      for(var i=0;i<=10;i++)
	      {
	          System.out.println(i);
	  
	          for(var j=0;j<=5;j++)
	         {  
	               if(i==5)
	                continue;
	               System.out.println(j);
	          }
	 
	      }

		
		
		
		
		
		
		
		
	}
	
	public static void ekle(String metin) {
		System.out.println("Eklendi..." + metin);
	}
	public static void sil() {
		System.out.println("Silindi...");
	}
	public static void guncelle() {
		System.out.println("Güncellendi...");
	}
	
	public static void sayiTopla1(int sayi1,int sayi2) {
		System.out.println(sayi1+sayi2);
	}
	
	public static int sayiVer() {
		return 54;
	}
	public static String metinVer(String metin) {
		return "isamusa" + metin;
	}
	
	public static int sayiTopla2(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int sayilar() {
		return 10;
	}
	
	
	public static int sayilariTopla(int... sayilar) {
		int toplam = 0;
		
		for (int i : sayilar) {
			toplam = toplam+i;
		}
		return toplam;
	}
}
