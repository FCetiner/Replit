package c02_forWhile;

import java.util.Scanner;

public class C07_M�kemmelSay� {

	public static void main(String[] args) {
	/*	Sayinin M�kemmel say� olup olmad���n� kontrol eden Java kodunu yaz�n.
	 * Say�n�n kendisi hari� pozitif b�lenlerinin toplam� o say�ya e�itse, 
	 * herhangi bir say� M�kemmel Say� olarak bilinir.
		Input :
		6
		Output:
		6 Mukemmel Sayidir.
		======================
		Input
		7
		Output:
		7 Mukemmel Sayidir degildir.*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir say� girin");
		int a=scan.nextInt();
		int toplam=0;
		
		for (int i = 1; i <a; i++) {
			if (a%i==0) {
				toplam+=i;
			} 
		}
		
		if (toplam==a) {
			System.out.println(a+ " M�kemmel Sayidir.");
		} else {
			System.out.println(a+ " M�kemmel Sayidir De�ildir.");
		}
		
		
		scan.close();
		
	}

}
