package com.a185;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileIo 
{
	public static void main(String[] args) throws IOException {
		
		String s="welcome to tops";
		FileOutputStream fout =new FileOutputStream("E://prakruti.txt");
		fout.write(s.getBytes());
		System.out.println("success");
	}
	
}
