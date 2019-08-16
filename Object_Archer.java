
// 객체를 비교하는 방법을 알아본다. 

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
	// 매개변수로 들어온 object라는 하나의 변수가 Archer라는 클래스의 인스턴스와 동일한지 보는것.
	{
		Object_Archer temp = (Object_Archer) obj; 
		// Object가 Archer의 더 부모클래스이기 때문에 obj라는 변수를 Archer 형태로 바꿀 수 있다.
		
		
		// obj가 temp라는 변수로 바뀌어서 Archer의 인스턴스가 되기때문에 name이라는 변수를 가지고 있다.
		// 즉, 매개변수로 들어온 obj가 name과 동일한지 물어보는 것.
		
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
