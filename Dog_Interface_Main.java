
// Interface는 extends를 사용하는것이 아닌, Implements를 사용한다.

// 인터페이스를 선언하고 메소드를 다루어 본다.

public class Dog_Interface_Main implements Dog_Interface
{
	public static void main(String[] args) 
	{
		Dog_Interface_Main main = new Dog_Interface_Main();
		main.crying();
		main.show();

	}

	@Override
	public void crying() 
	{
		System.out.println("월! 월!");
	}

	@Override
	public void show() 
	{
		System.out.println("Hello World!");
	}

}
