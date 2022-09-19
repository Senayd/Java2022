package javademos;

public class reCapDemo2 {

	public static void main(String[] args) {
		//cntr+sh+/ blok yoruma alma

		double[] sayiList = { 1.2, 9.2, 1.0, 6.9 };
		double toplam = 0;
		double enBuyuk = sayiList[0];
		for (double sayi : sayiList) {
			toplam = toplam + sayi;

			if (enBuyuk < sayi) {
				enBuyuk = sayi;
			}
		}

		System.out.println("Toplam= " + toplam);
		System.out.println("En buyuk= " + enBuyuk);

	}

}
