
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 기본 입출력 - 파일 입출력
// 파일에 차례로 입력된 모든 정수에 100을 곱해 출력하는 프로그램 작성.

public class Input_Output_Ex_Problem {

	public static void main(String[] args) {
		
		File file = new File("input.txt");
		
		try 
		{
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextInt()) // sc가 읽어오는 파일중에 정수가 있는지 물어보는 것.
			// 파일안에 정수가 있을시에만 실행되는 while 반복문
			{
				System.out.println(sc.nextInt() * 100);
				// 정수를 읽어온 다음에, 어떠한 정수를 읽는지에 상관없이 100을 곱하여 출력해준다.
			}
			sc.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
		}
			
	}

}

