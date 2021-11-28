package c05_List;

public class C03_ReverseString {

	public static void main(String[] args) {
	/*	Get a sentence from the user. 
	 * Accept the sentence received from the user as a parameter, 
	 * Invert sentence using Array and 
	 * write a Method that returns the result as a String to the main method.
	 * Note: Upper and lower case letters, spaces and special characters will not be changed.
	 * Input :
	 * It is very nice to write code.
	 * Output :
	 * .edoc etirw ot ecin yrev si tI */
		
		String str="It is very nice to write code.";
		System.out.println(reverse(str));
	}

	public static String reverse(String str) {
		char arr []= str.toCharArray();
		String reverseStr="";
		for (int i = arr.length-1; i >=0 ; i--) {
			reverseStr+=arr[i];
		}
		return reverseStr;
		
	}

}
