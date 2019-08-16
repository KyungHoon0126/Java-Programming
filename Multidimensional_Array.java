
// 다차원 배열 : 배열이 배열의 원소로 들어가는 구조, 흔히 이차원 배열은 M X N 형태의 지도를 나타내고자 할 때 많이 사용된다.

// 10 X 10의 정수 랜덤 데이터를 생성하여 전체 데이터를 분석.

public class Multidimensional_Array {

	public static void main(String[] args) {
		
		int N = 50;
		int[][] array = new int[N][N]; // 2차원 배열
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				array[i][j] = (int)(Math.random() * 10); // 0 ~ 9사이의 랜덤한 데이터
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
