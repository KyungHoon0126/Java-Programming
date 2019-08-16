
// 피보나치 수열을 반복 함수로 구현

public class Iternative_Function_Ex_Problem {

	public static int fibonacci(int number)
	{
		int fibo1 = 1;
	    int	fibo2 = 1;
	    int result = -1;
	    
	    if(number == 1)
	    {
	    	return fibo1;
	    }
	    else if(number == 2)
	    {
	    	return fibo2;
	    }
	    else
	    {
	    	for(int i = 2; i < number; i++)
	    	{
	    		result = fibo1 + fibo2;
	    	    fibo1 = fibo2;
	    	    fibo2 = result;
	    	}
	    }
	    
	    return result;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci(10) + "입니다.");
	}
	
}
