package c02_forWhile;

import java.util.Scanner;

public class C04_forWhile04 {

	public static void main(String[] args) {
		// Girdi olarak bir tamsay� kabul eden ve fakt�riyel hesaplayan programi yaz�niz.

		//Input : 6
		//Output: 6!=65432*1=720

		Scanner scan=new Scanner(System.in);
		System.out.println("Input\t:");
		int say�=scan.nextInt();
		
		int sonuc=1;
		
		System.out.print("6!=");
		for (int i = say�; i > 1   ; i--) {
			System.out.print(i+"*");
			sonuc=i*sonuc;
			}
			System.out.println("1="+sonuc);
			
			scan.close();
	}

}
