package kr.hs.dgsw.c1;

public class PeopleExecuter {
	
	public static void main(String[] args)
	{
		// new Ű���带 �̿��Ͽ� �ν��Ͻ��� ������ �Ӽ��� ������ �����ϴ�.
		People kyunghoon = new People();
		kyunghoon.name = "�����";
		kyunghoon.age = 18;
		kyunghoon.gender = "����";
		People.job = "�л�";
		
		People jinu = new People();
		jinu.name = "������";
		jinu.age = 18;
		jinu.gender = "����";
		// Ŭ���� ���� Ŭ���� �̸����� ���� ����
		People.job = "�л�";
		
		People soongwan = new People();
		soongwan.name = "�Ǽ���";
		soongwan.age = 18;
		soongwan.gender = "����";
		soongwan.job = "����";
		
		System.out.println(String.format("%s - %d - %s - %s", kyunghoon.name, kyunghoon.age, kyunghoon.gender, kyunghoon.job));
		System.out.println(String.format("%s - %d - %s - %s", jinu.name, jinu.age, jinu.gender, jinu.job));
		System.out.println(String.format("%s - %d - %s - %s", soongwan.name, soongwan.age, soongwan.gender, soongwan.job));
	}
}
