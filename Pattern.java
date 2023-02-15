package javabasic;
import java.util.Scanner;


public class Pattern {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the row you want :");
		n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
		scanner.close();
	}

}
