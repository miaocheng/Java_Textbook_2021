
import java.util.TreeSet;

public class TreeSetDemo	{
	public static void main(String [] args)	{
		boolean r;
		TreeSet<String> s = new TreeSet<String> ();
		r = s.add("Hello");
		System.out.println("��ӵ���Hello, ����Ϊ" + r);
		r = s.add("Kitty");
		System.out.println("��ӵ���Kitty, ����Ϊ" + r);
		r = s.add("Hello");
		System.out.println("��ӵ���Hello, ����Ϊ" + r);
		r = s.add("Java");
		System.out.println("��ӵ���Java, ����Ϊ" + r);
		
		for (String element: s)
			System.out.println(element);
	}

}


