package javabasic;
import java.util.Scanner;

public class NewPattern {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row n :");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;n>=i;j--)
			{
				System.out.println("*");
			}
		System.out.println();
		}
		sc.close();

	}

}
