
// Interface 안에서는 설계만 가능하다.
// 추상 클래스는 미리 정의된 메소드들이 사용이 가능하지만, Interface에서는 불가능.

// 인터페이스를 선언하고 메소드를 다루어 본다.

public interface Dog_Interface
{
	abstract void crying(); 
	public void show();
	
	// Interface에서는 사용이 불가능하다.
	
	// public void show()
	// {
	//	 System.out.println("Hello World!");
	// }
	
}
