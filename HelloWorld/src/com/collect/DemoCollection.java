package com.collect;

import java.util.*;
import java.util.TreeSet;
public class DemoCollection 
{

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add("java");
		a1.add(new Float(20.0f));
		a1.add(new Float(20.0f));
		a1.add(new Double(200.4));
		
//		Remove
		a1.remove(2);
		a1.remove(20.0f);
		System.out.println(a1);

		
		HashSet s1 = new HashSet();
		s1.add("Java");
		s1.add("Spring");
		s1.add("Hibernationg");
		s1.add("Angular");
		s1.add("Java");
		
		
//		TreeSet t1 = new TreeSet();
//		t1.add("Java");
//		t1.add("Spring");
//		t1.add("Hibernating");
//		t1.add("Angular");
//		t1.add("Java");
		
		Vector v1 = new Vector(2, 3);
		
		
		v1.add("Java");
		v1.add("Spring");
		v1.add("Hibernating");
		v1.add("Angular");
//		v1.add("Java");
//		System.out.println(v1.size());
//		System.out.println(v1.capacity());
		
		
		HashMap<Integer, String> h1 = new HashMap();
		h1.put(new Integer(1), 	"Rohit Sharma");
		h1.put(new Integer(2), 	"Rakesh Sharma");
		h1.put(new Integer(3), 	"Bhagat Sharma");
		h1.put(new Integer(2), 	"Bhagat Sharma");
		h1.put(new Integer(4), 	"Rohit Sharma");
		
		System.out.println(h1);
	}

}
