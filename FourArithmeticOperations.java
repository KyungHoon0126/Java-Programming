package kr.hs.dgsw.c1;

import java.util.Scanner;

public class FourArithmeticOperations {
	
	// 1���� 100������ �ջ� ���
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
		
		// �ڿ� ����
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
		
		System.out.println("�� ���ڸ� �Է��ϼ���.");
		
		int num1 = scan();
		int num2 = scan();
		
		// �Ʒ��� ���� ������Ʈ�̴�. ������Ʈ ����
		// FourArithmeticOperations calc = new FourArithmeticOperations();
		
		System.out.println("���� : " +  sum(num1, num2));
		System.out.println("���� : " + subtract(num1, num2));
		System.out.println("���� : " + multiply(num1, num2));
		System.out.println("������ : " + divide(num1, num2));
	}

}
