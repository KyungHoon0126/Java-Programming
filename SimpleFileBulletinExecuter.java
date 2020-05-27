package kr.hs.dgsw.c1.bbs;

import java.util.List;

public class SimpleFileBulletinExecuter {

	public static void main(String[] args) {
		
		SimpleFileBulletin simpleFileBulletin = new SimpleFileBulletin();
		
		Writing writing = null;
		
		writing = new Writing();
		writing.setSequence(0);
		writing.setTitle("SimpleFileBulletin����");
		writing.setContent("write&read&list�޼��������ϱ�");
		writing.setWriter("2107�����");
		
		simpleFileBulletin.write(writing);
		
		writing = new Writing();
		writing.setSequence(1);
		writing.setTitle("�뱸����Ʈ�������б�");
		writing.setContent("2�г�1��");
		writing.setWriter("2107�����");
		
		simpleFileBulletin.write(writing);
		
		List<Writing> list = simpleFileBulletin.list();
		for(Writing item : list)
		{
			System.out.println(item.getSequence() + " " + item.getTitle() + " " + item.getContent() + " " + item.getWriter());
		}
		
		// sequence(�Ϸù�ȣ)�� ���� Ư�� �Խñ� �о����
		Writing second = simpleFileBulletin.read(1);
		System.out.println(second.getSequence() + " " + second.getTitle() + " " + second.getContent() + " " + second.getWriter());
	
	}
}
