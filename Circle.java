package kr.hs.dgsw.c1.d0506.�߻�Ŭ����_����;

public class Circle  extends Polygon {
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public String getName() {
		return "��";
	}
}
