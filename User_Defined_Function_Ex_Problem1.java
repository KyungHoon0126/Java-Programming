
// ���ڿ����� ������ �ܾ ��ȯ�ϴ� �Լ��� �ۼ�

public class User_Defined_Function_Ex_Problem1 {

	public static char function(String input)
	{
		return input.charAt(input.length() -1);
		
		// charAt : Ư���� �ܾ 0���� ����ؼ� �ϳ��� ���� �� �� �ְ� ���ش�. 
		//        : ��, �� ��° ���ڿ��� �ϳ� �̾ƿ��� �Լ�.
		
		// input.length : length�� 1���� �����ؼ� �ش� ���ڿ��� ���̸� �����ش�.
		
		// charAt�� Hello World�� H = 0��° ~ d : 10��°�� �ν�.
		// length�� Hello World�� 1���� �����ؼ� �� 11���� �ν�.
		
		// input.length() - 1 : ���ڿ��� ���̿��� -1, �� 11���� 1�� �� �� 10�� ��ȯ
		//                    : ���� �������� ��ġ�� char ���ڸ� �����´�.
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello World�� ������ �ܾ�� " + function("Hello World"));
		
	}

}
