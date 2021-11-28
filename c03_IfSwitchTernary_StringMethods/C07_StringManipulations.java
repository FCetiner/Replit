package c03_IfSwitchTernary_StringMethods;

import java.util.Scanner;

public class C07_StringManipulations {

	public static void main(String[] args) {
		//2 kelime oluþturun: isim1 ve isim2
	    // isim1 çift sayýda karakter içeriyorsa,
	    // ikinci kelimeyi ilk adýn ortasýna yerleþtirin
	    // ilk kelime tek sayida karakter iceriyorsa
	    // “isim1, isim2 ye eklenemiyor” yazdýrýn
	    // Örneðin:
	    // isim1= mehmet
	    // isim2= ahmet
	    // Yazdýr ==> mehahmetmet
	    // isim1= memet
	    // isim2= ahmet
	    // Yazdýr ==> isim1, isim2 ye eklenemiyor
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 2 adet isim girin");
		String isim1 = scan.next();
		String isim2 = scan.next();
		
		String yeniIsým="";
		int uzunluk=isim1.length();
		
		if (isim1.length()%2==0) {
			yeniIsým=isim1.substring(0, (uzunluk/2)) + isim2 + isim1.substring(uzunluk/2);
			System.out.println(yeniIsým);
		} else {
			System.out.println("isim1, isim2 ye eklenemiyor");
		}
		scan.close();
	}

}
