
import java.util.*;

public class Test_p69	{
	public static void main(String args [])		{
		char grade = args[0].charAt(0);
		
		switch(grade)
		{
			case 'A':
				System.out.print("Excellent !");
				break;
				
			case 'B':
			
			case 'C':
				System.out.print("Well done.");
				break;
				
			case 'D':
				System.out.print("You passed.");
				
			case 'F':
				System.out.print("Better try again.");
				break;
				
			default:
				System.out.print("Invalid grade.");
		}
		
		System.out.println("Your grade is " + grade);
	
	}
}

