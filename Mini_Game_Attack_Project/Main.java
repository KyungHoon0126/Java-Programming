
public class Main 
{
	public static void main(String[] args) 
	{
		Hero[] heros = new Hero[4];
		
		// ������ �̿�
		heros[0] = new Warrior("����");
		heros[1] = new Archer("�ü�");
		heros[2] = new Wizard("������");
		heros[3] = new Soldier("����");

		for(int i = 0; i < heros.length; i++)
		{			
			if(heros[i] instanceof Warrior)
			{
				// instanceof : ���� ���� �����ϰ� �ִ� �ϳ��� ĳ���Ͱ� ���࿡ ������ ����.
				// 				 : �� Warrior�� �ν��Ͻ����� ����� ��.
				
				System.out.println("���� ��ų �ߵ�!\n");
				
				heros[i].Attack();
				
				Warrior temp = (Warrior) heros[i]; 
				// ���� ������ �Ǿ� �ִ� �����, �� ĳ���͸� ���� �ν��Ͻ��� �� ��ȯ�� 
				// ���� ������ temp�� ���� �ȴ�.
				
				temp.GroundCutting(); // Warrior�� �ν��Ͻ��� ��� ��ų�� ����ض�.
				
				System.out.println("\n---------------------------------------------\n");
			}
			
			else if(heros[i] instanceof Archer)
			{
				System.out.println("�ü� ��ų �ߵ�!\n");
				
				heros[i].Attack();
				
				Archer temp = (Archer) heros[i];
				temp.FireArrow();
				
				System.out.println("---------------------------------------------\n");
			}
			
			else if(heros[i] instanceof Wizard)
			{
				System.out.println("������ ��ų �ߵ�!\n");
				
				heros[i].Attack();
				
				Wizard temp = (Wizard) heros[i];
				temp.Freezing();
				
				System.out.println("\n---------------------------------------------\n");
			}
			
			else if(heros[i] instanceof Soldier)
			{
				System.out.println("���� ��ų �ߵ�!\n");
				
				heros[i].Attack();
				
				Soldier temp = (Soldier) heros[i];
				temp.GrenadeThrowing();
				
				System.out.println("\n---------------------------------------------\n");
			}
		}
	}

}
