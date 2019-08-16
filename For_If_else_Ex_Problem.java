// for문을 이용하여 원을 출력하는 프로그램 작성.

public class For_If_else_Ex_Problem 
{

	final static int N = 15;

	public static void main(String[] args) 
	{

		//  x^2 + y^2 = r^2, 원의 방정식 활용
		for (int i = -N; i <= N; i++) 
		{
			for (int j = -N; j <= N; j++) 
			{
				if (i * i + j * j <= N * N) 
				{
					System.out.print("*");
				} 
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
