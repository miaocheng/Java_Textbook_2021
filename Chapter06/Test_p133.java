
public class Test	{
	public static void main(String [] args)	{
		int [] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int x = 1;
		System.out.print("x is " + x + "; a[10] is ");
		
		for (int z:a)
			System.out.print(z + " ");
			
		System.out.println(" ");
		ischange(x, a);
		
		System.out.print("x is " + x + "; a[10] is ");
		
		for (int z:a)
			System.out.print(z + " ");
	}
	
	public static void ischange(int y, int [] b)
	{
		y = 999;
		for (int z = 0; z < b.length; z++)
			b[z] += 100;
	}

}

