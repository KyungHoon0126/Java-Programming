package kr.hs.dgsw.c1;

public class Book {
	
	/**
	 * 제목
	 */
	private String title;
	
	
	/**
	 * 지은이
	 */
	private String writer;
	
	
	/**
	 * 가격
	 */
	private int price;
	
	
	public Book() {
		this("무제");
	}
	
	public Book(String title) {
		this(title, "작자미상");
	}
	
	public Book(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}
	
	
	/**
	 * 메소드 오버로딩
	 */
	public void set() {
		set("무제");
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
		java.set("자바 실습");
		java.set("자바 실습", 15000);
		java.set(15000, "자바 실습");
	}
}
