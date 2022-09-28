package SayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = {1,2,3,4,5};
		int aranan = 6;
		
		boolean varmi = false;
		
		for (int i : sayilar) {
			if (i==aranan) {
				varmi = true;
				break;
			}
		}
		
		if (varmi) {
			System.out.println("Aranan sayi dizi içerisinde vardır = " + aranan);
		}
		else {
			System.out.println("Aranan sayi dizi içerisinde yoktur.");
		}

	}

}
