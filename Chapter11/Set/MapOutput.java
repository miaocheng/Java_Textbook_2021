
import java.util.*;

public class MapOutput	{
	public static void main(String [] args)	{
		Map<String, String> all = new HashMap<String, String> ();
		all.put("BJ", "BeiJing");
		all.put("NJ", "NanJing");
		all.put(null, "NULL");
		
		Set<Map.Entry<String, String>> set = all.entrySet();
		Iterator <Map.Entry<String, String> > iter = set.iterator();
		
		while (iter.hasNext())	{
			Map.Entry<String, String> me = iter.next();
			System.out.println(me.getKey() + "-->" + me.getValue());
		
		}
	}

}

