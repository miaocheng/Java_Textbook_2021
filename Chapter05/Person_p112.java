
class Person_p112	{
	public void finalize()	{
		System.out.print(" the object is going !");
	}
	
	public static void main(String [] args)
	{
		new Person();
		new Person();
		new Person();
		
		System.gc();
		System.out.print(" the program is ending !");
	
	}

}

