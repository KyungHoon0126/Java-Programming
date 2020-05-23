package kr.hs.dgsw.c1.d0512;

import java.util.Date;

public class Dog extends Date implements Printable, Countable {

	private int count = 0;
	
	@Override
	public void print() {
		System.out.println("개");
	}

	@Override
	public int count() {
		return count++;
	}
	
	public void eat()
	{
		System.out.println("고기를 먹어요");
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.print();
		dog.eat();
		dog.count();
		System.out.println(dog.count());
		
		Printable dog1 = new Dog();
		dog1.print();
		// dog1.eat(); 불가능
		
		Countable dog2 = new Dog();
		dog2.count();
		System.out.println(dog2.count());
	}

}
