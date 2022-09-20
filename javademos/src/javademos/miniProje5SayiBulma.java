package javademos;

public class miniProje5SayiBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] sayilar =new int[] {12,8,6,7,2,3 };
		int aranacakSayi=9;
		boolean sayiBulundu=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacakSayi) {
				sayiBulundu=true;
				break;
			}
		}
		
		if(sayiBulundu==true) {
			System.out.println("Sayi bulundu!");
		}else {
			System.out.println("Sayı bulunamadı!");
		}
		

	}

}
