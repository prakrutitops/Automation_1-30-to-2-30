package com.a135;

public class StaticMethodEx 
{
	int id;
	String name;
	static String college="ABCD";
	
	public StaticMethodEx(int i,String n) 
	{
		// TODO Auto-generated constructor stub
		id = i;
		name = n;
	}
	
	static void change()
	{
		college="VVP";
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	public static void main(String[] args) 
	{
		change();
		
		StaticMethodEx s1 =new StaticMethodEx(101,"A");
		StaticMethodEx s2 =new StaticMethodEx(102,"B");
		
		s1.display();
		s2.display();
	}
}
