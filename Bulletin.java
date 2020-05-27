package kr.hs.dgsw.c1.bbs;

import java.util.List;

public interface Bulletin {

	// ���� ����
	public void write(Writing writing);
	
	// �� �б�
	public Writing read(int sequence);
	
	// �� ���
	public List<Writing> list();
	
}
