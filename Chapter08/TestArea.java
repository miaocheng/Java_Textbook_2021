

class Area	{
	
	float getArea(float r)
	{	return 3.14 * r * r;	}
	double getArea(float x, int y)
	{	return x * y;	}
	float getArea(int x, float Y)
	{	return x * y;	}
	double getArea(float x, float y, float z)
	{	return (x * x + y * y + z * z) * 2.0;	}
	
}


public class TestArea	{
	public static void main(String args [])	{
		Area a = new Area();
		System.out.println("����getAreaЯ��һ�������Ľ��: " + a.getArea(5.0f));
		System.out.println("����getAreaЯ�������������ҷ���ֵΪdouble���͵Ľ���� " + a.getArea(5.0f, 12));
		System.out.println("����getAreaЯ�������������ҷ���ֵΪfloat���͵Ľ��: " + a.getArea(5, 12f));
		System.out.println("����getAreaЯ�����������Ľṹ: " + a.getArea(13f, 4.0f, 5.0f));
	}
	
}


