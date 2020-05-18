package kr.hs.dgsw.c1;

public class Book {
	
	/**
	 * ����
	 */
	private String title;
	
	
	/**
	 * ������
	 */
	private String writer;
	
	
	/**
	 * ����
	 */
	private int price;
	
	
	public Book() {
		this("����");
	}
	
	public Book(String title) {
		this(title, "���ڹ̻�");
	}
	
	public Book(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}
	
	
	/**
	 * �޼ҵ� �����ε�
	 */
	public void set() {
		set("����");
	}
	
	public void set(String name) {
		set(name, 0);
	}
	
	public void set(String name, int price) {
		set(price, name);
	}
	
	public void set(int price, String name) {
		this.title = name;
		this.price = price;
	}
	
	/**
	 * getters and setters
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	
	public static void main(String[] args) {
		
		Book java = new Book();
		java.set();
		java.set("�ڹ� �ǽ�");
		java.set("�ڹ� �ǽ�", 15000);
		java.set(15000, "�ڹ� �ǽ�");
	}
}
