
import java.util.*;

public class SeekDeleteAndInsert	{
	public static void main(String [] args)	{
		int a[] = new int[20], k, i, n, low, high, mid, point = -1;
		
		//java.util.Scanner input = new java.util.Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of data(< 20): ");
		n = input.nextInt();
		System.out.printf("Please enter %d order data:\n");
		
		for (i = 0; i < n; i++)
			a[i] = input.nextInt();
			
		System.out.print("Please enter the number to be located: ");
		k = input.nextInt();
		low = 0;
		high = n - 1;
		
		while (low <= high)
		{
			mid = (low + high) / 2;
			if (a[mid] == k)
			{
				point = mid;
				break;
			}
			else if (a[mid] < k)
				low = mid + 1;
			else
				high = mid - 1;
		}
		
		if (point >= 0)
		{
			System.out.printf("The index of data is: %d, Now delete it. \n");
			for (i = point; i < n; i++)
				a[i] = a[i+1];
				
			for (i = 0; i < n-1; i++)
				System.out.printf("%4d", a[i]);
				
			System.out.printf("\n");
		}
		else
		{
			System.out.printf("The data is not in the array ! Now insert. \n");
			i = n - 1;
			while (i >= 0 && a[i] > k)
			{
				a[i + 1] = a[i];
				i = i - 1;
			}
			
			a[++i] = k;
			for (i = 0; i <= n; i++)
				System.out.printf("%4d", a[i]);
				
			System.out.printf("\n");
			
		}
		
	}	

}

