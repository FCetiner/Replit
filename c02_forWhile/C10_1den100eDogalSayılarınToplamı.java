package c02_forWhile;

public class C10_1den100eDogalSay�lar�nToplam� {

	public static void main(String[] args) {
		// 1'den 100'e kadar olan do�al say�lar�n toplam�n� bulan program� yaz�n�z.
		//OutPut:
		//Sayilarin Toplami : 5050
		
		int a=1;
		int toplam=0;
		while (a<=100) {
			toplam+=a;
		a++;
		}
		System.out.println("Sayilarin Toplami : " + toplam);
	}

}
