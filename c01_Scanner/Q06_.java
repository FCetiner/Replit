package c01_Scanner;

import java.util.Scanner;

public class Q06_ {

	public static void main(String[] args) {
		//Kullanýcý tarafýndan girilen DOUBLE sayýyý tam sayýya çeviren bir program yazýnýz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz:");
		double a = scan.nextDouble();
		
		int b =  (int) a;
		
		System.out.println(b);

		scan.close();
	}

}
