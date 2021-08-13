
import java.util.Stack;

public class StackTest	{
	public static void main(String [] args)	{
		Stack stack = new Stack();
		String s1 = "element 1", s2 = "element 2";
		
		stack.push(s1);
		stack.push(s2);
		System.out.println(stack.peek());
		
		int pos = stack.search("element 1");
		
		System.out.println(pos);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
		
		Stack<Integer> stacki = new Stack<Integer> ();
		stacki.push(1111);
		stacki.push(2222);
		System.out.println(stacki.peek());
		System.out.println(stacki.search(1111));
	
	}
}


