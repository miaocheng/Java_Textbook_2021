
import java.util.*;

public class Test_3_4	{
	public static void main(String args [])	{
		char c = 'A';
		
		if (c < 32)	
			System.out.print("This is a control character\n");
		else if (c >= '0' && c <= '9')
			System.out.print("This is a digit\n");
		else if (c >= 'A' && c <= 'Z')
			System.out.print("This is a capital letter\n");
		else if (c >= 'a' && c<= 'z')
			System.out.print("This is an other character\n");
		
	}
	
}

