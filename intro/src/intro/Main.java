package intro;

public class Main {

	public static void main(String[] args) {
		
		//deðiþkenler
		String internetSubeButonu ="Ýnternet Þubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		//þart bloklarý
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar eþittir resmi");
		}
		
		//liste 
		
		String[] krediler = {
				"Hýzlý kredi",
				"Mutlu emekli kredisi",
				"Konut kredisi",
				"Çiftci kredisi",
				"Msb kredisi",
				"Meb kredisi",
				"KB kredisi"
				};
		//foreach döngüsü
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		//for döngüsü
		for(int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		

	}

}
