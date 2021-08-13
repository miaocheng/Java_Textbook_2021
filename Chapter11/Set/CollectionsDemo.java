
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo	{
	public static void main(String [] args)	{
		List<String> all = new ArrayList<String> ();
		Collections.addAll(all, "take", "me", "away");
		System.out.println(all);
	}

}


