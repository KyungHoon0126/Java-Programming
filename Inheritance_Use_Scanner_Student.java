
public class Inheritance_Use_Scanner_Student extends Inheritance_Use_Scanner_Person
{
	private String studentID;
	private int grade;
	private double GPA; // GPA : �ܱ��� ���� ǥ��
	
	public String getStudentID() 
	{
		return studentID;
	}
	
	public void setStudentID(String studentID) 
	{
		this.studentID = studentID;
	}
	
	public int getGrade() 
	{
		return grade;
	}
	
	public void setGrade(int grade) 
	{
		this.grade = grade;
	}
	
	public double getGPA() 
	{
		return GPA;
	}
	
	public void setGPA(int gPA) 
	{
		GPA = gPA;
	}

	public Inheritance_Use_Scanner_Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) 
	{
		super(name, age, height, weight); // super : �ڽ��� �θ� ������ �ִ� �����ڸ� ����.
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}
	
	public void show()
	{
		System.out.println("-------------------------------------");
		System.out.println("�л� �̸� : " + getName());
		System.out.println("�л� ���� : " + getAge());
		System.out.println("�л� Ű : " + getHeight());
		System.out.println("�л� ������ : " + getWeight());
		System.out.println("�й� : " + getStudentID());
		System.out.println("�г� : " + getGrade());
		System.out.println("���� : " + getGPA());
	}
	
}
