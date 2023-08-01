package com.collect;

import java.util.Comparator;

public class RollnoComparision implements Comparator<Student> 
{
	public int compare(Student s1, Student s2)
	{
		int val = 0;
		if(s1.getRoollNo() == s2.getRoollNo())
		{
			val =0;
		}
		else if(s1.getRoollNo()> s2.getRoollNo())
		{
			val = -1;
		}
		else
		{
			val = 1;
		}
		return val;
	}
}
