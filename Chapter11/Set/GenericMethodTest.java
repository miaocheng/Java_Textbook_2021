
public class GenericMethodTest	{
	public static <E> void printArray(E [] inputArray)	{
		for (E element: inputArray)
			System.out.printf("%s", element);
			
		System.out.println();
	}
	
	public static void main(String args [])	{
		Integer [] intArray = {1, 2, 3, 4, 5};
		Double [] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character [] charArray = {'H', 'E', 'L', 'L', 'O'};
		System.out.print("整型数组: ");
		printArray(intArray);
		System.out.print("双精度数数组: ");
		printArray(doubleArray);
		System.out.print("字符数组: ");
		printArray(charArray);
	}
	
	
}


