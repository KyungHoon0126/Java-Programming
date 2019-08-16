
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// �⺻ ����� - ���� �����
// ���Ͽ� ���ʷ� �Էµ� ��� ������ 100�� ���� ����ϴ� ���α׷� �ۼ�.

public class Input_Output_Ex_Problem {

	public static void main(String[] args) {
		
		File file = new File("input.txt");
		
		try 
		{
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextInt()) // sc�� �о���� �����߿� ������ �ִ��� ����� ��.
			// ���Ͼȿ� ������ �����ÿ��� ����Ǵ� while �ݺ���
			{
				System.out.println(sc.nextInt() * 100);
				// ������ �о�� ������, ��� ������ �д����� ������� 100�� ���Ͽ� ������ش�.
			}
			sc.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("������ �о���� ���߿� ������ �߻��߽��ϴ�.");
		}
			
	}

}

