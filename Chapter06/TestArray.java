
public class TestArray	{
	public static void main(String [] args)		{
		int size = 5;
		double [] myList = new double[size];
		myList[0] = 5.6;
		myList[1] = 4.5;
		myList[2] = 3.3;
		myList[4] = 4.0;
		
		double total = 0;
		for (int i = 0; i < size; i++)
			total += myList[i];
			
		System.out.println("�ܺ�Ϊ: " + total);
	}

}


