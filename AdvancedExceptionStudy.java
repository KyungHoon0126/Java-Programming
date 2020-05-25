package kr.hs.dgsw.c1.d0519;

import java.io.FileNotFoundException;

public class AdvancedExceptionStudy 
{
	public void method1() throws MyException
	{
		MyException e = new MyException();
		throw e;
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			Exception e = new MyException();
			throw e;
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
}
