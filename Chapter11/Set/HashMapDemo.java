
import java.util.HashMap;
import java.util.Map;


public class HashMapDemo	{
	public static void main(String [] args)	{
		Map<String, String> all = new HashMap<String, String> ();
		all.put("BJ", "BeiJing");
		all.put("NJ", "NanJing");
		String value = all.get("BJ");
		System.out.println(value);
		System.out.println(all.get("TJ"));
		System.out.println(all);
	}

}


