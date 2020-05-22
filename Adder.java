package kr.hs.dgsw.c1.d0506.�߻�Ŭ����_�������;

// Ŭ���� final ���� : ��� �Ұ�
public class Adder extends Calculator {
	
	@Override
	public int calculate()
	{
		return value1 + value2;
	}
	
	@Override
	public String getOperator()
	{
		return "+";
	}
	
	public static void main(String[] args) {
		
		Adder adder = new Adder();
		adder.setOperand(5,  3);
		int result = adder.calculate();
		
		System.out.println(adder.print());
	}
}
