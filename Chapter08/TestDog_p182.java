

class Animal	{
	public void move()	{
		System.out.println("��������ƶ�");
	}
}

class Dog extends Animal	{
	public void move()	{
		System.out.println("�������ܺ���");
	}
	
	public void bark()	{
		System.out.println("�������Էͽ�");
	}
}

public class TestDog_p182	{
	public static void main(String [] args)
	{
		Animal a = new Animal();
		Animal b = new Dog();
		a.move();
		b.move();
		
		b.bark();
	}
	
}



