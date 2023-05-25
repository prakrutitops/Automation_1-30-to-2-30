package com.a255;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		
		ArrayList arrayList =new ArrayList<>();
		
		arrayList.add("Android");
		arrayList.add("Java");
		arrayList.add("Php");
		arrayList.add(1);
		
		ArrayList<String>arrayList2 = new ArrayList<>();
		
		arrayList2.add("A");
		arrayList2.add("B");
		arrayList2.add("C");
		arrayList2.add("Php");
		
		  arrayList.addAll(arrayList2); 
		  //arrayList.remove(1);
		  //arrayList.removeAll(arrayList2);
		 
		
		//arrayList.retainAll(arrayList2);
		
		Iterator i = arrayList.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}
}
