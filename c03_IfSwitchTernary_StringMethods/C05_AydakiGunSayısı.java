package c03_IfSwitchTernary_StringMethods;

import java.util.Scanner;

public class C05_AydakiGunSay�s� {

	public static void main(String[] args) {
	/*	Bir aydaki g�n say�s�n� hesaplayan bir Java program� yaz�n�z.
		INPUT:
		Ay Numarasi:
		2
		Yil :
		2016
		OUTPUT :
		Subat 2016 29 Gundur.*/
		//Kural 1 4 ile bolunemeyen yillar artik yil degildir
		//Kural 2 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
		//Kural 3 4 �un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400 �un kati olan yillar artik yildir
		

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen ay numaras�n� girin : ");
		int ay = scan.nextInt();
		System.out.println("L�tfen y�l numaras�n� girin : ");
		int y�l = scan.nextInt();
		
		switch (ay) {
		case 1:
			System.out.println("Ocak " + y�l + " 31 Gundur.");
			break;
		case 2:
			if (y�l%4==0) {
				if (!(y�l%100==0)) {
					System.out.println("�ubat " + y�l + " 29 Gundur." );
				} else if (y�l%400==0) {
					System.out.println("�ubat " + y�l + " 29 Gundur." );
				}
			} else {
				System.out.println("�ubat " + y�l + " 28 Gundur." );
			}
			break;
		case 3:
			System.out.println("Mart " + y�l + " 31 Gundur.");
			break;
		case 4:
			System.out.println("Nisan " + y�l + " 30 Gundur.");
			break;
		case 5:
			System.out.println("May�s " + y�l + " 31 Gundur.");
			break;
		case 6:
			System.out.println("Haziran " + y�l + " 30 Gundur.");
			break;
		case 7:
			System.out.println("Temmuz " + y�l + " 31 Gundur.");
			break;
		case 8:
			System.out.println("A�ustos " + y�l + " 31 Gundur.");
			break;
		case 9:
			System.out.println("Eyl�l " + y�l + " 30 Gundur.");
			break;
		case 10:
			System.out.println("Ekim " + y�l + " 31 Gundur.");
			break;
		case 11:
			System.out.println("Kas�m " + y�l + " 30 Gundur.");
			break;
		case 12:
			System.out.println("Aral�k " + y�l + " 31 Gundur.");
			break;
		
		default:
			System.out.println("Ge�erli bir ay numaras� girin");
			break;
		}
		
		
		scan.close();
	}

}
