
// Interface�� extends�� ����ϴ°��� �ƴ�, Implements�� ����Ѵ�.

// �������̽��� �����ϰ� �޼ҵ带 �ٷ�� ����.

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
		System.out.println("��! ��!");
	}

	@Override
	public void show() 
	{
		System.out.println("Hello World!");
	}

}
