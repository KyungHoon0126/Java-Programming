package kr.hs.dgsw.c1.anonymousclass;

public class Rabbit implements Sound 
{
	@Override
	public void sound() 
	{
		System.out.println("�䳢�����Ҹ�");	
	}
	
	public static void main(String[] args) 
	{
		Rabbit rabbit=new Rabbit();
		rabbit.sound();
	}
	
}