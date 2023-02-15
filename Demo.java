package javabasic;

public class Demo {

	public static void main(String[] args) {
		System.out.println(sum(2,3,4,5,6));

	}
	public static int sum(int...numbers)
	{
		int total=0;
		for(int x:numbers)
		{
			total+=x;
		}
		return total;
	}

}
