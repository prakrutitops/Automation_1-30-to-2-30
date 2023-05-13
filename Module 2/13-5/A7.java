package com.a135;

interface Print
{
	void print();
	
}
interface Show
{
	void show();
}

public class A7 implements Print,Show
{
	public static void main(String[] args) 
	{
		A7 a =new A7();
		a.print();
		a.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("shwoing");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("printing");
	}
}
