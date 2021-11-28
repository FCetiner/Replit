package c03_IfSwitchTernary_StringMethods;

import java.util.Scanner;

public class C03_Verilen2Say�y�Toplama {

	public static void main(String[] args) {
		/*Verilen iki say�n�n (s�f�rdan b�y�k veya s�f�ra e�it) toplam�n� hesaplayan ve yazd�ran bir Java program� yaz�n.
		 *  Verilen tamsay�lar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazd�r�n.
		Ornek:
		INPUT :
		25
		46
		OUTPUT :
		Numaralarin Toplami:
		71 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�ki tam say� girin:");
		long a =scan.nextInt();
		long b =scan.nextInt();
		
		if ( a>=0 && b>=0) {
			if (a+b<1000000000) {
				System.out.println("Numaralarin Toplami :\n" + (a+b));
			} else {
				System.out.println("OverFlow");
			}
		} else {
			System.out.println("Pozitif tam say� girin");
		}
		
		scan.close();

	}

}
