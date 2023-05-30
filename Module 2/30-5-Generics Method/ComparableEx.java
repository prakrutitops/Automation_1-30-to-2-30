package com.a305;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{

	int rollno;  
	String name;  
	int age;
	
	public Student(int rollno,String name,int age) 
	{
		// TODO Auto-generated constructor stub
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	
	@Override
	public int compareTo(Student o) 
	{
		// TODO Auto-generated method stub
		
		if(age==o.age) 
		{
			
			return 0;
		}
		else if(age>o.age)
		{
			
			return 1;  
		}	
		else
		{
			return -1;  
		}  
		
		
	
	}
	
	
	
}

public class ComparableEx 
{
	public static void main(String[] args) {
		
		
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		 
		Collections.sort(al);
		
		for(Student st:al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		} 
		
		
	}
}
