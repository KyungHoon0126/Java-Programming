package kr.hs.dgsw.homework1;

import java.util.Scanner;

public class Main {

		public static int scan()
		{
			Scanner sc = new Scanner(System.in);
			int money = sc.nextInt();
			return money;
		}
		
		public static int decomposition(int money)
		{
			Currency currency = new Currency();
			
			if(money / (currency.omanwon) != 0) {
				System.out.println(String.format("오만원 %d개", money / (currency.omanwon)));
				money -= money / (currency.omanwon) * currency.omanwon;
			}
			if(money / (currency.manwon) != 0) {
				System.out.println(String.format("만원 %d개", money / (currency.manwon)));
				money -= money / (currency.manwon) * currency.manwon;
			}
			if(money / (currency.ocheonwon) != 0) {
				System.out.println(String.format("오천원 %d개", money / (currency.ocheonwon)));
				money -= money / (currency.ocheonwon) * currency.ocheonwon;
			}
			if(money / (currency.cheonwon) != 0) {
				System.out.println(String.format("천원 %d개", money / (currency.cheonwon)));
				money -= money / (currency.cheonwon) * currency.cheonwon;
			}
			if(money / (currency.obaegwon) != 0) {
				System.out.println(String.format("오백원 %d개", money / (currency.obaegwon)));
				money -= money / (currency.obaegwon) * currency.obaegwon;
			}
			if(money / (currency.baegwon) != 0) {
				System.out.println(String.format("백원 %d개", money / (currency.baegwon)));
				money -= money / (currency.baegwon) * currency.baegwon;
			}
			if(money / (currency.osibwon) != 0) {
				System.out.println(String.format("오십원 %d개", money / (currency.osibwon)));
				money -= money / (currency.osibwon) * currency.osibwon;
			}
			if(money / (currency.sibwon) != 0) {
				System.out.println(String.format("십원 %d개", money / (currency.sibwon)));
				money -= money / (currency.sibwon) * currency.sibwon;
			}
			
			return 0;
		}
	
		public static void main(String[] args) {
			
			System.out.println("금액을 입력하여 주세요.");
			
			int money = scan();
			decomposition(money);
		}
}
