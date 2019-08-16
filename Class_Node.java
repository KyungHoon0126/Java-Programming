
// Node : 하나의 좌표를 말한다.

public class Class_Node {
	
	private int x; 
	private int y;
	
	// private : Java 객체 지향 프로그래밍 : 보안 중시 → x, y를 외부에서 함부로 바꿀수 없도록 하기 위함.
	
	// x, y의 값을 가져오기 위해서 따로 함수들을 만들어 주어야 한다.
	// 즉, 외부에서 접근이 가능하다는 의미로 public을 사용한다.
	
	public int getX() // x의 값을 가져오는 함수.
	{
		return x;	
	}
	
	public void setX(int x) // x의 값을 설정하는 함수.
	{
		this.x = x; // this : 자신이 가지고 있는 고유 값을 바꾸기 위함.
	}
	
	public int getY() // y의 값을 가져오는 함수.
	{
		return y;
	}
	
	public void setY(int y) // y의 값을 설정하는 함수.
	{
		this.y = y;
	}
	
	public Class_Node(int x, int y) 
	{
		// 생성자 : 인스턴스(객체)를 만들어줄 때 자동으로 값들을 초기화해주는 함수.
		
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) 
	{
		// getCenter : 다른 Node를 매개변수로 받는다.
		// 다른 Node들을 비교해서, 자신이 가지고 있는 x, y 좌표와 다른 Node의 x, y 좌표를 비교해서 정중앙을 가지는 좌표를 반환해준다.
		
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}
}
