package kr.hs.dgsw.c1;

import java.util.LinkedList;
import java.util.List;

public class Stack {

	private List<String> list = new LinkedList<String>();
	
	public void push(String value)
	{
		list.add(value);
	}
	
	public String pop()
	{
		String value = list.get(list.size() - 1);
		list.remove(list.size() - 1);		
		return value;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push("������");
		stack.push("���μ�");
		stack.push("������");
		
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	}
}
