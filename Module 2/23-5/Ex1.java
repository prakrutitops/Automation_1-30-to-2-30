package com.a235;

class A1 extends Thread
{
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		//super.run();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread A: "+i);
		}
	}
}
class B1 extends Thread
{
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		//super.run();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread B: "+i);
		}
	}
}


public class Ex1 
{
	public static void main(String[] args) 
	{
		
		A1 a =new A1();
		B1 b =new B1();
		
		a.start();
		b.start();
		
	}
}
