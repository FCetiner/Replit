package c01_Scanner;

import java.util.Scanner;

public class Q07_ {

	public static void main(String[] args) {
		// Kullan�c�dan �� basamakl� bir say� girmesini ve bu say�n�n basamaklar�n�n toplam�n� bulmas�n� isteyin.
		//�rnek ��kt�:
		//Verilen tamsay�n�n rakamlar� toplam� 10'dur.

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen 3 basamakl� bir say� girin:");
		int a = scan.nextInt();
		int toplam = a%10 + ((a/10)%10) + ((a/100)%10);
		
		System.out.println("Verilen tamsay�n�n rakamlar� toplam� " + toplam + "'dur.");
		scan.close();
		
	}

}
