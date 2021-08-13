
import java.util.*;

public class Test_3_1	{
	public static void main(String args [])		{
		char c = 'k';
		int i = 1, j = 2, k = 3;
		double x = 3e+5, y = 0.85;
		System.out.printf("%s, %s,", 'a' + 5 < c, -i - 2*j >= k + 1);
		System.out.printf("%s, %s,", 1 < j == j < 5, x - 5.25 <= x + y);
		System.out.printf("%s, %s\n", i + j + k == -2*j, k == j == false);
	}

}


