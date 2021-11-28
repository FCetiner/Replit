package c01_Scanner;

import java.util.Scanner;

public class Q10_DakikalarýGüneCevirme {

	public static void main(String[] args) {
		// Kullanýcýdan dakika girmesini isteyin, 
		//Dakikalarý birkaç yýl ve gün sayýsýna dönüþtürmek için bir Java programý yazýn.
		//INPUT:
		//Dakika sayýsý: 3456789
		//OUTPUT :
		//3456789 dakika yaklaþýk 6 yýl 210 gündür
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen dakika girin:");
		int dakika = scan.nextInt();

		int gun =  dakika/(60*24)%365;
		int yýl = dakika/(60*24*365);
		
		System.out.println(dakika + " dakika yaklaþýk " + yýl + " yýl " + gun + " gun ");
		
		scan.close();
		
	}

}
