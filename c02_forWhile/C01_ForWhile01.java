package c02_forWhile;

import java.util.Scanner;

public class C01_ForWhile01 {

	public static void main(String[] args) {
		//Kullan�c�dan bir isim ve bir karakter girmesini isteyin,
		//ard�ndan d�ng�leri kullanarak karakterin isimde ka� kez tekrarland���n� kontrol edin

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir isim giriniz");
		String isim = scan.nextLine() ;
		System.out.println("Bir karakter giriniz");
		char krk = scan.next().charAt(0) ;
		
		int tane=0;
		
		for (int i = 0; i < isim.length(); i++) {
			if (krk==isim.charAt(i)) {
				++tane;
			}
		}
	
		System.out.println( krk + " yaz� i�inde  " + tane +" tanedir");
	
	scan.close();
	}

}
