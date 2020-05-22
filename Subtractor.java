package kr.hs.dgsw.c1.d0506.추상클래스_산술연산;

public class Subtractor extends Calculator {
	
	@Override
	public int calculate()
	{
		return value1 - value2;
	}
	
	@Override
	public String getOperator()
	{
		return "-";
	}
	
	public static void main(String[] args) {
		
		Subtractor subtractor = new Subtractor();
		subtractor.setOperand(5,  3);
		int result = subtractor.calculate();
		
		System.out.println(subtractor.print());
	}
}
