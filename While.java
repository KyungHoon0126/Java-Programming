// while을 이용하여 1부터 100.까지의 합을 출력하는 프로그램 작성.

public class While {

	public static void main(String[] args) {

		int i = 1, sum = 0;

		while (i <= 1000) 
		{
			sum += i++;
		}
		
		System.out.println("1부터 1000까지의 합은 " + sum + "입니다.");

	}

}
