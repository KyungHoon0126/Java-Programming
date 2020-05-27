package kr.hs.dgsw.c1.bbs;

import java.util.ArrayList;
import java.util.List;

public class SimplestBulletin implements Bulletin {

	private List<Writing>writings = new ArrayList<Writing>();

	private int pool = 0;
	
	@Override
	public void write(Writing writing) {
		pool++;
		writing.setSequence(pool);
		writings.add(writing);
	}

	@Override
	public Writing read(int sequence) {
		
		for(Writing item : writings)
		{
			if(item.getSequence() == sequence)
			{
				return item;
			}
		}
		
		return null;
	}

	@Override
	public List<Writing> list() {
		return writings;
	}
	
}
