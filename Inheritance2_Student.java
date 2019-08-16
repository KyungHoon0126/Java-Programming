
public class Inheritance2_Student extends Inheritance2_Person
{
	private String studentID;
	private int grade;
	private double GPA; // GPA : 외국식 학점 표현
	
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

	public Inheritance2_Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) 
	{
		super(name, age, height, weight); // super : 자신의 부모가 가지고 있는 생성자를 실행.
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}
	
	public void show()
	{
		System.out.println("-------------------------------------");
		System.out.println("학생 이름 : " + getName());
		System.out.println("학생 나이 : " + getAge());
		System.out.println("학생 키 : " + getHeight());
		System.out.println("학생 몸무게 : " + getWeight());
		System.out.println("학번 : " + getStudentID());
		System.out.println("학년 : " + getGrade());
		System.out.println("학점 : " + getGPA());
	}
	
}
