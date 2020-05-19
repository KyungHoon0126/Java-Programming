package kr.hs.dgsw.c1.d0506.추상클래스_도형;

public class Triangle extends Polygon {

	@Override
	public double getArea() {
		return height * width / 2.0;
	}
	
	@Override
	public String getName() {
		return "삼각형";
	}
	
	@Override
	public void printArea() {
		System.out.println(String.format("%s 높이 : %.2f  밑변 : %.2f  면적 : %.2f", getName(), height, width, getArea()));
	}
}
