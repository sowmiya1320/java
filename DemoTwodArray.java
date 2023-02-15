package javabasic;
import java.util.Scanner;

public class DemoTwodArray {

	public static void main(String[] args) {
		int m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the m rows: ");
		m=sc.nextInt();
		System.out.println("Enter the n column: ");
		n=sc.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter the elements:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("array elements are");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		
		sc.close();
		

	}

}
