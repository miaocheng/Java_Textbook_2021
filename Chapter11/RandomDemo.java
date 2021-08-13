

public class RanodmDemo		{
	public static void main(String [] args)	{
		java.util.Random random = new java.util.Random();
		System.out.println("Integer Max: " + Integer.MAX_VALUE);
		for (int i = 0; i < 10; i++)
			System.out.print(random.nextInt());
			
		System.out.println("\nInteger Min: " + Integer.MIN_VALUE);
	}

}

