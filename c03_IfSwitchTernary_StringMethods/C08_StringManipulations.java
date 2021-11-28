package c03_IfSwitchTernary_StringMethods;

import java.util.Scanner;

public class C08_StringManipulations {

	public static void main(String[] args) {
		// Kullan�c�dan bir isim girmesini isteyin ve 
		//son 2 harfinin 3 kopyas�ndan olu�an yeni bir String yazd�r�n
		//Kullanicidan alinan isim uzunlu�u en az 2 olacakt�r.
		//INPUT : Mustafa
		//OUTPUT : fafafa

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen en az 2 karakterli bir isim girin");
		String isim = scan.next();
		
		if (isim.length()>1) {
			String yeniIsim= isim.substring(isim.length()-2)+isim.substring(isim.length()-2)+isim.substring(isim.length()-2);
			
			System.out.println(yeniIsim);
		} else {
			System.out.println("Girdi�ini kelime en az 2 karakter olmal�");
		}
		
		scan.close();
	}

}
