package kr.hs.dgsw.c1.d0609;

import java.util.Scanner;

public class MinusCalculator extends Calculator
{	
	@Override
	public void calculate(int value1, int value2)
	{
		int result = value1 - value2;
		System.out.printf("%d - %d = %d\n", value1, value2, result);
	}
	
	public static void main(String[] args) 
	{
		MinusCalculator calculator = new MinusCalculator();
		calculator.execute();
	}
}
