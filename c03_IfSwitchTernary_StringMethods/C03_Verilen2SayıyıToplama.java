package c03_IfSwitchTernary_StringMethods;

import java.util.Scanner;

public class C03_Verilen2SayýyýToplama {

	public static void main(String[] args) {
		/*Verilen iki sayýnýn (sýfýrdan büyük veya sýfýra eþit) toplamýný hesaplayan ve yazdýran bir Java programý yazýn.
		 *  Verilen tamsayýlar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdýrýn.
		Ornek:
		INPUT :
		25
		46
		OUTPUT :
		Numaralarin Toplami:
		71 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ýki tam sayý girin:");
		long a =scan.nextInt();
		long b =scan.nextInt();
		
		if ( a>=0 && b>=0) {
			if (a+b<1000000000) {
				System.out.println("Numaralarin Toplami :\n" + (a+b));
			} else {
				System.out.println("OverFlow");
			}
		} else {
			System.out.println("Pozitif tam sayý girin");
		}
		
		scan.close();

	}

}
