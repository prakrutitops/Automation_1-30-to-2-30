package com.a135;

//Arguments
public class ParaEx 
{
	int id;
	String name;
	String surname;
	
	public ParaEx(int id,String name,String surname) 
	{
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+surname);
	}
	
	public static void main(String[] args) 
	{
		
		ParaEx p1 = new ParaEx(101,"Mihir","a");
		ParaEx p2 = new ParaEx(102,"Kashmira","b");
		
		p1.display();
		p2.display();
		
		
	}
	
}
