package kr.hs.dgsw.c1.bbs;

import java.util.List;

public class BulletinExecuter {

	public static void main(String[] args) {
		
		Bulletin bulletin = new SimplestBulletin();
		
		Writing writing = null;
		
		writing = new Writing();
		writing.setTitle("��Ұ� 2�г� �ڹ� ���α׷��� �ǹ�");
		writing.setContent("���� �����ϰ� �ʹ�.");
		writing.setWriter("��Ұ�");
		
		bulletin.write(writing);
		
		writing = new Writing();
		writing.setTitle("�ι�° ��");
		writing.setContent("something....");
		writing.setWriter("someone");
		
		bulletin.write(writing);
		
//		List<Writing> list = bulletin.list();
//		for(Writing item : list)
//		{
//			System.out.println(item.getSequence() + " " + item.getTitle() + " " + item.getWriter());
//		}
		
		// sequence(�Ϸù�ȣ)�� ���� Ư�� �Խñ� �о����
		Writing second = bulletin.read(1);
		System.out.println(second.getSequence() + " " + second.getTitle() + " " + second.getWriter());
		
	}

}
