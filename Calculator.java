package kr.hs.dgsw.c1.d0609;

import java.util.Scanner;

public abstract class Calculator 
{
	public abstract void calculate(int value1, int value2);
	
	public void execute()
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("두 수를 입력하세요.");
			
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();
			
			if(value1 == 0 && value2 == 0)
			{
				break;
			}
			
			calculate(value1, value2);
		}
		
		scanner.close();
		System.out.println("프로그램을 종료합니다.");
	}
}
