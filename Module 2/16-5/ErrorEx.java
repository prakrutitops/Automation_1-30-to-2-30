package com.a135;

public class ErrorEx 
{
	public static void main(String[] args) {
		
		try
		{
			System.out.println("Program Start");
			int data = 10/0;
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Program End");
		}
		
		
	}
}
