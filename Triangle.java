package kr.hs.dgsw.c1.d0506.�߻�Ŭ����_����;

public class Triangle extends Polygon {

	@Override
	public double getArea() {
		return height * width / 2.0;
	}
	
	@Override
	public String getName() {
		return "�ﰢ��";
	}
	
	@Override
	public void printArea() {
		System.out.println(String.format("%s ���� : %.2f  �غ� : %.2f  ���� : %.2f", getName(), height, width, getArea()));
	}
}
