package c01_Scanner;

import java.util.Scanner;

public class Q09_GirilenZaman�SaniyeyeCevirme {

	public static void main(String[] args) {
		// Girilen zaman� saniyeye �eviren bir program yaz�n�z.
		//�rnek ��kt�:
		//1 saat 10 dakika 50 saniye ==>
		//4250 saniye

		Scanner scan = new Scanner(System.in);
		System.out.println("Saniyesini hesaplamak istedi�iniz zaman� s�ras�yla entera basarak saat dakika ve saniye olarak girin");
		int saat = scan.nextInt();
		int dakika = scan.nextInt();
		int saniye = scan.nextInt();
		
		int toplam= (saat*60*60)+(dakika*60)+saniye;
		System.out.println(saat + " saat " + dakika + " dakika " + saniye + " saniye " +  " ==>\n" + toplam + " saniye");
		
		scan.close();
	}

}
