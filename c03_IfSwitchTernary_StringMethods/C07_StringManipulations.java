package c03_IfSwitchTernary_StringMethods;

import java.util.Scanner;

public class C07_StringManipulations {

	public static void main(String[] args) {
		//2 kelime olu�turun: isim1 ve isim2
	    // isim1 �ift say�da karakter i�eriyorsa,
	    // ikinci kelimeyi ilk ad�n ortas�na yerle�tirin
	    // ilk kelime tek sayida karakter iceriyorsa
	    // �isim1, isim2 ye eklenemiyor� yazd�r�n
	    // �rne�in:
	    // isim1= mehmet
	    // isim2= ahmet
	    // Yazd�r ==> mehahmetmet
	    // isim1= memet
	    // isim2= ahmet
	    // Yazd�r ==> isim1, isim2 ye eklenemiyor
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen 2 adet isim girin");
		String isim1 = scan.next();
		String isim2 = scan.next();
		
		String yeniIs�m="";
		int uzunluk=isim1.length();
		
		if (isim1.length()%2==0) {
			yeniIs�m=isim1.substring(0, (uzunluk/2)) + isim2 + isim1.substring(uzunluk/2);
			System.out.println(yeniIs�m);
		} else {
			System.out.println("isim1, isim2 ye eklenemiyor");
		}
		scan.close();
	}

}
