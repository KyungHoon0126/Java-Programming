package kr.hs.dgsw.c1.bbs;

import java.util.List;

public interface Bulletin {

	// 글을 쓰기
	public void write(Writing writing);
	
	// 글 읽기
	public Writing read(int sequence);
	
	// 글 목록
	public List<Writing> list();
}
