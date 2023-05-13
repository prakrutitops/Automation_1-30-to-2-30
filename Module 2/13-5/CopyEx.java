package com.a135;

public class CopyEx 
{
	int id;
	String name;
	String surname;
	
	public CopyEx(int i,String n,String s) 
	{
		// TODO Auto-generated constructor stub
		
		id = i;
		name = n;
		surname = s;
	}
	public CopyEx(CopyEx c) 
	{
		// TODO Auto-generated constructor stub
		System.out.println(c.id+" "+c.name+" "+c.surname);
	}
	void display()
	{
		System.out.println(id+" "+name+" "+surname);
	}
	
	public static void main(String[] args) 
	{
		CopyEx c1 =new CopyEx(101, "A", "B");
		CopyEx c2 =new CopyEx(102, "C", "D");
		CopyEx c3 =new CopyEx(c1);
		CopyEx c4 =new CopyEx(c2);
		
		c1.display();
		c2.display();
		
		
		
	}
}
