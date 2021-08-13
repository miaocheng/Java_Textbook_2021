
public class VariableScope	{
	static int k = 0;
	public static void sum(int x)	{
		float s = 0.0f;
		
		try	{
			for (int i = 1; i <= x; i++)	{
				s += (float) x / i+k;
			}
		
			System.out.println("The sum is: " + s);
		}
		catch(Exception ex)	{
			System.out.println();
		}
	}
	
	public static void main(String [] args)	{
		sum(100);
	}

}


