
//�������̽��� ���� ��ӿ� ���Ͽ� �н��Ѵ�.

// Interface�� extends�� ����ϴ°��� �ƴ�, Implements�� ����Ѵ�.

// Dog �� Cat�� �� �� ��ӹ޾Ƶ� ������ �߻����� �ʴ´�.

public class Dog_Cat_Multiple_Inheritance_Main implements Dog_Multiple_Inheritance, Cat_Multiple_Inheritance
{		
		public static void main(String[] args) 
		{
			Dog_Cat_Multiple_Inheritance_Main main = new Dog_Cat_Multiple_Inheritance_Main();
			main.crying();
			main.two();
			main.one();
		}

		@Override
		public void crying() 
		{
			System.out.println("��! ��!");
			
		}

		@Override
		public void two() 
		{
			System.out.println("Two!");
			
		}

		@Override
		public void one() 
		{
			System.out.println("One!");
			
		}

}
