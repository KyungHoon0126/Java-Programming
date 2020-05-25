package kr.hs.dgsw.c1.d0519;

import java.util.Scanner;

public class TryCatchStudy 
{
	public String method1()
	{	
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			String str = "Hello";
			
			//int a = 5 / 0;
			
			return str;
		}
		catch (Exception e)
		{
			System.out.println("예외 발생");
		}
		// 예외가 발생해도 호출 됨.
		finally 
		{
			scanner.close();
			System.out.println("done");
		}
		
		return null;
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			TryCatchStudy study = new TryCatchStudy();
			study.method1();
		} 
		catch (Exception e) 
		{
			 System.out.println("바깥");
			e.printStackTrace();
		}
	}
	
	
	
}
