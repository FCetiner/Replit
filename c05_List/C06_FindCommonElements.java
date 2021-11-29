package c05_List;

import java.util.ArrayList;
import java.util.List;

public class C06_FindCommonElements {

	public static void main(String[] args) {
		//Write a program to find the common elements between two String Arrays (without case sensitivity)
		//Input1 : {John,Brad,Ange,Sofia,Emily}
		//Input2 : {sofia,brad,grace,emily,hazel}
		//Output : [sofia,brad,emily]

		String arr1[]={"John","Brad","Ange","Sofia","Emily"};
		String arr2[]={"sofia","brad","grace","emily","hazel"};
		List <String> arr3= new ArrayList <> ();
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr2[i].toLowerCase().contains(arr1[j].toLowerCase())   ) {
					arr3.add(arr2[i].toLowerCase());
				}
			}
		}
		System.out.println(arr3);
	}

}
