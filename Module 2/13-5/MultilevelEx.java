package com.a135;

final class Secret
{
	void s()
	{
		System.out.println("Secrets");
	}
}
class Animal 
{
	void a()
	{
		System.out.println("Under Animal Category");
	}
}
class Birds extends Animal
{
	void b()
	{
		System.out.println("Birds Category");
	}
}
class Insects extends Birds
{
	void c()
	{
		System.out.println("Insects Category");
	}
}

public class MultilevelEx 
{
	
	public static void main(String[] args) {
		
		Insects b =new Insects();
		
		b.a();
		b.b();
		b.c();
		//b.s();
		
	}
	
}
