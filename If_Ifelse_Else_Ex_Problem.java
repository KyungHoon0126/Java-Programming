// 문자열과 정수형을 각각 조건문을 이용해 활용해보고 그 차이점을 공부.
public class Main {

	public static void main(String[] args) {
		
		String a = "Man";
		int b = 0;
	    
		// 자바는 String을 비교할 때 equal()을 이용한다.
		// 그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문이다.
		
		if(a.equals("Man")) {
			System.out.println("남자입니다.");
		} 
		else {
			System.out.println("남자가 아닙니다.");
		}
		
		if(b == 3) {
			System.out.println("b는 3입니다.");
		} 
		else {
			System.out.println("3이 아닙니다.");
		}
		
		if(a.equalsIgnoreCase("man") && b == 0) {
			 
			// equalsIgnoreCase : 대소문자를 무시하고 같은지를 판단
			System.out.println("참입니다.");
		}
		else {
			System.out.println("거짓입니다.");
		}
	}
 
}
