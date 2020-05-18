package kr.hs.dgsw.c1;

public class StackArray {

	private String[] array = new String[2];
	
	private int index = 0;
	
	public void push(String value)
	{
		array[index] = value;
		index++;
	}
	
	public String pop()
	{
		index--;
		return array[index];	
	}
	
	public static void main(String[] args) {
		StackArray stackArray = new StackArray();
		
		stackArray.push("Á¦Á¤¹Î");
		stackArray.push("°­¹Î¼®");
		stackArray.push("ÃÖÁø¿ì");
		
	    System.out.println(stackArray.pop());
	    System.out.println(stackArray.pop());
	    System.out.println(stackArray.pop());
	}
}
