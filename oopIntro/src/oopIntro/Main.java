package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram",10);//referans olu�turma,intance olu�turma
		
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo 15");
		product2.setDetail("16 gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		
		
		
		
		
		
	}

}
