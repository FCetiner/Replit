package c03_IfSwitchTernary_StringMethods;

import java.util.Scanner;

public class C08_StringManipulations {

	public static void main(String[] args) {
		// Kullanýcýdan bir isim girmesini isteyin ve 
		//son 2 harfinin 3 kopyasýndan oluþan yeni bir String yazdýrýn
		//Kullanicidan alinan isim uzunluðu en az 2 olacaktýr.
		//INPUT : Mustafa
		//OUTPUT : fafafa

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen en az 2 karakterli bir isim girin");
		String isim = scan.next();
		
		if (isim.length()>1) {
			String yeniIsim= isim.substring(isim.length()-2)+isim.substring(isim.length()-2)+isim.substring(isim.length()-2);
			
			System.out.println(yeniIsim);
		} else {
			System.out.println("Girdiðini kelime en az 2 karakter olmalý");
		}
		
		scan.close();
	}

}
