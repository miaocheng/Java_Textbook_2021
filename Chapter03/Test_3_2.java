
import java.util.*;

public class Test_3_2	{
	public static void main(String args [])
	{
		char c = 'k';
		int i = 1, j = 2, k = 3;
		float x = (float) 3e+5, y = (float) 0.85;
		
		System.out.printf("%s, %s, ", !(x != 0) && !(y != 0), !!! (x != 0));
		System.out.printf("%s, %s, ", x != 0 || (i != 0) && (j - 3 != 0), i < j && x < y);
		System.out.printf("%s, %s\n", i == 5 && c != 0 && (j == 8), x+y != 0 || i+j+k != 0);
	}
	
}


