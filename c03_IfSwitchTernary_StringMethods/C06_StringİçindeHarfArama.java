package c03_IfSwitchTernary_StringMethods;

import java.util.Scanner;

public class C06_StringÝçindeHarfArama {

	public static void main(String[] args) {
		/*Kullanýcýdan bir isim yazmasýný isteyin, adýn uzunluðu 3 olmalýdýr. 
		 * Ardýndan, adýn ayný karakterlere sahip olup olmadýðýný kontrol edin.
		 * 	Eger ayný karakterlere sahipse
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
					"Dizenin benzersiz karakterleri var" : "Lütfen 3 harfli bir kelime girin");
		
		
		
		
		
		
		/*if (name.length()==3) {
			
			if (name.charAt(0)== name.charAt(1) ||name.charAt(0)==name.charAt(2)
				|| name.charAt(1)==name.charAt(2)) {
				System.out.println("isim ayni karakterlere sahiptir.");
			} else {
				System.out.println("Dizenin benzersiz karakterleri var");
			}
			
		} else {
			System.out.println("Lütfen 3 harfli bir kelime girin");
		}*/
		
		
		
		scan.close();
		
	}

}
