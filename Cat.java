package kr.hs.dgsw.c1.d0512;

public class Cat implements Printable {

	@Override
	public void print() {
		System.out.println("¾ß¿Ë");
	}

	public static void main(String[] args) {
		
		Printable printable1 = new Cat();
		Printable printable2 = new Dog();
		
		printable1.print();
		printable2.print();
	}
}
