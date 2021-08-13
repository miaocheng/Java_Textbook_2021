
import java.util.*;

public class ComputeCircleAreaWithAnyRadius		{
	public static void main(String [] args)	{
		double radius, area;
		System.out.print("请输入圆的半径: ");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		
		if (radius < 0)
			System.out.println("输入错误： 半径不能为负的。");
		else
		{
			area = radius * radius * 3.14159;
			System.out.println("半径为： " + radius + "的圆的面积是: " + area);
		}
		
	}
}


