package c01_Scanner;

import java.util.Scanner;

public class Q06_ {

	public static void main(String[] args) {
		//Kullan�c� taraf�ndan girilen DOUBLE say�y� tam say�ya �eviren bir program yaz�n�z.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz:");
		double a = scan.nextDouble();
		
		int b =  (int) a;
		
		System.out.println(b);

		scan.close();
	}

}
