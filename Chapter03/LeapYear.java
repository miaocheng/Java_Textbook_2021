
import java.util.*;

public class LeapYear	{
	public static void main(String args [])	{
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个年份: ");
		int year = input.nextInt();
		
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		System.out.println((isLeapYear ? (year + "是闰年! "): (year + "不是闰年!")));
	}
	
}


