package c02_forWhile;

import java.util.Scanner;

public class C03_String��indeKrkD�nd�rme {

	public static void main(String[] args) {
		// Bir String icerisinde yinelenen karakterleri d�nd�ren bir kod yaz�niz.(m�lakat Sorusu)
		//Input :
		//String str=�Javaisalsoeasy�
		//Output: a s

		Scanner scan= new Scanner (System.in);
		System.out.println("L�tfen bir String girin");
		String str = scan.nextLine();

		
		System.out.println(dondur (str));
	
	
	
	
	scan.close();
	}

	private static String dondur(String str) {
		String harf = "";
		for (int i = 0; i < str.length()-1; i++) {
			for (int j = i+1; j < str.length()-1; j++) {
				if (str.charAt(i)==str.charAt(j)) {
					if (!harf.contains(str.substring(i,i+1))) {
				         harf += str.charAt(i) + " ";
					}
				}
			}
		}
		return harf;
		
	}

}
