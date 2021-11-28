package c05_List;

import java.util.Arrays;


public class C02_List {

	public static void main(String[] args) {
		/* Create a 10-element list. Swap the 8th element with the 3rd element.

INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

Output:

[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali] */
		
		
		
		String [] names = {"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

		String temp=names[7];
		names[7]=names[2];
		names[2]=temp;
	
		
		System.out.println(Arrays.deepToString(names));
	}

}
