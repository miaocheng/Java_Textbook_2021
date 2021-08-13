
interface Animal	{
	public void eat();
	public void travel();
}

public class MammalInt implements Animal	{
	public void eat()	{
		System.out.print("Mammal eats.");
	}
	
	public void travel()	{
		System.out.print("Mammal travels.");
	}
	
	public int noOfLegs()	{
		return 0;
	}
	
	public static void main(String [] args)	{
		MammalInt m = new MammalInt();
		m.eat();
		m.travel();
	}	
}


