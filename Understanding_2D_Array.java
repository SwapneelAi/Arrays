
public class Understanding_2D_Array{
	public static void main(String[] args){
		// 2D Array - Arrays of array. Represents a table with rows and column
		// Syntax
		int[][] matrix;
		
		// Memory allocation
		int[][] matrix_1 = new int[3][4];	// 3 - rows, 4 - column
		
		// Declarion and Initialization
		int[][] matrix_2 = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 4, 5, 2}
		};
		
		// Accessing elements
		System.out.println("matrix_2[row][column]: " + matrix_2[1][2]);		// 7
		
		// Modifying Elements
		matrix_2[2][3] = 100;
		System.out.println("Modified Element: " + matrix_2[2][3]);
		
		// length of rows and column
		int rows = matrix_2.length;
		int column = matrix_2[0].length;
		System.out.println("Length of row of 2D arrray: " + rows);
		System.out.println("Length of column of 2D arrray: " + column);


		// Print 2D array using for loop
		for(int i = 0; i < matrix_2.length; i++){			// rows
			for(int j = 0; j < matrix_2[i].length; j++){	// column
				System.out.print(matrix_2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// each row has a different number of columns
		// Each row is stored as a separate 1D array in memory.
		int[][] arr = {
			{1, 2},        // Row 0 → 2 elements
			{3, 4, 5},     // Row 1 → 3 elements
			{6}            // Row 2 → 1 element
		};
		
		System.out.println("Total Rows: " + arr.length);
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// This is an 2D array - row 0 column 0
		int[][] marks = {
			{3}
		};
	}

}