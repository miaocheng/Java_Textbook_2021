
import java.util.*;

class Animal	{
	public void move()	{
		System.out.println("��������ƶ�");
	}
}

class Dog extends Animal	{
	public void move()	{
		super.move();
		System.out.println("�������ܺ���");
	}
	
}

public class TestDog_p187 {
	public static void main(String args [])	{
		Animal b = new Dog();
		b.move();
	}
}


