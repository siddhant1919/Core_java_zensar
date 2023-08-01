package com.collect;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentsCollection {

	public static void main(String[] args) 
	{
		//Create collection of students
		ArrayList<Student> a1  = new ArrayList();
		
		a1.add(new Student(1,"ABC", 21));
		a1.add(new Student(44,"DEF", 31));
		a1.add(new Student(3,"GHI", 23));
		a1.add(new Student(5,"JKL", 19));
		a1.add(new Student(9,"MNO", 23));
		
		//second way to create student
		Student s1 = new Student(12, "CCC", 26);
		a1.add(s1);
		
		//Removing object from collection
		a1.remove(new Student(4,"JKL", 19));

		//search the object within collection
		boolean val = a1.contains(new Student(12, "CCC", 26));
		if(val)
		{
			System.out.println("Student record found");
		}
		else
		{
			System.out.println("Unable to find record");
		}
		
		//sorting the object from collections using age of students
		System.out.println(a1);
		
		//Collections.sort(a1, new AgeComparision());
		//System.out.println(a1);
		
		a1.sort(new RollnoComparision());
		System.out.println(a1);
		
		//iterate through the collections
		Iterator<Student> i = a1.iterator();
		while(i.hasNext())
		{
			Student s = i.next();
			if(s.getAge() > 30)
			{
				s.setRoollNo(111);
			}
			else
			{
				System.out.println("Correct roll no allocation");
			}
		}
		
		System.out.println(a1);
		
		

	}

}
