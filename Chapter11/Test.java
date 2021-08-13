
import java.util.*;

public class Test	{
	public static void main(String [] args)	{
		Vector v = new Vector(4);
		v.add("element0");
		v.add("element1");
		v.add("element0");
		v.add("element2");
		v.add("element2");
		
		v.remove("element0");
		v.remove(0);
		
		int size = v.size();
		System.out.println("size: " + size);
		for (int i = 0; i < v.size(); i++)
			System.out.println(v.println(v.get(i)));
	}

}


