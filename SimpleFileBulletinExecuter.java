package kr.hs.dgsw.c1.bbs;

import java.util.List;

public class SimpleFileBulletinExecuter {

	public static void main(String[] args) {
		
		SimpleFileBulletin simpleFileBulletin = new SimpleFileBulletin();
		
		Writing writing = null;
		
		writing = new Writing();
		writing.setSequence(0);
		writing.setTitle("SimpleFileBulletin과제");
		writing.setContent("write&read&list메서드제작하기");
		writing.setWriter("2107김경훈");
		
		simpleFileBulletin.write(writing);
		
		writing = new Writing();
		writing.setSequence(1);
		writing.setTitle("대구소프트웨어고등학교");
		writing.setContent("2학년1반");
		writing.setWriter("2107김경훈");
		
		simpleFileBulletin.write(writing);
		
		List<Writing> list = simpleFileBulletin.list();
		for(Writing item : list)
		{
			System.out.println(item.getSequence() + " " + item.getTitle() + " " + item.getContent() + " " + item.getWriter());
		}
		
		// sequence(일련번호)를 통해 특정 게시글 읽어오기
		Writing second = simpleFileBulletin.read(1);
		System.out.println(second.getSequence() + " " + second.getTitle() + " " + second.getContent() + " " + second.getWriter());
	
	}
}
