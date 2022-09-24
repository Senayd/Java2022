package oop1;

public class Main {

	public static void main(String[] args) {
		// ctrl+D satırı siler
		String mesaj = "Vade oranı";

		// set
		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi"); 
		product1.setUnitPrice(7500); 
		product1.setDiscount(7);;
		product1.setUnitsInStock(3); 
		product1.setImageUrl("coffemachine1.img"); 

		// get
		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Dell Kahve Makinesi"); 
		product2.setUnitPrice(7500); 
		product2.setDiscount(7);;
		product2.setUnitsInStock(3); 
		product2.setImageUrl("coffemachine1.img"); 
		

		Product product3 = new Product();
		product3.setName("Karaca Kahve Makinesi"); 
		product3.setUnitPrice(7500); 
		product3.setDiscount(7);;
		product3.setUnitsInStock(3); 
		product3.setImageUrl("coffemachine1.img"); 
		
		
		Product[] products= {product1,product2,product3 };
		
		System.out.println("<ul>");		
		for(Product product:products) {
			System.out.println("<li>" +product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
	        
	        
	        
	}

}
