
class Test_AccessStatic	{
	private static int count;
	private String name;
	
	public Test_AccessStatic(String Name)	{
		name = Name;
		count++;		
	}
	
	public static void accessStaticMethod()	{
		int i = 0;
		count++;
		anotherStaticMethod();
		// name = "静态对象";
		// resultMethod();		
	}
	
	public static void anotherStaticMethod()	{
		System.out.println("测试能被类中静态和非静态方法调用的静态方法");
		count++;	
	}
	
	public void resultMethod()	{
		anotherStaticMethod();
		System.out.println("新建对象的信息" + name);
		System.out.println("新建对象个数" + count);
	}
	
	public static void main(String args [])		{
		Test_AccessStatic t1 = new Test_AccessStatic("第一个对象");
		t1.accessStaticMethod();
		Test_AccessStatic t2 = new Test_AccessStatic("第二个对象");
		t2.accessStaticMethod();		
	}

}


