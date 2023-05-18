package com.a185;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SearilizeEx 
{
	public static void main(String[] args) throws IOException 
	{
		Student s1 =new Student(101,"aaa");
		FileOutputStream fout = new FileOutputStream("E://mihir.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		
	}
}
