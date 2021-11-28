package c02_forWhile;

public class C10_1den100eDogalSayýlarýnToplamý {

	public static void main(String[] args) {
		// 1'den 100'e kadar olan doðal sayýlarýn toplamýný bulan programý yazýnýz.
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
