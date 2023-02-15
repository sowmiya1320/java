package javabasic;
import java.util.Scanner;
import java.util.Stack;
public class Expression {
	public static boolean BalanceorNot(String exp)
	{
		Stack<Character> stack=new Stack<Character>();
		for(int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {     
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }           
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of exp : ");
		String exp=sc.nextLine();
		if(BalanceorNot(exp))
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("UnBalanced");
		}
		sc.close();

	}

}
