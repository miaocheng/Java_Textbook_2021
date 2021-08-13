
public class Test_p76
{
	public static void main(String args [])	{
		int sum = 0, i = 1;
		
		while (i <= 1000)
		{
			System.out.println("value of i: " + i);
			sum = sum + i++;
		}
		
		System.out.println("1 + 2 + 3 + ... + 999 + 1000 = " + sum);
	}
	
}


