
// 100개의 랜덤 정수의 평균을 구하는 프로그램 작성.

public class Arrangement_Ex_Problem {

	public static void main(String[] args) {

		int[] array = new int[100];
		 
		// 배열 크기는 100, 값 들은 배열 인덱스 0 ~ 99까지 값이 들어간다.
		
		for(int i = 0; i <100; i++)
		{
			array[i] = (int) (Math.random() * 100 + 1);
			
			// Math.random() : 0부터 시작해서 1보다 작은 수까지 랜덤으로 수를 가져온다.
			// Math.random() * 100 을 해주면 0보다 크고 100보다 작은 수를 가져온다.
			// Math.random() * 100 + 1을 해주면  1 <= x < 101 -→ (int) 1 ~ 100까지의 정수를 가져온다.
		}
		
		int sum = 0;
		
		for(int i = 0; i < 100; i++)
		{
			sum += array[i];
		}
		System.out.println("100개의 랜덤 정수의 평균 값은 " + (sum / 100) + "입니다.");

	}

}
