package com.a165;

import java.io.IOException;

class P1
{
	void p1() throws IOException
	{
		System.out.println("P Executed");
	}
}
class Q1 extends P1
{
	
	void q1() throws IOException 
	{
		System.out.println("Q Executed");
		P1 r2 =new P1();
		r2.p1();
	}
}
class R1 extends Q1
{
	void r1() throws IOException
	{
		System.out.println("R Executed");
		
	}
}

public class ThrowsEx 
{
	public static void main(String[] args) throws IOException
	{
		
		R1 r =new R1();
		
		r.p1();
		r.q1();
		r.r1();
		
	}
}
