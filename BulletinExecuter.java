package kr.hs.dgsw.c1.bbs;

import java.util.List;

public class BulletinExecuter {

	public static void main(String[] args) {
		
		Bulletin bulletin = new SimplestBulletin();
		
		Writing writing = null;
		
		writing = new Writing();
		writing.setTitle("대소고 2학년 자바 프로그래밍 실무");
		writing.setContent("빨리 개학하고 싶다.");
		writing.setWriter("대소고");
		
		bulletin.write(writing);
		
		writing = new Writing();
		writing.setTitle("두번째 글");
		writing.setContent("something....");
		writing.setWriter("someone");
		
		bulletin.write(writing);
		
//		List<Writing> list = bulletin.list();
//		for(Writing item : list)
//		{
//			System.out.println(item.getSequence() + " " + item.getTitle() + " " + item.getWriter());
//		}
		
		// sequence(일련번호)를 통해 특정 게시글 읽어오기
		Writing second = bulletin.read(1);
		System.out.println(second.getSequence() + " " + second.getTitle() + " " + second.getWriter());
		
	}

}
