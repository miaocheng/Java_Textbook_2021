
import java.util.*;

public class IteratorDemo	{
	public static void main(String [] args)	{
		List<String> all = new ArrayList<String> ();
		all.add("hello");
		all.add("world");
		Iterator<String> iter = all.iterator();
		while (iter.hasNext())
			System.out.print(iter.next() + ",");
	}

}


