package com.a255;

import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		
		Vector v =new Vector<>(5);
		
		v.add("a");
		v.add("b");
		v.add("a");
		v.add("b");
		v.add("a");
		v.add("a");
		v.add("b");
		v.add("a");
		v.add("a");
		v.add("a");
		v.add("a");
		
		System.out.println("Size: "+v.size());
		System.out.println("Capacity: "+v.capacity());
		
		 System.out.println(v.firstElement());
		 System.out.println(v.lastElement());
	
		 
		 if(v.contains("a"))
		 {
			 System.out.println("True");
		 }
		 else
		 {
			 System.out.println("false");
		 }
		 
	}
}
