package kr.hs.dgsw.homework2;

import java.util.Scanner;

public class MoneyConverter {

	private static final double RATE = 1240;
	
	public static double scan() {
		
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}
	
	public double converter(double dollar) {
		return dollar * RATE;
	}
	
	public static void main(String[] args) {
		
		double dollar = 0;
		MoneyConverter moneyConverter = new MoneyConverter();
		
		System.out.println("변환할 달러의 금액을 입력해 주세요 : ");
		
		dollar = scan();
		
		System.out.println(String.format("%.2f -> %.2f.", dollar,  moneyConverter.converter(dollar)));
	}

}
