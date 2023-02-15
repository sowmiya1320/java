package javabasic;

public class MaxMin {
	static void getMaxMin(int[] arr)
	{
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) 
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("max is:"+max);
		System.out.println("min is:"+min);
		
	}

	public static void main(String[] args) {
		int a[]= {44,45,56,42,89};
		
		
		getMaxMin(a);
		
		
	}

}
