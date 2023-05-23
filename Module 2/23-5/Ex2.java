package com.a235;

class C1 implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread C: "+i);
		}
	}
	
}
class D1 implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread D: "+i);
		}
	}
	
}

public class Ex2 
{
	public static void main(String[] args) {
		
		Thread t1 =new Thread(new C1());
		Thread t2 =new Thread(new D1());
		
		t1.start();
		t2.start();
		
	}
}
