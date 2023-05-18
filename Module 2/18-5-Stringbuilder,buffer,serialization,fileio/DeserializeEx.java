package com.a185;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEx 
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		
		ObjectInputStream in =new ObjectInputStream(new FileInputStream("E://mihir.txt"));
		Student st = (Student) in.readObject();
		System.out.println(st.id+" "+st.name);
	}
}
