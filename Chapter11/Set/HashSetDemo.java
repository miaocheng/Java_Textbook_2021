
import java.util.HashSet;


public class HashSetDemo    {
    public static void main(String [] args) {
        boolean r;
        HashSet<String> s = new HashSet<String>();
        r = s.add("Hello");
        System.out.println("��ӵ���Hello, ����Ϊ" + r);
        r = s.add("Kitty");
        System.out.println("��ӵ���Kitty, ����Ϊ" + r);
        r = s.add("Hello");
        System.out.println("��ӵ���Hello, ����Ϊ" + r);
        r = s.add("Java");
        System.out.println("��ӵ���Java, ����Ϊ" + r);
		
        for (String elemnet: s)
            System.out.println(element);
    }

}


