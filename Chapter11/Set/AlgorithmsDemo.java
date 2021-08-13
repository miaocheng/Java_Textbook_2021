
import java.util.*;

public class AlgorithmsDemo  {
    public static void main(String args []) {
        LinkedList ll = new LinkedList();
        ll.add(new Integer(-8));
        ll.add(new Integer(20));
        ll.add(new Integer(- 20));
        ll.add(new Integer(8));
        
        Comparator r = Collections.reverseOrder();
        Collections.sort(ll, r);
        Iterator li = ll.iterator();
        System.out.print("List sorted in reverse: ");

        while (li.hasNext())
            System.out.print(li.next() + " ");

        Collections.shuffle(ll);
        li = ll.iterator();
        System.out.print(", List shuffled: ");
        while (li.hasNext())
            System.out.print(li.next() + " ");

        System.out.print("\nMinimum: " + Collections.min(ll));
        System.out.println(", Maximum: " + Collections.max(ll));
    }

}


