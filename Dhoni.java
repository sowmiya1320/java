package javabasic;
import java.util.Scanner;

public class Dhoni extends Criketers{
	public void printName()
	{
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Name :");
		name=sc.nextLine();
		System.out.print("Name of the cricketer :"+name);
		
		sc.close();
	}

}
