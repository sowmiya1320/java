package javabasic;

import java.util.Scanner;

public class EvenOrOdd { //even or odd program without using if conditions

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number :");
		
		String[] str= {"even","odd"};
		
		int n=sc.nextInt();
		
		System.out.println(str[n%2]);
		
		sc.close();
		
		

	}

}
