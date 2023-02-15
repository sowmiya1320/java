package javabasic;

class Stack {
	public int arr[];
	public int top;
	public int capacity;
	Stack(int size)
	{
		arr=new int[size];
		capacity=size;
		top=-1;
	}
	public void push(int x)
	{
		System.out.println("inserting :"+x);
		arr[++top]=x;
	}
	public int pop()
	{
		return arr[top--];
	}
	public int getSize()
	{
		return top=1;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==capacity-1;//top=size-1
	}
	public void PrintValue()
	{
		for(int i=0;i<top;i++)
		{
			System.out.print(arr[i]+",");
		}
	}

	public static void main(String[] args) {
		
		Stack stack=new Stack(5);
		stack.push(44);
		stack.push(45);
		stack.push(46);
		System.out.println("stacks are:");
		stack.PrintValue();
		
		stack.pop();
		System.out.println("After popping :");
		stack.PrintValue();
	}

}
