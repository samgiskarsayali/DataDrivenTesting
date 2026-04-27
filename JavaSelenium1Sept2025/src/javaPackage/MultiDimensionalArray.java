package javaPackage;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		          

		System.out.println(a[1][1]);
		System.out.println(a[2][0]);

		// Total no. of rows
		int row = a.length;
		System.out.println("Total no of rows are " + row);

		// Total no. of columns
		int column = a[0].length;
		System.out.println("Total no of column are " + column);

	}

}
