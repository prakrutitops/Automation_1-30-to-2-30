package com.a255;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 	
{
	public static void main(String[] args) 
	{
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("A", 101);
		map.put("B", 102);
		map.put("C", 103);
		map.put("D", 104);
		
		System.out.println(map.get("A"));
		
		for(Map.Entry map1 : map.entrySet())
		{
			System.out.println(map1.getKey()+" "+map1.getValue());
		}
		
		
	}
}
