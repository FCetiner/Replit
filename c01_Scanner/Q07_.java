package c01_Scanner;

import java.util.Scanner;

public class Q07_ {

	public static void main(String[] args) {
		// Kullanýcýdan üç basamaklý bir sayý girmesini ve bu sayýnýn basamaklarýnýn toplamýný bulmasýný isteyin.
		//Örnek Çýktý:
		//Verilen tamsayýnýn rakamlarý toplamý 10'dur.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 3 basamaklý bir sayý girin:");
		int a = scan.nextInt();
		int toplam = a%10 + ((a/10)%10) + ((a/100)%10);
		
		System.out.println("Verilen tamsayýnýn rakamlarý toplamý " + toplam + "'dur.");
		scan.close();
		
	}

}
