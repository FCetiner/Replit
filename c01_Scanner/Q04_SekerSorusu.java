package c01_Scanner;

import java.util.Scanner;

public class Q04_SekerSorusu {

	public static void main(String[] args) {
		//Kullan�c�ya g�nde ne kadar �ay i�ti�ini ve ne kadar �eker kulland���n� sorun. 
		//Y�lda ka� kg �eker kulland���n� hesaplay�n ve yazd�r�n.
		//1 �eker = 1.7 gr
		//�rnek ��kt�:
		//Y�lda 12.41 kg �eker kullan�yor.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("G�nde ne kadar �ay i�ti�inizi girin");
		@SuppressWarnings("unused")
		int cay=scan.nextInt();
		
		System.out.println("G�nde ne kadar �eker kullan�yorsunuz");
		int seker=scan.nextInt();
		
		double y�ll�k= (seker*1.7);
		
		System.out.println("Y�lda " +y�ll�k + " kg �eker kullan�yor.");
		
		scan.close();
	}

}
