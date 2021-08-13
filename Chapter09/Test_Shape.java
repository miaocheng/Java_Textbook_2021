
abstract class Shape{
	protected double length = 0.0d;
	protected double width = 0.0d;
	
	Shape(double len, double w)	{
		length = len;
		width = w;
	}
	
	abstract double area();
}

class Rectangle extends Shape	{
	public Rectangle(double num, double num1)	{
		super(num, num1);
	}
	
	double area()	{
		System.out.print("长方形的面积为:");
		
		return length * width;
	}
}

class Circle extends Shape	{
	private double radius;
	
	public Circle(double num, double num1, double r)	{
		super(num, num1);
		radius = r;
	}
	
	double area()	{
		System.out.print("圆形位置在(" + length + ", " + width + ")的圆形面积为: ");
		return 3.14 * radius * radius;
	}

}	

public class Test_Shape	{
	public static void main(String args [])	{
		Rectangle rec = new Rectangle(15, 20);
		System.out.println(rec.area());
		Circle circle = new Circle(15, 15, 4);
		System.out.println(circle.area());
	}
}


