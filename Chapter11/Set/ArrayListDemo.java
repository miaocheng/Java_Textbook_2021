
import java.util.ArrayList;

public class ArrayListDemo	{
	public static void main(String [] args)	{
		ArrayList<String> list = new ArrayList<String> ();
		list.add("collection");
		list.add("list");
		list.add("ArrayList");
		list.add("LinkedList");
		
		for (String s: list)
			System.out.println(s);
			
		list.set(3, "ArrayList");
		
		for (int n = 0; n < list.size(); n++)
			System.out.println(list.get(n));
		
	}
	
}


