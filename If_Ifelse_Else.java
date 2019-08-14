// 점수에 따라서 다른 메시지를 출력하는 프로그램을 작성.

public class Main {

	public static void main(String[] args) {
		
		int score = 95;
		
		if(score >= 90) {
			System.out.println("A+입니다.");
		}
		else if(score >= 80) {
			System.out.println("B+입니다.");
		}
		else if(score >= 70) {
			System.out.println("C+입니다.");
		}
		else {
			System.out.println("D+입니다.");
		}

	}

}
