
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
		// name = "��̬����";
		// resultMethod();		
	}
	
	public static void anotherStaticMethod()	{
		System.out.println("�����ܱ����о�̬�ͷǾ�̬�������õľ�̬����");
		count++;	
	}
	
	public void resultMethod()	{
		anotherStaticMethod();
		System.out.println("�½��������Ϣ" + name);
		System.out.println("�½��������" + count);
	}
	
	public static void main(String args [])		{
		Test_AccessStatic t1 = new Test_AccessStatic("��һ������");
		t1.accessStaticMethod();
		Test_AccessStatic t2 = new Test_AccessStatic("�ڶ�������");
		t2.accessStaticMethod();		
	}

}


