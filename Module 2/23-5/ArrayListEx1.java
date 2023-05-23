package com.a235;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 
{
	public static void main(String[] args) {
		
		
		ArrayList<String> arrayList =new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		
		ArrayList<String> arrayList2 =new ArrayList<>();
		arrayList2.add("D");
		arrayList2.add("E");
		arrayList2.add("F");
		arrayList2.add("C");
		
		/*
		 * arrayList.addAll(arrayList2); arrayList.remove(1);
		 * arrayList.removeAll(arrayList2);
		 */
		
		arrayList.retainAll(arrayList2);
		
		//fetch 
		Iterator<String> i = arrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
