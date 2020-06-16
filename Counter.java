package kr.hs.dgsw.c1;

public class Counter 
{
	private static int count = 0;
	
	public static void increaseCount()
	{
		count++;
	}
	
	public static int getCount() 
	{
		return count;
	}
}
