package kr.hs.dgsw.c1;

public class PeopleExecuter {
	
	public static void main(String[] args)
	{
		// new 키워드를 이용하여 인스턴스를 만들어야 속성에 접근이 가능하다.
		People kyunghoon = new People();
		kyunghoon.name = "김경훈";
		kyunghoon.age = 18;
		kyunghoon.gender = "남자";
		People.job = "학생";
		
		People jinu = new People();
		jinu.name = "최진우";
		jinu.age = 18;
		jinu.gender = "남자";
		// 클래스 변수 클래스 이름으로 접근 가능
		People.job = "학생";
		
		People soongwan = new People();
		soongwan.name = "권순관";
		soongwan.age = 18;
		soongwan.gender = "남자";
		soongwan.job = "교사";
		
		System.out.println(String.format("%s - %d - %s - %s", kyunghoon.name, kyunghoon.age, kyunghoon.gender, kyunghoon.job));
		System.out.println(String.format("%s - %d - %s - %s", jinu.name, jinu.age, jinu.gender, jinu.job));
		System.out.println(String.format("%s - %d - %s - %s", soongwan.name, soongwan.age, soongwan.gender, soongwan.job));
	}
}
