
import java.util.*;

public class LeapYear	{
	public static void main(String args [])	{
		Scanner input = new Scanner(System.in);
		System.out.print("������һ�����: ");
		int year = input.nextInt();
		
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		System.out.println((isLeapYear ? (year + "������! "): (year + "��������!")));
	}
	
}


