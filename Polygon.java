package kr.hs.dgsw.c1.d0506.�߻�Ŭ����_����;

public abstract class Polygon {

	protected double height;
	
	protected double width;
	
	protected double radius;
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public String getName()
	{
		return "�ٰ���";
	}
	
	public abstract double getArea();
	
	public void printArea()
	{
		System.out.println(String.format("%s�� ���� : %f", getName(), getArea()));
	}
	
	public static void main(String[] args) {
		
		Polygon triangle = new Triangle();
		triangle.setWidth(10);
		triangle.setHeight(8);
		triangle.printArea();
		
		Polygon rectangle = new Rectangle();
		rectangle.setWidth(10);
		rectangle.setHeight(8);
		rectangle.printArea();
		
		Polygon circle = new Circle();
		circle.setRadius(5);
		circle.printArea();
	}
}
