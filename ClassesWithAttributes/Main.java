package ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1,"ALeptop","Asus",4000,4,"Mavi");
		
		Product product = new Product();
		product.setName("Leptop");
		product.setId(1);
		product.setPrice(400);
		product.setStockAmount(50);
		product.SetDescription("Açıklama");
	
		
		
		System.out.println("is code  + " + product1.getKod());
		ProductManager productManager = new ProductManager();
		productManager.Add(product );
		
		
		
		

	}

}
