package c05_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_DeleteLetterFromStr {

	public static void main(String[] args) {
		//Write a program that deletes the letters 'a' from the names in the list given as input.
		//INPUT : 
	     //list1={"Ali","Veli","Ayse","Fatma","Omer"}
		 //OUTPUT : 
	     // [Veli,Omer]
		
		
		List <String> isimler = new ArrayList <>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
		
		for (int i = 0; i < isimler.size(); i++) {
			if (isimler.get(i).contains("a")||isimler.get(i).contains("A")) {
				isimler.remove(i);
			i--;
			}
		}

		
		System.out.println(isimler.toString().replace(", ", ","));
	
	}

}
