
// 100���� ���� ������ ����� ���ϴ� ���α׷� �ۼ�.

public class Arrangement_Ex_Problem {

	public static void main(String[] args) {

		int[] array = new int[100];
		 
		// �迭 ũ��� 100, �� ���� �迭 �ε��� 0 ~ 99���� ���� ����.
		
		for(int i = 0; i <100; i++)
		{
			array[i] = (int) (Math.random() * 100 + 1);
			
			// Math.random() : 0���� �����ؼ� 1���� ���� ������ �������� ���� �����´�.
			// Math.random() * 100 �� ���ָ� 0���� ũ�� 100���� ���� ���� �����´�.
			// Math.random() * 100 + 1�� ���ָ�  1 <= x < 101 -�� (int) 1 ~ 100������ ������ �����´�.
		}
		
		int sum = 0;
		
		for(int i = 0; i < 100; i++)
		{
			sum += array[i];
		}
		System.out.println("100���� ���� ������ ��� ���� " + (sum / 100) + "�Դϴ�.");

	}

}
