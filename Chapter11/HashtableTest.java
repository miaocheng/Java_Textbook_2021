
import java.util.*;

public class HashtableTest	{
	public static void main(String [] args)	{
		Hashtable ht = new Hashtable();
		for (int i = 0; i < 100; i++)	{
			Integer r = (int) (Math.random() * 20);
			if (ht.containsKey(r))
				((Counter)ht.get(r)).i++;
			else
				ht.put(r, new Counter());
		}
		
		System.out.println(ht);
	}
}

class Counter	{
	int i = 1;
	public String toString()	{
		return Integer.toString(i);
	}

}


