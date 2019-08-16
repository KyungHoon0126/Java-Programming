
import java.util.Scanner;

// 배열 : 데이터가 많을 때 사용하는 것.

// 원하는 개수만큼의 배열 생성 및 최댓값을 구하는 프로그램 작성.

public class Arrangement {

	public static int max(int a, int b)
	{
		return (a > b) ? a : b;
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("생설할 배열의 크기를 입력하세요 : ");
		
		int number = scanner.nextInt();
		int[] array = new int[number];
		
		for(int i = 0; i < number; i++)
		{
			System.out.print("배열에 입력할 정수를 하나씩 입력해주세요 : ");
			array[i] = scanner.nextInt();
		}
		
		int result = -1;
		
		// 각 정수를 양수로 가정.
		
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);
		}

		System.out.println("입력한 모든 정수 중에서 가장 큰 값은 : " + result + " 입니다.");
	}

}
