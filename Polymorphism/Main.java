import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		// �θ�Ŭ������ �����μ� �ڽ��� �ڽ�Ŭ������ �ν��Ͻ��� �־��� �� �ִ�.
		// Peach��� �ڽ� Ŭ������ �ν��Ͻ��� �ڱ� �ڽ��� ���� ������ ���� �� �ִ�.
		
		// new ���� �ڽ� Ŭ������ �ν��Ͻ��� �̸��� �ٲپ� �ָ� ���� ������ ��Ÿ�� �� �ִ�.
		
		System.out.println("���Ͻô� ���� ��ȣ�� �Է����ּ���.");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. �ٳ���, 2. ������, 3. ���� : ");
		
		int input = scanner.nextInt();
		
		Fruit fruit;
		
		if(input == 1)
		{
			fruit = new Banana();
			fruit.show();
		}
		else if(input == 2)
		{
			fruit = new Peach();
			fruit.show();
		}
		else if(input == 3)
		{
			fruit = new WaterMelon();
			fruit.show();
		}
		else
		{
			System.out.println("���Ͻô� ������ ������ �ҷ��� �� �����ϴ�.");
		}
	}

}
