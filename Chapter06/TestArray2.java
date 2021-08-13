
public class TestArray2		{
	public static void main(String [] args)	{
		int [][] matrix = new int[10][10];
		int maxRow = 0, indexOfMaxRow = 0;
		
		for (int row = 0; row < matrix.length; row++)
		{
			for (int column = 0; column < matrix[row].length; column++)
			{
				matrix[row][column] = (int) (Math.random() * 100);
			}
		}
		
		for (int column = 0; column < matrix[0].length; column++)
		{
			int total = 0;
			for (int row = 0; row < matrix.length; row++)
				total += matrix[row][column];
				
			System.out.println(" ");
		}
		
		for (int column = 0; column < matrix[0].length; column++)
			maxRow += matrix[0][column];
		
		for (int row = 1; row < matrix.length; row++)
		{
			int totalOfThisRow = 0;
			
			for (int column = 0; column < matrix[row].length; column++)
				totalOfThisRow += matrix[row][column];
			
			if (totalOfThisRow > maxRow)	{
				maxRow = totalOfThisRow;
				indexOfMaxRow = row;
			}
		}
		
		System.out.println("行" + indexOfMaxRow + "元素之和最大，为: " + maxRow);
		for (int row = 0; row < matrix.length; row++)
		{
			for (int column = 0; column < matrix[row].length; column++)
				System.out.print(matrix[row][column] + " ");
			
			System.out.println(" ");
		
		}
		
	}
	
}


