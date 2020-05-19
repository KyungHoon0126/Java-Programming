package kr.hs.dgsw.c1.d0506.추상클래스_도형;

public class Rectangle extends Polygon {

	@Override
	public double getArea() {
		return height * width;
	}

	@Override
	public String getName() {
		return "사각형";
	}
}
