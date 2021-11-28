package c03_IfSwitchTernary_StringMethods;

import java.util.Scanner;

public class C05_AydakiGunSayýsý {

	public static void main(String[] args) {
	/*	Bir aydaki gün sayýsýný hesaplayan bir Java programý yazýnýz.
		INPUT:
		Ay Numarasi:
		2
		Yil :
		2016
		OUTPUT :
		Subat 2016 29 Gundur.*/
		//Kural 1 4 ile bolunemeyen yillar artik yil degildir
		//Kural 2 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
		//Kural 3 4 ’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400 ’un kati olan yillar artik yildir
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen ay numarasýný girin : ");
		int ay = scan.nextInt();
		System.out.println("Lütfen yýl numarasýný girin : ");
		int yýl = scan.nextInt();
		
		switch (ay) {
		case 1:
			System.out.println("Ocak " + yýl + " 31 Gundur.");
			break;
		case 2:
			if (yýl%4==0) {
				if (!(yýl%100==0)) {
					System.out.println("Þubat " + yýl + " 29 Gundur." );
				} else if (yýl%400==0) {
					System.out.println("Þubat " + yýl + " 29 Gundur." );
				}
			} else {
				System.out.println("Þubat " + yýl + " 28 Gundur." );
			}
			break;
		case 3:
			System.out.println("Mart " + yýl + " 31 Gundur.");
			break;
		case 4:
			System.out.println("Nisan " + yýl + " 30 Gundur.");
			break;
		case 5:
			System.out.println("Mayýs " + yýl + " 31 Gundur.");
			break;
		case 6:
			System.out.println("Haziran " + yýl + " 30 Gundur.");
			break;
		case 7:
			System.out.println("Temmuz " + yýl + " 31 Gundur.");
			break;
		case 8:
			System.out.println("Aðustos " + yýl + " 31 Gundur.");
			break;
		case 9:
			System.out.println("Eylül " + yýl + " 30 Gundur.");
			break;
		case 10:
			System.out.println("Ekim " + yýl + " 31 Gundur.");
			break;
		case 11:
			System.out.println("Kasým " + yýl + " 30 Gundur.");
			break;
		case 12:
			System.out.println("Aralýk " + yýl + " 31 Gundur.");
			break;
		
		default:
			System.out.println("Geçerli bir ay numarasý girin");
			break;
		}
		
		
		scan.close();
	}

}
