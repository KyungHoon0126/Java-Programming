
// max()를 이용하여 최대값을 저장하는 프로그램 작성.

public class User_Defined_Function_Ex_Problem2 {

	public static int max(int a, int b)
	{
		return (a > b) ? a : b;
	}
	
	public static int function(int a, int b, int c)
	{
		int result = max(a, b);
		result = max(result, c);
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("(345, 567, 789) 중에서 가장 큰 값은 " + function(345, 567, 789) + "입니다.");
		
	}

}
