
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo	{
	public static void main(String [] args)	{
		Map<String, String> all = new TreeMap<String, String> ();
		all.put("BJ", "BeiJing");
		all.put("WX", "WuXi");
		all.put("NJ", "NanJing");
		
		String value = all.get("BJ");
		System.out.println(value);
		System.out.println(all.get("TJ"));
		System.out.println(all);
	}
}


