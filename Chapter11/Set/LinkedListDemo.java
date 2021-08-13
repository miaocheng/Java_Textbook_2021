
import java.util.LinkedList;

public class LinkedListDemo	{
	public static void main(String [] args)	{
		LinkedList<String> queue = new LinkedList<String> ();
		queue.addFirst("Set");
		queue.addLast("HashSet");
		queue.addLast("TreeSet");
		queue.addLast("List");
		queue.addLast("ArrayList");
		queue.addLast("LinkedList");
		queue.addLast("map");
		queue.addFirst("collection");
		
		System.out.println(queue);
		queue.removeLast();
		queue.removeFirst();
		System.out.println(queue);
	}
	
}


