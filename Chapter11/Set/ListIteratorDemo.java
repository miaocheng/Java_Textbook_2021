
import java.util.*;

public class ListIteratorDemo	{
	public static void main(String [] args)	{
		List<String> all = new ArrayList<String> ();
		all.add("I ");
		all.add("say ");
		all.add("hello ");
		all.add("world ");
		
		ListIterator<String> iter = all.listIterator();
		System.out.println("========== 由前向后输出 ==========");
		
		while (iter.hasNext())
			System.out.print(iter.next() + "、");
			
		System.out.println("\n========== 由后向前输出 ==========");
		
		while (iter.hasPrevious())
			System.out.print(iter.previous() + "、");
		
		
	}
	
}


