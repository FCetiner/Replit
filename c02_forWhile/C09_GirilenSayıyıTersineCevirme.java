package c02_forWhile;

import java.util.Scanner;

public class C09_GirilenSayýyýTersineCevirme {

	public static void main(String[] args) {
		//Kullanýcýnýn girdiði sayýyý tersine çeviren bir java programý yazýnýz. (Mulakat Sorusu)
		//Input :1238
		//Output :Girilen Numananin Tersi: 8321

		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen bir sayý girin");
		int sayý=scan.nextInt();
		
		String a= String.valueOf(sayý);
		String ters="";
		
		for (int i = a.length(); i >=1 ; i--) {		//azra
			ters+=a.substring(i-1, i);
		}
		System.out.println("Girilen Numananin Tersi: " + ters);
	
	
	scan.close();
	}

}
