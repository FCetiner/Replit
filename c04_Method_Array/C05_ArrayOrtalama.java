package c04_Method_Array;

public class C05_ArrayOrtalama {

	public static void main(String[] args) {
		// Write a java program that calculates the average value of array elements
		//input[]= {1,2,3,4,5,6,7}
		//Output : 4

		int arr []= {1,2,3,4,5,6,7};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		System.out.println(toplam/arr.length);
		
	}

}
