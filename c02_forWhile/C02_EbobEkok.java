package c02_forWhile;

import java.util.Scanner;

public class C02_EbobEkok {

	public static void main(String[] args) {
		/* Kullanýcýdan 2 tamsayý girmesini ve ardýndan GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasýný isteyin.
		Input :
			30
			40
			Beklenen Cikti:
			30 ve 40 icin GCD = 10
			30 ve 40 icin LCM = 120*/
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen enter a basarak 2 tamsayý girin:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int max = a*b;
		int ekok=0;
		
		for (int i = max; i > 0; i--) {
			if (i%a==0 && i%b==0) {
				ekok=i;
			}
		}
		System.out.println("ekok : " + ekok);
		
		int ebob=0;
		int buyuk=0;
		@SuppressWarnings("unused")
		int kucuk=0;
		
		if (a>b) {
			buyuk=a;
			kucuk=b;
		} else {
			buyuk=b;
			kucuk=a;
		}
		
		for (int i = 1; i <= buyuk; i++) {
			if (a%i==0 && b%i==0) {
				ebob=i;
			}
		}
		
		System.out.println("ebob : " + ebob);
		
		
	
	scan.close();
	
	
	}
}
