package kr.hs.dgsw.c1.d0519;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import kr.hs.dgsw.sub.Animal;
import kr.hs.dgsw.sub.Cat;
import kr.hs.dgsw.sub.Dog;

public class ExceptionStudy {

	public void exception1()
	{
		String a = null;
		a.stripLeading();
	}
	
	public void exception2()
	{
		try 
		{
			int a = 5 / 0;
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("ArithmeticException");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
	}
	
	public void exception3()
	{
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 1;
		a[2] = 1;
		// a[3] = 1;
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		list.get(2);
	}
	
	public void exception4()
	{
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		Cat cat1 = (Cat)cat;
		Cat dog1 = (Cat)dog;
	}
	
	public void exception5() throws FileNotFoundException, IOException
	{
		File file = new File("C:\\java_study\\hello1.txt");
		
		InputStream is = new FileInputStream(file);
		is.close();
	}
	
	public void exception6()
	{
		String str = "123A";
		int value = Integer.parseInt(str);
		
		System.out.println(value + 3);
	}
	
	public static void main(String[] args) 
	{
		ExceptionStudy study = new ExceptionStudy();
		
		study.exception2();
	}
}
