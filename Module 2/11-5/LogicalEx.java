package com.a115;

public class LogicalEx 
{
	public static void main(String[] args) {
		
		int eng = 64;
		int maths=64;
		
		if((eng>=65) && (maths>=65))
		{
			System.out.println("A Grade");
		}
		
		else if((eng>=65) || (maths<=40))
		{
			System.out.println("Good in english but not in maths");
		}
		
		else if((eng<=40) || (maths<=65))
		{
			System.out.println("Good in maths but not in english");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
}
