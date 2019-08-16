import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		// 부모클래스의 변수로서 자신의 자식클래스의 인스턴스를 넣어줄 수 있다.
		// Peach라는 자식 클래스의 인스턴스를 자기 자신의 변수 안으로 넣을 수 있다.
		
		// new 옆의 자식 클래스의 인스턴스의 이름만 바꾸어 주면 여러 가지를 나타낼 수 있다.
		
		System.out.println("원하시는 과일 번호를 입력해주세요.");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. 바나나, 2. 복숭아, 3. 수박 : ");
		
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
			System.out.println("원하시는 과일의 정보를 불러올 수 없습니다.");
		}
	}

}
