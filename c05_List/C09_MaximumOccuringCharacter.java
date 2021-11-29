package c05_List;

import java.util.Scanner;

public class C09_MaximumOccuringCharacter {

	public static void main(String[] args) {
		/*Write a Java program to get a String from user as input and 
		 * find the maximum occurring character in that string.(Ignore case sensitivity).
		 * Input : Learning java is easy
		 * Output: maximum occurring character is : a
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("String girin : ");
		String str= scan.nextLine();
        int[] freq = new int[str.length()];  //Sayýlarýn kaç kez tekrarlandýðýný bu arrayda toplayacaðýz
        char maxChar = str.charAt(0);  
        int i, j,  max;          
       
        char string[] = str.toCharArray();  
        for(i = 0; i < string.length; i++) {  
            freq[i] = 1;  
            for(j = i+1; j < string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
                    freq[i]++;  
                    string[j] = '0';  
                }  
            }  
        }  
         
       max = freq[0];  
        for(i = 0; i <freq.length; i++) {  
            
            if(max < freq[i]) {  
                max = freq[i];  
                maxChar = string[i];  
            }  
        }  
        System.out.println("maximum occurring character is :" + maxChar);  
	
	}

}
