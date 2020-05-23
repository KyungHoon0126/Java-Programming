package kr.hs.dgsw.c1.d0512;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person>, Printable {

	private int age;
	
	private String name;

	
	public Person(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Person o) {
		// return age - o.getAge();
		return name.compareTo(o.getName());
	}
	
	@Override
	public void print() {
		System.out.println(age + " " + name);
	}
	
	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person(23, "홍길동"));
		list.add(new Person(47, "이순신"));
		list.add(new Person(53, "Abraham Lincoln"));
		list.add(new Person(12, "Bently"));
		list.add(new Person(60, "문제인"));
		
		Person[] array = new Person[5];
		array[0] = new Person(23, "홍길동");
		array[1] = new Person(47, "이순신");
		array[2] = new Person(53, "Abraham Lincoln");
		array[3] = new Person(12, "Bently");
		array[4] = new Person(60, "문제인");
		
		list.sort(new Comparator <Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				return o1.compareTo(o2);
			}
		});
		
		for(Person person : list) {
			person.print();
		}
	}

}
