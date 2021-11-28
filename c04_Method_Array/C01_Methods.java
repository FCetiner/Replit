package c04_Method_Array;
import java.util.Scanner;

public class C01_Methods {

	public static void main(String[] args) {
		//Write a return method to reverse number.
			//	Input : 12345
			//	Output : 54321

	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		String num = scan.nextLine();
		
		System.out.println(reverseNum(num));
	
		
		scan.close();
	}

	private static String reverseNum(String num) {
		
		String reverseNum="";
		
		for (int i = num.length()-1; i >=0; i--) {
			reverseNum+=num.charAt(i);
		}
		
		
		return reverseNum;
		
	}

}
