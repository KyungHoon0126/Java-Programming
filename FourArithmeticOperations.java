package kr.hs.dgsw.c1;

import java.util.Scanner;

public class FourArithmeticOperations {
	
	// 1부터 100까지의 합산 결과
	public static int calculate(int start, int end)
	{
		int sum = 0;
		
		for(int i = start; i <= end; i++)
		{
			sum += i;
		}
		return sum;
	}
	
	
	public static int scan()
	{
		Scanner sc = new Scanner(System.in);
		int value =  sc.nextInt();
		
		// 자원 해제
		// sc.close();
		
		return value;
	}
	
	
	// +
	public static int sum(int num1, int num2)
	{
		return num1 + num2;
	}
	
	// -
	public static int subtract(int num1, int num2)
	{
		return num1 - num2;
	}
	
	// *
	public static int multiply(int num1, int num2)
	{
		return num1 * num2;
	}
	
	// /
	public static int divide(int num1, int num2)
	{
		return num1 / num2;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("두 숫자를 입력하세요.");
		
		int num1 = scan();
		int num2 = scan();
		
		// 아래의 것은 오브젝트이다. 오브젝트 생성
		// FourArithmeticOperations calc = new FourArithmeticOperations();
		
		System.out.println("덧셈 : " +  sum(num1, num2));
		System.out.println("뺄셈 : " + subtract(num1, num2));
		System.out.println("곱셈 : " + multiply(num1, num2));
		System.out.println("나눗셈 : " + divide(num1, num2));
	}

}
