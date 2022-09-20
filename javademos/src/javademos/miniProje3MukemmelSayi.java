package javademos;

public class miniProje3MukemmelSayi {

	public static void main(String[] args) {
//		kendisinden başka pozitif tam bölenlerin sayısının toplamı kendisine eşit olan:
//			6-> 1,2,3 
//			28->1,2,4,7,14

		int sayi = 28;
		int toplam = 0;

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam = toplam + i;
			}
		}
		if (sayi == toplam) {
			System.out.println("Mükemmel sayıdır");
		} else {
			System.out.println("Mükemmel sayı değildir");
		}
	}

}
