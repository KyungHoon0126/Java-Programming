// 최종(Final) : 자바에서 절대 변하지 않는 특정한 것을 정하고 싶을 때 최종(Final)을 사용한다.
//            : 이 키워드는 변수, 메소드, 클래스에 모두 사용할 수 있다.	

public class Final_Main extends Final_Method
{
	// public void show() 
	
	// Final_Method에서 정의했던 show()라는 함수는 Main에서 상속받으면서 똑같은 이름으로  
	// 오버라이딩 해주었기 때문에 자식 클래스에서 정의된 show() 클래스가 실행되는 것이다.
	
	// {
	//		System.out.println("Hello");
	// }
	
	// 그런데 Fianl_Methoed 클래스에 final 키워드를 이용하면 재정의 되지 않는다.
	
	public static void main(String[] args) 
	{
		Final_Main main = new Final_Main();
		main.show();

	}

}
