package c03_IfSwitchTernary_StringMethods;

import java.util.Scanner;

public class C06_String��indeHarfArama {

	public static void main(String[] args) {
		/*Kullan�c�dan bir isim yazmas�n� isteyin, ad�n uzunlu�u 3 olmal�d�r. 
		 * Ard�ndan, ad�n ayn� karakterlere sahip olup olmad���n� kontrol edin.
		 * 	Eger ayn� karakterlere sahipse
		 * "isim ayni karakterlere sahiptir." yazdirin.
		 * Eger ayni kaakterlere sahip degilse
		 * "Dizenin benzersiz karakterleri var" yazdirin.
		 * Ternary kullanin.*/

		
		Scanner scan=new Scanner(System.in);
		System.out.println("3 harfli bir isim girin");
		String name = scan.next();
		name=name.toLowerCase();
		
		
		System.out.println(name.length()==3  ?	(name.charAt(0)== name.charAt(1) ||name.charAt(0)==name.charAt(2)
				|| name.charAt(1)==name.charAt(2)) ?	"isim ayni karakterlere sahiptir."	: 
					"Dizenin benzersiz karakterleri var" : "L�tfen 3 harfli bir kelime girin");
		
		
		
		
		
		
		/*if (name.length()==3) {
			
			if (name.charAt(0)== name.charAt(1) ||name.charAt(0)==name.charAt(2)
				|| name.charAt(1)==name.charAt(2)) {
				System.out.println("isim ayni karakterlere sahiptir.");
			} else {
				System.out.println("Dizenin benzersiz karakterleri var");
			}
			
		} else {
			System.out.println("L�tfen 3 harfli bir kelime girin");
		}*/
		
		
		
		scan.close();
		
	}

}
