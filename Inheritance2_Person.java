
public class Inheritance2_Person 
{
	private String name;
	private int age;
	private int height;
	private int weight;
	
	// get : 값을 가져오는 함수.
	// set : 값을 설정하는 함수
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public int getHeight() 
	{
		return height;
	}
	
	public void setHeight(int height) 
	{
		this.height = height;
	}
	
	public int getWeight() 
	{
		return weight;
	}
	
	public void setWeight(int weight) 
	{
		this.weight = weight;
	}
	
	public Inheritance2_Person(String name, int age, int height, int weight) 
	{
		super(); // super : 자신의 부모 클래스의 생성자를 실행.
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
}
