
// 반복 함수는 단순히 while 혹은 for 문법을 이용하여, 특정한 처리를 반복하는 방식으로 문제를 해결하는 함수. 

// 팩토리얼을 반복 함수로 구현.

public class Iterative_Function {

	// ex) 5! = 5 * 4 * 3 * 2 * 1 = 120
	
	public static int factorial(int number)
	{
		int sum = 1;
		
		for(int i = 2; i <= number; i++)
		{
			sum *= i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println("10 팩토리얼은 " + factorial(10) + "입니다.");
	}

}
