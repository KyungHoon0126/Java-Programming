
// ������ �迭 : �迭�� �迭�� ���ҷ� ���� ����, ���� ������ �迭�� M X N ������ ������ ��Ÿ������ �� �� ���� ���ȴ�.

// 10 X 10�� ���� ���� �����͸� �����Ͽ� ��ü �����͸� �м�.

public class Multidimensional_Array {

	public static void main(String[] args) {
		
		int N = 50;
		int[][] array = new int[N][N]; // 2���� �迭
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				array[i][j] = (int)(Math.random() * 10); // 0 ~ 9������ ������ ������
			}
		}
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				System.out.print(array[i][j] + " ");
			}
			
			System.out.println();
		}

	}

}
