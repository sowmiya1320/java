package javabasic;

public class ReverseArray {
	public static void getArray(int[] arr,int start,int end)
	{
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		
	}
	public static void Reversing(int size,int[] arr)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		getArray(a,0,9);//start=0,end=length-1
		System.out.println("reverse array:");
		Reversing(10,a);
		
		

	}

}
