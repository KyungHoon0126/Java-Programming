
public class Object_Main {

	public static void main(String[] args) 
	{
		// Archer archer1 = new Archer("궁수1", "상");
		// Archer archer2 = new Archer("궁수2", "중");
				
		// System.out.println(archer1 == archer2);
				
		// archer1 과 archer2의 인스턴스가 서로 다르기 때문에 값을 같게 주더라도 결과는 false 이다.
		
		
		
		Object_Archer archer1 = new Object_Archer("궁수1", "상");
		Object_Archer archer2 = new Object_Archer("궁수1", "상");

		System.out.println(archer1 == archer2); // false
		
		System.out.println(archer1.equals(archer2)); // true
		
		// 우리가 실제로 원하는 값, 즉 두 인스턴스가 내부적으로 가지는 내부 변수의 값이 
		// 같은지를 물어보는 것. 둘 다 값이 같으므로 equals라는 함수를 이용하여 true가 나온다.
		
		// 즉, 두 가지 인스턴스가 완전하게 내부적으로 가지는 값이 같은지를 물어보는 것.
	}

}
