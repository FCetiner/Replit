package c01_Scanner;

import java.util.Scanner;

public class Q03_Dikdortgen {

	public static void main(String[] args) {
		// Kullan�c�dan dikd�rtgenin kenar uzunluklar�n� al�n ve 
		//dikd�rtgenin alan�n� ve �evresini konsola yazd�ran bir program yaz�n.

//�rnek ��kt�:
//Alan: 32
//�evre: 24

		Scanner scan = new Scanner(System.in);
		System.out.println("Dikd�rtgeninin kenar uzunluklar�n� girin");
		int a=scan.nextInt();
		int b = scan.nextInt();
		
		int alan=a*b;
		int cevre=(2*a+2*b);
		System.out.println("Alan:"+alan);
		System.out.println("Cevre:" + cevre);
		
	scan.close();
	
	}

}
