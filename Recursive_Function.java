
// ��� �Լ��� �ڽ��� �Լ� ���ο��� �ڱ� �ڽ��� ������ ȣ�������ν�, ��������� ������ �ذ��ϴ� �Լ��̴�.

// ���丮���� ��� �Լ��� ����.

public class Recursive_Function {

	public static int factorial(int number)
	{
		if(number <= 0)
		{
			return 1;
		}
		else
		{
			return number * factorial(number - 1);	
		}
	}
	
	public static void main(String[] args) {

		System.out.println("10 ���丮���� " + factorial(10) + "�Դϴ�.");
		
	}

}
