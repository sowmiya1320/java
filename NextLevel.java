package javabasic;
import java.util.*;
public class NextLevel {

	public static void main(String[] args) {
		Stack stack1=new Stack();
		Stack<String> stack2=new Stack<String>();
		stack1.push(4);
		stack1.push("sowmiya");
		stack1.push("shruthi");
		stack2.push("namjoonkim");
		stack2.push("kimnamjoon");
		stack2.push("joonie");
		System.out.println(stack1);
		System.out.println(stack2);
		System.out.println("after popping "+stack2.pop());
		System.out.println(stack2);
		

	}

}
