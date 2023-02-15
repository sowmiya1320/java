package javabasic;
import java.util.Stack;

public class BalUnbal {
	public static boolean BeingBalance(String exp)
	{
		Stack<Character> stack=new Stack<Character>();
		{
			for(int i=0;i<exp.length();i++)
			{
				if(exp.charAt(i)=='('||exp.charAt(i)=='['||exp.charAt(i)=='{')
				{
					stack.push(exp.charAt(i));
				}
				if(exp.charAt(i)==')'||exp.charAt(i)==']'||exp.charAt(i)=='}')
				{
					if(stack.isEmpty())
					{
						return false;
					}
				}
				Character top=(char)stack.pop();
				if (top == '(' && exp.charAt(i) != ')' ||top == '{' && exp.charAt(i) != '}'||top == '[' && exp.charAt(i) != ']') 
				{
					return false;
				}
			}
		}
		return stack.isEmpty();
		
	}

	public static void main(String[] args) {
		String exp="{[()]}";
		if(BeingBalance(exp))
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("UnBalanced");
		}
	}

}
