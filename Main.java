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
				System.out.println(String.format("������ %d��", money / (currency.omanwon)));
				money -= money / (currency.omanwon) * currency.omanwon;
			}
			if(money / (currency.manwon) != 0) {
				System.out.println(String.format("���� %d��", money / (currency.manwon)));
				money -= money / (currency.manwon) * currency.manwon;
			}
			if(money / (currency.ocheonwon) != 0) {
				System.out.println(String.format("��õ�� %d��", money / (currency.ocheonwon)));
				money -= money / (currency.ocheonwon) * currency.ocheonwon;
			}
			if(money / (currency.cheonwon) != 0) {
				System.out.println(String.format("õ�� %d��", money / (currency.cheonwon)));
				money -= money / (currency.cheonwon) * currency.cheonwon;
			}
			if(money / (currency.obaegwon) != 0) {
				System.out.println(String.format("����� %d��", money / (currency.obaegwon)));
				money -= money / (currency.obaegwon) * currency.obaegwon;
			}
			if(money / (currency.baegwon) != 0) {
				System.out.println(String.format("��� %d��", money / (currency.baegwon)));
				money -= money / (currency.baegwon) * currency.baegwon;
			}
			if(money / (currency.osibwon) != 0) {
				System.out.println(String.format("���ʿ� %d��", money / (currency.osibwon)));
				money -= money / (currency.osibwon) * currency.osibwon;
			}
			if(money / (currency.sibwon) != 0) {
				System.out.println(String.format("�ʿ� %d��", money / (currency.sibwon)));
				money -= money / (currency.sibwon) * currency.sibwon;
			}
			
			return 0;
		}
	
		public static void main(String[] args) {
			
			System.out.println("�ݾ��� �Է��Ͽ� �ּ���.");
			
			int money = scan();
			decomposition(money);
		}
}
