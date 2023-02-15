package javabasic;
import java.util.Scanner;

public class DataDemo{
	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Value:");
		int number=sc.nextInt();
		int[] arr=new int[10];
		for(int i=0;i<number;i++)
		{
			arr[i]=sc.nextInt();
			System.out.println(((Object)number).getClass().getSimpleName());
		}
		
		
		sc.close();
		
	}

}
