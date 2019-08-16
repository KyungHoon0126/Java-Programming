
public class Main 
{
	public static void main(String[] args) 
	{
		Hero[] heros = new Hero[4];
		
		// 다형성 이용
		heros[0] = new Warrior("전사");
		heros[1] = new Archer("궁수");
		heros[2] = new Wizard("마법사");
		heros[3] = new Soldier("군인");

		for(int i = 0; i < heros.length; i++)
		{			
			if(heros[i] instanceof Warrior)
			{
				// instanceof : 현재 지금 접근하고 있는 하나의 캐릭터가 만약에 전사라면 실행.
				// 				 : 즉 Warrior의 인스턴스인지 물어보는 것.
				
				System.out.println("전사 스킬 발동!\n");
				
				heros[i].Attack();
				
				Warrior temp = (Warrior) heros[i]; 
				// 현재 선택이 되어 있는 히어로, 즉 캐릭터를 전사 인스턴스로 형 변환을 
				// 해준 다음에 temp에 담기게 된다.
				
				temp.GroundCutting(); // Warrior의 인스턴스인 경우 스킬을 사용해라.
				
				System.out.println("\n---------------------------------------------\n");
			}
			
			else if(heros[i] instanceof Archer)
			{
				System.out.println("궁수 스킬 발동!\n");
				
				heros[i].Attack();
				
				Archer temp = (Archer) heros[i];
				temp.FireArrow();
				
				System.out.println("---------------------------------------------\n");
			}
			
			else if(heros[i] instanceof Wizard)
			{
				System.out.println("마법사 스킬 발동!\n");
				
				heros[i].Attack();
				
				Wizard temp = (Wizard) heros[i];
				temp.Freezing();
				
				System.out.println("\n---------------------------------------------\n");
			}
			
			else if(heros[i] instanceof Soldier)
			{
				System.out.println("군인 스킬 발동!\n");
				
				heros[i].Attack();
				
				Soldier temp = (Soldier) heros[i];
				temp.GrenadeThrowing();
				
				System.out.println("\n---------------------------------------------\n");
			}
		}
	}

}
