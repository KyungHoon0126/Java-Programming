
// 재귀 함수는 자신의 함수 내부에서 자기 자신을 스스로 호출함으로써, 재귀적으로 문제를 해결하는 함수이다.

// 팩토리얼을 재귀 함수로 구현.

public class Recursive_Function {

	public static int factorial(int number)
	{
		if(number <= 0)
		{
			return 1;
		}
		else
		{
			return number * factorial(number - 1);	
		}
	}
	
	public static void main(String[] args) {

		System.out.println("10 팩토리얼은 " + factorial(10) + "입니다.");
		
	}

}
