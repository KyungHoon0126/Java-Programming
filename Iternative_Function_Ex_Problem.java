
// �Ǻ���ġ ������ �ݺ� �Լ��� ����

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
		System.out.println("�Ǻ���ġ ������ 10��° ���Ҵ� " + fibonacci(10) + "�Դϴ�.");
	}
	
}
