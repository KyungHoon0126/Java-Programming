
public class Object_Main {

	public static void main(String[] args) 
	{
		// Archer archer1 = new Archer("�ü�1", "��");
		// Archer archer2 = new Archer("�ü�2", "��");
				
		// System.out.println(archer1 == archer2);
				
		// archer1 �� archer2�� �ν��Ͻ��� ���� �ٸ��� ������ ���� ���� �ִ��� ����� false �̴�.
		
		
		
		Object_Archer archer1 = new Object_Archer("�ü�1", "��");
		Object_Archer archer2 = new Object_Archer("�ü�1", "��");

		System.out.println(archer1 == archer2); // false
		
		System.out.println(archer1.equals(archer2)); // true
		
		// �츮�� ������ ���ϴ� ��, �� �� �ν��Ͻ��� ���������� ������ ���� ������ ���� 
		// �������� ����� ��. �� �� ���� �����Ƿ� equals��� �Լ��� �̿��Ͽ� true�� ���´�.
		
		// ��, �� ���� �ν��Ͻ��� �����ϰ� ���������� ������ ���� �������� ����� ��.
	}

}
