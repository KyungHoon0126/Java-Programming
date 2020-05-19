package kr.hs.dgsw.c1.d0506.추상클래스_도형;

public class Circle  extends Polygon {
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public String getName() {
		return "원";
	}
}
