package kr.hs.dgsw.c1.d0506.�߻�Ŭ����_�������;

public class Multiplier extends Calculator {

	@Override
	public int calculate()
	{
		return value1 * value2;
	}
	
	@Override
	public String getOperator()
	{
		return "*";
	}
	
	public static void main(String[] args) {
		
		Multiplier multiplier = new Multiplier();
		multiplier.setOperand(5,  3);
		int result = multiplier.calculate();
		
		System.out.println(multiplier.print());
	}

}
