package c03_IfSwitchTernary_StringMethods;

import java.util.Scanner;

public class C02_IsmiVerilenFormattaYazdýrma {

	public static void main(String[] args) {
		/*Kullanýcýya Adý, Soyadý ve kredi kartý numaralarýný sorarak verilen formata ceviren java kodunu yaziniz.
		Input :
		John White
		1234234534561478
		Output : Name :
		J* W**
		CCN : ** ** **** 1478
		Ilk Harfler Buyuk harf ile baslamalidir.*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ýsminiz:");
		String isim= scan.nextLine();
		System.out.println("Soyisminiz::");
		String soyisim= scan.nextLine();
		System.out.println("Kredi kartý numaranýz:");
		String kart= scan.nextLine();
		
		String newIsim=isim.substring(0, 1).toUpperCase() +(isim.substring(1, isim.length()).replaceAll("\\w","*"));
		String newSoyisim=soyisim.substring(0, 1).toUpperCase() +(soyisim.substring(1, soyisim.length()).replaceAll("\\w","*"));
		String newKart=(kart.substring(0, kart.length()-4).replaceAll("\\d","*"))+kart.substring(kart.length()-4, kart.length());
		
		System.out.println("Name :\n" +newIsim+ " " + newSoyisim + "\nCCN : " + newKart);

		scan.close();
	}

}
