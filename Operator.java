
// �ʸ� �Է� �޾� �� �� �� ������ ����ϴ� ���α׷�

//public class Main {

//	final static int SECOND = 1000;

//	public static void main(String[] args) {

//		int minute = SECOND / 60;
//		int second = SECOND % 60;

//		System.out.println(minute + "��" + second + "��");

//	}

//}


// ++�� --����(���� ������)�� ������ �����ϰ� ���α׷� �ۼ�

//public class Main {

//	public static void main(String[] args) {

//		int a = 10;
//		System.out.println("������ a��" + a + "�Դϴ�.");
//		System.out.println("������ a��" + ++a + "�Դϴ�.");
//		System.out.println("������ a��" + a++ + "�Դϴ�.");
//		System.out.println("������ a��" + a + "�Դϴ�.");

//	}
//}


// %�������� ������ �����ϰ� ���α׷� �ۼ�

//public class Main {
//	
//	public static void main(String[] args) {
//		
//		System.out.println(1 % 3);
//		System.out.println(2 % 3);
//		System.out.println(3 % 3);
//		System.out.println(4 % 3);
//		System.out.println(5 % 3);
//		System.out.println(6 % 3);

//	}
//}


// ==, >, <, &&, ||, !������ ������ �ٸ��� �����ϰ� ���α׷� �ۼ�
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		int a = 50;
//		int b = 50;
//		
//		System.out.println("a�� b�� ��������? " + (a == b));
//		System.out.println("a�� b���� ū����? " + (a > b));
//		System.out.println("a�� b�� ��������? " + (a < b));
//		System.out.println("a�� b�� �����鼭 a�� 30���� ū����? " + ((a == b) && (a > b)));
//		System.out.println("a�� 50�� �ƴѰ���? " + !(a == 50));
//		
//	}
//}


// "���� ? �� : ����" ������ ����(���� ������)�� �����ϰ� ���α׷� �ۼ�
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		int x = 50;
//		int y = 60;
//		
//		System.out.println("�ִ��� " + max(x, y) + "�Դϴ�.");
//	}
//	
//	 ��ȯ��, �Լ� �̸�, �Ű� ����
//	static int max(int a, int b) {
//		int result = (a > b) ? a : b;
//		return result;
//	}
//}


// pow()�� �̿��� �ŵ����� ���� ���α׷��� �ۼ�

//public class Main {
//	
//	public static void main(String[] args) {
//		
//		double a = Math.pow(3.0, 20.0);
//		System.out.println("3�� 20������ " + (int) a + "�Դϴ�.");
//	}
//}