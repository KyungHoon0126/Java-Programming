
// ��ü�� ���ϴ� ����� �˾ƺ���. 

public class Object_Archer 
{
	String name;
	String power;
	
	public Object_Archer(String name, String power)
	{
		this.name = name;
		this.power = power;
	}
	
	public boolean equals(Object obj) 
	// �Ű������� ���� object��� �ϳ��� ������ Archer��� Ŭ������ �ν��Ͻ��� �������� ���°�.
	{
		Object_Archer temp = (Object_Archer) obj; 
		// Object�� Archer�� �� �θ�Ŭ�����̱� ������ obj��� ������ Archer ���·� �ٲ� �� �ִ�.
		
		
		// obj�� temp��� ������ �ٲ� Archer�� �ν��Ͻ��� �Ǳ⶧���� name�̶�� ������ ������ �ִ�.
		// ��, �Ű������� ���� obj�� name�� �������� ����� ��.
		
		if(name == temp.name && power == temp.power)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
