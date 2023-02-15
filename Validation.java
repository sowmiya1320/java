package javabasic;
import java.util.Scanner;
public class Validation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int age;
		name=sc.next();
		age=sc.nextInt();
		
		System.out.println("CHECKING ELIGLIBLITY FOR VOTING ");
		System.out.print("---------------------------------\n");
		System.out.println("1.Enter your Name : "+name);
		System.out.println("2.Enter Your Age : "+age);
		System.out.print("\n---------------------------------");
		sc.close();

	}

}
