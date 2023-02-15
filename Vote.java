package javabasic;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		System.out.println("your age is : "+age);
		boolean registration_for_vote=true;
		if(age>=18)
		{
			if(registration_for_vote==true)
			{
				System.out.println("Your are eligible to vote");
			}
			else
			{
				System.out.println("Your not eligible to vote");
			}
			
		}
		else
		{
			System.out.println("Your not eligible to vote");
		}
		
		
		scanner.close();
	}
	

}
