package c02_forWhile;

import java.util.Scanner;

public class C09_GirilenSay�y�TersineCevirme {

	public static void main(String[] args) {
		//Kullan�c�n�n girdi�i say�y� tersine �eviren bir java program� yaz�n�z. (Mulakat Sorusu)
		//Input :1238
		//Output :Girilen Numananin Tersi: 8321

		Scanner scan=new Scanner(System.in);
		System.out.print("L�tfen bir say� girin");
		int say�=scan.nextInt();
		
		String a= String.valueOf(say�);
		String ters="";
		
		for (int i = a.length(); i >=1 ; i--) {		//azra
			ters+=a.substring(i-1, i);
		}
		System.out.println("Girilen Numananin Tersi: " + ters);
	
	
	scan.close();
	}

}
