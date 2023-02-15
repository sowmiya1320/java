package javabasic;

public class BasicArray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},{5,6,7,8}};
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				System.out.print(a[row][col]);
			}
		System.out.println();
		}

	}

}
