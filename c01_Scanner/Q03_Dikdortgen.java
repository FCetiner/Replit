package c01_Scanner;

import java.util.Scanner;

public class Q03_Dikdortgen {

	public static void main(String[] args) {
		// Kullanýcýdan dikdörtgenin kenar uzunluklarýný alýn ve 
		//dikdörtgenin alanýný ve çevresini konsola yazdýran bir program yazýn.

//Örnek Çýktý:
//Alan: 32
//Çevre: 24

		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdörtgeninin kenar uzunluklarýný girin");
		int a=scan.nextInt();
		int b = scan.nextInt();
		
		int alan=a*b;
		int cevre=(2*a+2*b);
		System.out.println("Alan:"+alan);
		System.out.println("Cevre:" + cevre);
		
	scan.close();
	
	}

}
