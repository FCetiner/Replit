package c03_IfSwitchTernary_StringMethods;

import java.util.Scanner;

public class C04_SwitchCase {

	public static void main(String[] args) {
	/*	Char de�i�ken yan�t�n�n de�erini test eden ve a�a��daki i�lemleri ger�ekle�tiren bir switch ifadesi yaz�n:
			yan�t a ise,
			"Talebiniz i�leniyor" mesaj� yazd�r�l�r
			yan�t b ise,
			"yine de ilgilendi�iniz i�in te�ekk�r ederiz" mesaj� yazd�r�l�r yan�t c ise,
			"�zg�n�z, �u anda herhangi bir yard�m yok" mesaj� yazd�r�l�r
			ba�ka herhangi bir yan�t de�eri i�in,
			"Ge�ersiz giri�, l�tfen tekrar deneyin!" yazd�r�l�r */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir harf girin:");
		char harf = scan.next().toLowerCase().charAt(0);
		
		switch (harf) {
		case 'a':
			System.out.println("Talebiniz i�leniyor");
			break;
		case 'b':
			System.out.println("yine de ilgilendi�iniz i�in te�ekk�r ederiz");
			break;
		case 'c':
			System.out.println("�zg�n�z, �u anda herhangi bir yard�m yok");
			break;

		default:
			System.out.println("Ge�ersiz giri�, l�tfen tekrar deneyin!");
			break;
		}
		
		scan.close();
	}

}
