
public class HundredDollarHundredChicken	{
	public static void main(String args [])	{
		int x, y, z;
		for (x = 1; x <= 20; x ++)
		{
			for (y = 1; y <= 33; y++)
			{
				z = 100 - x - y;
				if (5 * x + 3 * y + z / 3 == 100 && z % 3 == 0)
					System.out.printf("\n¹«¼¦=%d, Ä¸¼¦=%d, Ð¡¼¦=%d", x, y, z);
			}
		}
	
	}
	
}


