

class ReferenceValue	{
	int x;
	public static void main(String [] args)	{
		ReferenceValue obj = new ReferenceValue();
		obj.x = 5;
		System.out.println("change��������ǰ�� x = " + obj.x);
		change(obj);
		System.out.print("; change�������ú�� x = " + obj.x);
	}
	
	public static void change(ReferenceValue obj)	{
		obj.x = 3;
	}
}


