package com.a95;

public class NestedIfExd 
{
	public static void main(String[] args) 
	{
		
		int age = 18;
		
		if(age>=18)
		{
			System.out.println("Eligible to vote");
			
				//Nested If
				if(age>=50)
				{
					System.out.println("Senior Citizen");
				}
				else
				{
					System.out.println("Young Age");
				}
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
		
	}
}
