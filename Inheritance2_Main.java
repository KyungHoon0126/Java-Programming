
public class Inheritance2_Main {

	public static void main(String[] args) {
		
		Inheritance2_Student student1 = new Inheritance2_Student("홍길동", 20, 175, 70, "20190814", 1, 4.5);
		Inheritance2_Student student2 = new Inheritance2_Student("이순신", 30, 170, 80, "20190815", 4, 3.0);

		student1.show();
		student2.show();
		
		Inheritance2_Student[] students = new Inheritance2_Student[100];
		
		// 많은 양의 데이터를 처리할 때에는 배열을 만들어서 처리할 수 있다.
		
		for(int i = 0; i < 100; i++)
		{
			students[i] = new Inheritance2_Student("홍길동", 20, 175, 70, i + "", 1, 4.5);
			students[i].show();
		}
		
		// Teacher teacher1 = new Teacher("John Doe", 25, 180, 120, "ABC201", 3000000, 5);
		
		// teacher1.show();
	}

}
 