package c01_Scanner;

import java.util.Scanner;

public class Q04_SekerSorusu {

	public static void main(String[] args) {
		//Kullanýcýya günde ne kadar çay içtiðini ve ne kadar þeker kullandýðýný sorun. 
		//Yýlda kaç kg þeker kullandýðýný hesaplayýn ve yazdýrýn.
		//1 þeker = 1.7 gr
		//Örnek Çýktý:
		//Yýlda 12.41 kg þeker kullanýyor.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Günde ne kadar çay içtiðinizi girin");
		@SuppressWarnings("unused")
		int cay=scan.nextInt();
		
		System.out.println("Günde ne kadar þeker kullanýyorsunuz");
		int seker=scan.nextInt();
		
		double yýllýk= (seker*1.7);
		
		System.out.println("Yýlda " +yýllýk + " kg þeker kullanýyor.");
		
		scan.close();
	}

}
