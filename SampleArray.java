package javabasic;
import java.util.Scanner;
public class SampleArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str1=sc.nextLine().toLowerCase();
		String str2="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2+=str1.charAt(i);
		}
			if(str1.equals(str2))
			{
				System.out.println("yes the string is palindrome");
			}
			else
			{
				System.out.println("not palindrome");
			}
		
		sc.close();
	}
}
