
import java.util.*;

public class ComputeCircleAreaWithAnyRadius		{
	public static void main(String [] args)	{
		double radius, area;
		System.out.print("������Բ�İ뾶: ");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		
		if (radius < 0)
			System.out.println("������� �뾶����Ϊ���ġ�");
		else
		{
			area = radius * radius * 3.14159;
			System.out.println("�뾶Ϊ�� " + radius + "��Բ�������: " + area);
		}
		
	}
}


