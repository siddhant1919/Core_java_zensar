package Inheritance;

public abstract class Shape 
{
	protected String name;
	
	public Shape (String name)
	{
		this.name=name;
	}
	
	public void print()
	{
		System.out.println(name);
	}
	
	public abstract float calArea();
}



class Circle extends Shape
{
	protected float rad;
	
	public Circle(String name, float rad)
	{
		super(name);
		this.rad=rad;
	}
	
	
	public float calArea() 
	{
		return 3.14f*rad*rad;
	}
}



class Square extends Shape
{
	protected float side;
	
	public Square(String name, float side)
	{
		super(name);
		this.side=side;
	}
	
	public float calArea()
	{
		return side*side;
	}
}

class EntryClass
{
	public static void main(String args[])
	{
		Circle c = new Circle("Circle",10.10f);
		float area = c.calArea();
		System.out.println("area of circle "+area);
		
		Square s = new Square("Square",30.0f);
		area = s.calArea();
		System.out.println("area of square "+area);

		
	}
}












