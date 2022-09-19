package javademos;

public class miniProje1SayiAsalMi {

	public static void main(String[] args) {
		int number = 1;
		boolean isPrime = true;

	
		if (number == 1) {
			System.out.println("The number is not prime!!");
			return;
		}

		if (number < 1) {
			System.out.println("Invalid Number");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.print("Sayi asaldır.");
		} else {
			System.out.println("Sayı asal değildir !");
		}
	}

}
