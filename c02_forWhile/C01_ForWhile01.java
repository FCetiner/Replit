package c02_forWhile;

import java.util.Scanner;

public class C01_ForWhile01 {

	public static void main(String[] args) {
		//Kullanýcýdan bir isim ve bir karakter girmesini isteyin,
		//ardýndan döngüleri kullanarak karakterin isimde kaç kez tekrarlandýðýný kontrol edin

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir isim giriniz");
		String isim = scan.nextLine() ;
		System.out.println("Bir karakter giriniz");
		char krk = scan.next().charAt(0) ;
		
		int tane=0;
		
		for (int i = 0; i < isim.length(); i++) {
			if (krk==isim.charAt(i)) {
				++tane;
			}
		}
	
		System.out.println( krk + " yazý içinde  " + tane +" tanedir");
	
	scan.close();
	}

}
