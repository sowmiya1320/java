package javabasic;
import java.util.Scanner;
class DynamicArray
{
	private static final int IntializeCapacity=16;
	private int[] arr;
	private int size;
	private int capacity;
	private void ExpandSize()
	{
		capacity=capacity*2;
		arr=java.util.Arrays.copyOf(arr,capacity);
	}
	
	public DynamicArray()
	{
		size=0;
		arr=new int[IntializeCapacity];
		capacity=IntializeCapacity;
	}
	public void Add(int val)
	{
		if(capacity==size)
			ExpandSize();
		arr[size++]=val;
	}
	public void Display()
	{
		System.out.println("Elements in the list: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public void InsertOfPos(int val,int pos)
	{
		
		for(int i=size-1; i>=pos; i--)
		{
			arr[i+1]=arr[i];
			arr[pos]=val;
			size++;
		}
			
	}
	public void DeleteOfPos(int pos) 
	{
		for(int i=pos+1;i<size;i++)
		{
			arr[i-1]=arr[i];
			size--;
		}
	}
}

public class DemoListArray 
{

	public static void main(String[] args) 
	{
		DynamicArray list=new DynamicArray();
		int val,pos;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n================List Menu==============");
			System.out.println("1.Add the element in the list");
			System.out.println("2.Display the list");
			System.out.println("3.inserting the element in the list");
			System.out.println("4.Deleting the element in the list");
			System.out.println("5.Exit");
			System.out.println("\n=======================================");
			System.out.print("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter  the adding element :");
				val=sc.nextInt();
				list.Add(val);
				break;
			}
			case 2:
			{
				System.out.println("Displaying the adding element:");
				list.Display();
				break;
			}
			case 3:
			{
				pos=sc.nextInt();
				if(pos<0)
				{
					System.out.println("invalid input");
					break;
				}
				System.out.println("insert the element into list :");
				val=sc.nextInt();
				list.InsertOfPos(val,pos);
				
				break;
			}
			case 4:
			{
				pos=sc.nextInt();
				if(pos<0)
				{
					System.out.println("invalid input");
					break;
				}
				System.out.println("delete the element into list with specified position :");
				list.DeleteOfPos(pos);
				break;
			}
			case 5:
			{
				System.exit(0);
			}
			default:
			{
				System.out.println("Something wrong");
			}
				
				
				
			}
		
		}
		
		
		
	}

}
