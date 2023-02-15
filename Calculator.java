package javabasic;

public class Calculator {
	static int addNumbers(int a,int b)
	{
		return a+b;
	}
	static int subNumbers(int a,int b)
	{
		return a-b;
	}
	static int mulNumbers(int a,int b)
	{
		return a*b;
	}
	static int divNumbers(int a,int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		System.out.println(addNumbers(2,2));
		System.out.println(subNumbers(2,2));
		System.out.println(mulNumbers(2,2));
		System.out.println(divNumbers(2,2));
		
		

	}

}
