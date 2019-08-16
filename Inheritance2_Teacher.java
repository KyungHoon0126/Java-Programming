
public class Inheritance2_Teacher extends Inheritance2_Person
{
	private String teacherID;
	private int monthSalary; // 월급
	private int workedYear; // 연차(얼마나 일했는가)
	
	public String getTeacherID() 
	{
		return teacherID;
	}
	
	public void setTeacherID(String teacherID) 
	{
		this.teacherID = teacherID;
	}
	
	public int getMonthSalary() 
	{
		return monthSalary;
	}
	
	public void setMonthSalary(int monthSalary) 
	{
		this.monthSalary = monthSalary;
	}
	
	public int getWorkedYear() 
	{
		return workedYear;
	}
	
	public void setWorkedYear(int workedYear) 
	{
		this.workedYear = workedYear;
	}

	public Inheritance2_Teacher(String name, int age, int height, int weight, String teacherID, int monthSalary, int workedYear) 
	{
		super(name, age, height, weight);
		this.teacherID = teacherID;
		this.monthSalary = monthSalary;
		this.workedYear = workedYear;
	}
	
	public void show()
	{
		System.out.println("---------------------------");
		System.out.println("교사 이름 : " + getName());
		System.out.println("교사 나이 : " + getAge());
		System.out.println("교사 키 : " + getHeight());
		System.out.println("교사 몸무게 : " + getWeight());
		System.out.println("교직원 번호 : " + getTeacherID());
		System.out.println("교사 월급 : " + getMonthSalary());
		System.out.println("교사 연차 : " + getWorkedYear());
	}
	
}
