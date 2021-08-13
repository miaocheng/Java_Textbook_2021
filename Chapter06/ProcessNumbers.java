
import java.util.Scanner;

public class ProcessNumbers	{
	final int NUMBER_OF_ELEMENTS = 100;
	
	public static void main(String args [])	{
		double [] numbers = new double[NUMBER_OF_ELEMENTS], sum = 0;
		Scanner input = new java.util.Scanner(System.in);
		
		for (int i = 0; i < NUMBER_OF_ELEMENTS; i++)
		{
			System.out.print("请输入一个新数: ");
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
	}
	
	double average = sum / NUMBER_OF_ELEMENTS;
	int count = 0;
	for (int i = 0; i < NUMBER_OF_ELEMENTS; i++)
		if (numbers[i] < average)
			count++;
			
	System.out.println(NUMBER_OF_ELEMENTS + "个数的平均值: " + average);
	System.out.println("小于平均值的数有: " + count + "个");
	
}




