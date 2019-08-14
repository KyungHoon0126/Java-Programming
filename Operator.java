
// 초를 입력 받아 몇 분 몇 초인지 계산하는 프로그램

//public class Main {

//	final static int SECOND = 1000;

//	public static void main(String[] args) {

//		int minute = SECOND / 60;
//		int second = SECOND % 60;

//		System.out.println(minute + "분" + second + "초");

//	}

//}


// ++와 --연산(증감 연산자)의 개념을 이해하고 프로그램 작성

//public class Main {

//	public static void main(String[] args) {

//		int a = 10;
//		System.out.println("현재의 a는" + a + "입니다.");
//		System.out.println("현재의 a는" + ++a + "입니다.");
//		System.out.println("현재의 a는" + a++ + "입니다.");
//		System.out.println("현재의 a는" + a + "입니다.");

//	}
//}


// %연산자의 사용법을 숙지하고 프로그램 작성

//public class Main {
//	
//	public static void main(String[] args) {
//		
//		System.out.println(1 % 3);
//		System.out.println(2 % 3);
//		System.out.println(3 % 3);
//		System.out.println(4 % 3);
//		System.out.println(5 % 3);
//		System.out.println(6 % 3);

//	}
//}


// ==, >, <, &&, ||, !연산의 개념을 바르게 이해하고 프로그램 작성
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		int a = 50;
//		int b = 50;
//		
//		System.out.println("a와 b가 같은가요? " + (a == b));
//		System.out.println("a는 b보다 큰가요? " + (a > b));
//		System.out.println("a와 b가 작은가요? " + (a < b));
//		System.out.println("a가 b와 같으면서 a가 30보다 큰가요? " + ((a == b) && (a > b)));
//		System.out.println("a가 50이 아닌가요? " + !(a == 50));
//		
//	}
//}


// "조건 ? 참 : 거짓" 연산의 형태(삼항 연산자)를 숙지하고 프로그램 작성
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		int x = 50;
//		int y = 60;
//		
//		System.out.println("최댓값은 " + max(x, y) + "입니다.");
//	}
//	
//	 반환형, 함수 이름, 매개 변수
//	static int max(int a, int b) {
//		int result = (a > b) ? a : b;
//		return result;
//	}
//}


// pow()를 이용한 거듭제곱 연산 프로그램을 작성

//public class Main {
//	
//	public static void main(String[] args) {
//		
//		double a = Math.pow(3.0, 20.0);
//		System.out.println("3의 20제곱은 " + (int) a + "입니다.");
//	}
//}