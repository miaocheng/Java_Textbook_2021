
public class SeekArray	{
	public static void main(String [] args)
	{
		final int N = 20;
		int a[] = new int[N], i, j = -1, b;
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.printf("Input %d numbers: \n", N);
		for (i = 0; i <= N-1; i++)
			a[i] = input.nextInt();
			
		System.out.printf("\nInput other numbers:\n", N);
		b = input.nextInt();
		for (i = 0; i <= N-1; i++)
			if (a[i] == b)
			{
				j = i;
				break;			
			}
			
		if (j == -1)
			System.out.printf("������ֵΪ%d������û���ҵ���\n", b);
		
		else
			System.out.printf("ֵΪ%d�������������еĵ�%d��Ԫ�ء�\n", b, j+1);
			
	}

}


