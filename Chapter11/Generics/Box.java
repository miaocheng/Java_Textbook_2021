

public class Box<T>		{
	private T t;
	public void add(T t)
	{
		this.t = t;
	}
	
	public T get()
	{
		return t;
	}
	
	public static void main(String [] args)	{
		Box<Integer> integerBox = new Box<Integer> ();
		Box<String> stringBox = new Box<String> ();
		integerBox.add(new Integer(10));
		integerBox.add(new Integer(100));
		stringBox.add(new String("Hello World"));
		stringBox.add(new String("How are you"));
		System.out.printf("ÕûÐÍÖµ %d\n", integerBox.get());
		System.out.printf("×Ö·û´® %s\n", stringBox.get());
		
	}

}


