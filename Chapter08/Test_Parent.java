
class Parent	{
	public void function()	{
		System.out.println("I am in Parent Class !");
	}
}

class Child extends Parent{
	public void function()	{
		System.out.println("I am in Child Class !");
	}
}

public class Test_Parent	{
	public static void main(String args [])	{
		Parent p1 = new Parent();
		Parent p2 = new Child();
		p1.function();
		p2.function();
	}

}

