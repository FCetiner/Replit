package c03_IfSwitchTernary_StringMethods;

import java.util.Scanner;

public class C02_IsmiVerilenFormattaYazd�rma {

	public static void main(String[] args) {
		/*Kullan�c�ya Ad�, Soyad� ve kredi kart� numaralar�n� sorarak verilen formata ceviren java kodunu yaziniz.
		Input :
		John White
		1234234534561478
		Output : Name :
		J* W**
		CCN : ** ** **** 1478
		Ilk Harfler Buyuk harf ile baslamalidir.*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�sminiz:");
		String isim= scan.nextLine();
		System.out.println("Soyisminiz::");
		String soyisim= scan.nextLine();
		System.out.println("Kredi kart� numaran�z:");
		String kart= scan.nextLine();
		
		String newIsim=isim.substring(0, 1).toUpperCase() +(isim.substring(1, isim.length()).replaceAll("\\w","*"));
		String newSoyisim=soyisim.substring(0, 1).toUpperCase() +(soyisim.substring(1, soyisim.length()).replaceAll("\\w","*"));
		String newKart=(kart.substring(0, kart.length()-4).replaceAll("\\d","*"))+kart.substring(kart.length()-4, kart.length());
		
		System.out.println("Name :\n" +newIsim+ " " + newSoyisim + "\nCCN : " + newKart);

		scan.close();
	}

}
