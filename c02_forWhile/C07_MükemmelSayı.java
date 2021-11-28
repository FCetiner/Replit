package c02_forWhile;

import java.util.Scanner;

public class C07_MükemmelSayý {

	public static void main(String[] args) {
	/*	Sayinin Mükemmel sayý olup olmadýðýný kontrol eden Java kodunu yazýn.
	 * Sayýnýn kendisi hariç pozitif bölenlerinin toplamý o sayýya eþitse, 
	 * herhangi bir sayý Mükemmel Sayý olarak bilinir.
		Input :
		6
		Output:
		6 Mukemmel Sayidir.
		======================
		Input
		7
		Output:
		7 Mukemmel Sayidir degildir.*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir sayý girin");
		int a=scan.nextInt();
		int toplam=0;
		
		for (int i = 1; i <a; i++) {
			if (a%i==0) {
				toplam+=i;
			} 
		}
		
		if (toplam==a) {
			System.out.println(a+ " Mükemmel Sayidir.");
		} else {
			System.out.println(a+ " Mükemmel Sayidir Deðildir.");
		}
		
		
		scan.close();
		
	}

}
