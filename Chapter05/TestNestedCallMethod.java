
public class TestNestedCallMethod	{
	public static void main(String [] args)	{
		int i;
		long s = 0;
		for (i = 2; i <= 3; i++)
			s = s + fun1(i);
			
		System.out.printf("\ns=%d\n", s);
	}
	
	static long fun1(int p)	{
		int k;
		long r;
		k = p * p;
		r = fun2(k);
		
		return r;	
	}
	
	static long fun2(int q)
	{
		long c = 1;
		int i;
		for (i = 1; i <= q; i++)
			c = c * i;
			
		return c;	
	}

}

