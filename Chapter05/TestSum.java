
public class TestSum	{
	public static int sum(int i1, int i2)	{
		int sum = 0;
		
		for (int i = i1; i <= i2; i++)
			sum += i;
		
		System.out.println(i1 + "��" + i2 + "���ۼӺ���: " + sum);
		
		return sum;
	}
	
	public static void main(String [] args)	{
		int sumAll = 0;
		
		sumAll += sum(1, 1000);
		sumAll += sum(500, 1500);
		sumAll += sum(1000, 2000);
		
		System.out.println("1��1000��500��1500��1000��2000�����ۼӺ�֮�ܺ���:" + sumAll);
	}
	
}



