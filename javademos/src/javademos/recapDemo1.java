package javademos;

public class recapDemo1 {

	public static void main(String[] args) {
		
		//En büyük sayı hangisi?

		int sayi1 =35;
		int sayi2=24;
		int sayi3=94;
		
		int enBuyuk=sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		
		System.out.println("En büyük : "+ enBuyuk);
	}

}
