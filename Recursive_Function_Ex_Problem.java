
// 피보나치 수열을 재귀 함수로 구현.
// 코드는 간결하나, 수가 커질수록 연산 속도는 느려진다.

public class Recursive_Function_Ex_Problem {

	public static int fibonacci(int number)
	{
		if(number == 1)
		{
			return 1;
		}
		else if(number == 2)
		{
			return 1;
		}
		else
		{
			return fibonacci(number -1) + fibonacci(number - 2);
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci(50) + "입니다.");

	}

}
