import java.util.Scanner;

public class Inheritance_Use_Scanner_Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("총 몇 명의 학생이 존재합니까 ? ");
		
		int number = scan.nextInt();
		
		Inheritance_Use_Scanner_Student[] students = new Inheritance_Use_Scanner_Student[number];
		
		for(int i = 0; i < number; i++)
		{
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			
			System.out.print("학생의 이름을 입력하세요 : ");
			name = scan.next(); // next() : 띄어쓰기가 포함되지 않은 문자열을 입력받을 수 있다.
			
			System.out.print("학생의 나이를 입력하세요 : ");
			age = scan.nextInt();
			
			System.out.print("학생의 키를 입력하세요 : ");
			height = scan.nextInt();
			
			System.out.print("학생의 몸무게를 입력하세요 : ");
			weight = scan.nextInt();
			
			System.out.print("학생의 학번을 입력하세요 : ");
			studentID = scan.next();
			
			System.out.print("학생의 학년을 입력하세요 : ");
			grade = scan.nextInt();
			
			System.out.print("학생의 학점을 입력하세요 : ");
			gPA = scan.nextDouble();
			
			students[i] = new Inheritance_Use_Scanner_Student(name, age, height, weight, studentID, grade, gPA);
		}
		
		for(int i = 0; i < number; i++)
		{
			students[i].show();
		}
	}

}
 