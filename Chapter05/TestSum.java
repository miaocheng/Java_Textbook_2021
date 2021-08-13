
public class TestSum	{
	public static int sum(int i1, int i2)	{
		int sum = 0;
		
		for (int i = i1; i <= i2; i++)
			sum += i;
		
		System.out.println(i1 + "到" + i2 + "的累加和是: " + sum);
		
		return sum;
	}
	
	public static void main(String [] args)	{
		int sumAll = 0;
		
		sumAll += sum(1, 1000);
		sumAll += sum(500, 1500);
		sumAll += sum(1000, 2000);
		
		System.out.println("1到1000、500到1500、1000到2000各自累加和之总和是:" + sumAll);
	}
	
}



