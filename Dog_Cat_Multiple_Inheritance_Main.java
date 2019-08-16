
//인터페이스의 다중 상속에 대하여 학습한다.

// Interface는 extends를 사용하는것이 아닌, Implements를 사용한다.

// Dog 와 Cat을 둘 다 상속받아도 문제가 발생하지 않는다.

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
			System.out.println("월! 월!");
			
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
