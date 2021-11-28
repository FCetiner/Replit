package c05_List;

public class C01_List_MaxMinOccuringCharacter {

	public static void main(String[] args) {
		// Write a Java program to get a String from user as input 
		//and find the maximum occurring character in that string. (Ignore case sensitivity)
		//input :
		//Learning java is easy
		//output:
		//maximum occurring character is : a
		String str = "Learning java is easy";  
        int[] freq = new int[str.length()];  //Sayýlarýn kaç kez tekrarlandýðýný bu arrayda toplayacaðýz
        char minChar = str.charAt(0), maxChar = str.charAt(0);  
        int i, j, min, max;          
          
        //Converts given string into character array  
        char string[] = str.toCharArray();  //str.toCharArray yüntemi
          
        //Count each word in given string and store in array freq  
        for(i = 0; i < string.length; i++) {  
            freq[i] = 1;  
            for(j = i+1; j < string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
        }  
         // System.out.println(Arrays.toString(freq)); //tekrarlanma sýklýklarý [1, 2, 4, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1]
        //Determine minimum and maximum occurring characters  
        min = max = freq[0];  
        for(i = 0; i <freq.length; i++) {  
              
            //If min is greater than frequency of a character   
            //then, store frequency in min and corresponding character in minChar  
            if(min > freq[i] && freq[i] != '0') {  
                min = freq[i];  
                minChar = string[i];  //en cok tekrar eden karakteri Char array'deki karþýlýðýný aloyoruz
            }  
            //If max is less than frequency of a character   
            //then, store frequency in max and corresponding character in maxChar  
            if(max < freq[i]) {  
                max = freq[i];  
                maxChar = string[i];  
            }  
        }  
          
        System.out.println("Minimum occurring character: " + minChar);  
        System.out.println("Maximum occurring character: " + maxChar);  
		
	}

}
