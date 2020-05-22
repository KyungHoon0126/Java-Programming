package kr.hs.dgsw.c1.d0506.추상클래스_산술연산;

// 추상 클래스
public abstract class Calculator {

	protected int value1;
	
	protected int value2;
	
	
	public void setOperand(int value1, int value2)
	{
		this.value1 = value1;
		this.value2 = value2;
	}
	
	// 몸체는 구성하지 않는 추상 메서드
	public abstract int calculate();
	
	public String print()
	{
		return String.format("결과 : %d %s %d = %d", value1, getOperator(), value2, calculate());
	}
	
	public abstract String getOperator();
	
	public static void main(String[] args) {
		
		Calculator adder = new Adder();
		Calculator subtractor = new Subtractor();
		Calculator multiplier = new Multiplier();
		
		adder.setOperand(5,  3);
		subtractor.setOperand(5, 3);
		multiplier.setOperand(5, 3);
		
		System.out.println(adder.print());
		System.out.println(subtractor.print());
		System.out.println(multiplier.print());
	}
}
