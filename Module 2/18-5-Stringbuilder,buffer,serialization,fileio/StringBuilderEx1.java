package com.a185;

public class StringBuilderEx1 
{
	public static void main(String[] args) {
		
		String s1 ="sachin";
		String s2 ="TOPS";
		String s3="  abcd  ";
		String s4="php is a programming language .php is a open source ";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.trim());
		System.out.println(s4.replace("php","java"));
		System.out.println(s2.charAt(0));
	}
}
