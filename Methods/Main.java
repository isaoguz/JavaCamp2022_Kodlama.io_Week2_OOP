package Methods;



public class Main {

	public static void main(String[] args) {
	
		sayiBulamaca();
	
		
	}
	
	public static void sayiBulamaca() {
		int[] sayilar = {1,2,3,4,5};
		int aranan = 5;
		
		boolean varmi = false;
		
		for (int i : sayilar) {
			if (i==aranan) {
				varmi = true;
				break;
			}
		}
		
		if (varmi) {
			mesajVer("Aradığın sayi bulunmuştur = " + aranan);
		}
		else {
			mesajVer("Aradığın sayi bulunamamıştır = " + aranan);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	

}
