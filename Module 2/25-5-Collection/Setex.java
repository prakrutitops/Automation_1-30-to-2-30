package com.a255;

import java.util.HashSet;

public class Setex 
{
	public static void main(String[] args) 
	{
		
		HashSet set =new HashSet<>();
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("a");
		
		
		System.out.println(set);
	}
}
