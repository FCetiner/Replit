package c02_forWhile;

public class C05_100denGeriyeSayd�rma {

	public static void main(String[] args) {
		//100'den 0'a kadar �ift say�lar� yazd�r�n, ancak decrement(i--) kullanmay�n.
		//OUTPUT : 100 98 96 94 92 � � � � 2 0
		
		/*int a=100;
		while (a>=0) {
			if (a%2==0) {
				System.out.print(a + " ");
			}
		a--;
		}*/ //We re not allowed to use decrement

		int a=100;
		int b=0;
		
		while (b<=100) {
			if (b%2==0) {
				System.out.print(a-b + " ");
			}
		b++;
		}
		
		
	}

}
