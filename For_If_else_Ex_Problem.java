// for���� �̿��Ͽ� ���� ����ϴ� ���α׷� �ۼ�.

public class For_If_else_Ex_Problem 
{

	final static int N = 15;

	public static void main(String[] args) 
	{

		//  x^2 + y^2 = r^2, ���� ������ Ȱ��
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
