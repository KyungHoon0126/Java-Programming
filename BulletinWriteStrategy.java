package kr.hs.dgsw.c1.bbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BulletinWriteStrategy implements DatabaseStrategy
{
	private Writing writing;
	
	public BulletinWriteStrategy(Writing writing) 
	{
		this.writing = writing;
	}
	
	@Override
	public PreparedStatement makePreparedStatement(Connection con) throws SQLException 
	{
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO bulletin");
		sql.append(" (id, title, content, writer) ");
		sql.append("VALUES ");
		sql.append("(?, ?, ?, ?) ");
		
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		pstmt.setInt(1,  writing.getSequence());
		pstmt.setString(2, writing.getTitle());
		pstmt.setString(3, writing.getContent());
		pstmt.setString(4, writing.getWriter());
		
		return pstmt;
	}
	
}
