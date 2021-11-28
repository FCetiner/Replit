package c01_Scanner;

import java.util.Scanner;

public class Q10_Dakikalar�G�neCevirme {

	public static void main(String[] args) {
		// Kullan�c�dan dakika girmesini isteyin, 
		//Dakikalar� birka� y�l ve g�n say�s�na d�n��t�rmek i�in bir Java program� yaz�n.
		//INPUT:
		//Dakika say�s�: 3456789
		//OUTPUT :
		//3456789 dakika yakla��k 6 y�l 210 g�nd�r
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen dakika girin:");
		int dakika = scan.nextInt();

		int gun =  dakika/(60*24)%365;
		int y�l = dakika/(60*24*365);
		
		System.out.println(dakika + " dakika yakla��k " + y�l + " y�l " + gun + " gun ");
		
		scan.close();
		
	}

}
