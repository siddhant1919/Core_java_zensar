package com.collect;

import java.util.Objects;

public class Student  //implements Comparable<Student>
{
	private int roollNo;
	private String name;
	private int age;
	public Student(int roollNo, String name, int age) {
		super();
		this.roollNo = roollNo;
		this.name = name;
		this.age = age;
	}
	public int getRoollNo() {
		return roollNo;
	}
	public void setRoollNo(int roollNo) {
		this.roollNo = roollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Student [roollNo=" + roollNo + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name, roollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && roollNo == other.roollNo;
	}
	
	/*
	public int compareTo(Student s)
	{
		int val = 0;
		
		if(s.age == age)
		{
			val =0;
		}
		else if(s.age>age)
		{
			val = -1;
		}
		else
		{
			val = 1;
		}
		
		return val;
	}*/
	
}
