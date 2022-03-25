package kdvliFiyatHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int fiyat;
		double kdvDahilFiyat;
		Scanner fiyatScanner=new Scanner(System.in);
		System.out.println("fiyatı giriniz: ");
		fiyat=fiyatScanner.nextInt();
		if(fiyat>0&fiyat<1000) {
			kdvDahilFiyat=fiyat*1.18;
			System.out.println("Ürünün kdv dahil fiyatı: " + kdvDahilFiyat);
		}else {
			kdvDahilFiyat=fiyat*1.08;
			System.out.println("Ürünün kdv dahil fiyatı: " + kdvDahilFiyat);
		}
				

	}

}
