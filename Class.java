
// 클래스 : 객체 지향 프로그래밍에 있어서 가장 기본이 되는 것이다.

// 하나의 점(좌표, 위치)을 의미하는 Node 클래스를 생성할 수 있다.

public class Class {

	public static void main(String[] args) {
		
		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		
		Node result = one.getCenter(two);

		System.out.println("x : " + result.getX() + ", y : " + result.getY());
	}

}
