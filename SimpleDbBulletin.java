package kr.hs.dgsw.c1.bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

// DB를 이용한 게시판 만들기
public class SimpleDbBulletin implements Bulletin 
{	
	/**
	 * 공통적으로 사용되는 메서드
	 */
	protected void executeUpdate(DatabaseStrategy strategy)	
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try 
		{
			con = getConnection();
			
			pstmt = strategy.makePreparedStatement(con);
			
			// INSERT, DELETE, UPDATE를 사용할 때에는 executeUpdate() 사용
			pstmt.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				pstmt.close();
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			try 
			{
				con.close();
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 게시글 작성
	 */
	@Override
	public void write(Writing writing) 
	{
		writing.setSequence(readNewId());
		
		// 익명 클래스 
		DatabaseStrategy strategy = new DatabaseStrategy() 
		{	
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
		};
		
		executeUpdate(strategy);
	}

	/**
	 * 게시글 업데이트
	 */
	public void update(Writing writing)
	{
		DatabaseStrategy strategy = new BulletinUpdateStrategy(writing);
	}
	
	/**
	 * 특정 게시글 조회
	 */
	@Override
	public Writing read(int sequence) 
	{	
		Writing writing = null;
		
		try 
		{
			Connection con = getConnection();
			
			// SELECT id, title, content, writer FROM bulletin WHERE id = 
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ");
			sql.append(" title, ");
			sql.append(" content, ");
			sql.append(" writer ");
			sql.append(" FROM bulletin ");
			sql.append(" WHERE id = ? ");
			
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, sequence);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				 int id = rs.getInt("id");
				 String title = rs.getString("title");
			     String content = rs.getString("content");
			     String writer = rs.getString("writer");
			     
			     writing = new Writing();
			     writing.setSequence(id);
			     writing.setTitle(title);
			     writing.setContent(content);
			     writing.setWriter(writer);
			     
			     System.out.println("Id :" + id + " " +  "Title :" + title + " " + "Content :" + content + " " + "Writer : " + writer);
			}
			
			rs.close();
			pstmt.close();
			con.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return writing;
	}

	/**
	 * 전체 게시글 조회
	 */
	@Override
	public List<Writing> list() 
	{
		List<Writing> list = new ArrayList<Writing>();
		
		try 
		{
			Connection con = getConnection();
			
			// SELECT id, title, content, writer FROM bulletin ORDER BY id DESC;
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ");
			sql.append(" id, ");
			sql.append(" title, ");
			sql.append(" content, ");
			sql.append(" writer ");
			sql.append(" FROM bulletin ");
			sql.append(" ORDER BY id DESC ");
			
			// DB에 일을 시키기 위한 PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			
			// 명령 수행
			ResultSet rs = pstmt.executeQuery();
			
			// DB로부터 값 가져오기
			while(rs.next())
			{
				int id = rs.getInt("id");
			    String title = rs.getString("title");
			    String content = rs.getString("content");
			    String writer = rs.getString("writer");
			    
			    Writing writing = new Writing();
			    writing.setSequence(rs.getInt("id"));
			    writing.setTitle(title);
			    writing.setContent(content);
			    writing.setWriter(writer);
			    
			    list.add(writing);
			    
			    System.out.println("Id :" + id + " " +  "Title :" + title + " " + "Content :" + content + " " + "Writer : " + writer);
			}
			
			rs.close();
			pstmt.close();
			con.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return list;
	}
	

	public int readNewId()
	{	
		int newId = 0;
		
		try 
		{
			Connection con = getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ");
			
			// AS : 별명 사용
			sql.append(" MAX(id) AS newId ");
			sql.append(" FROM bulletin ");
			
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				 newId = rs.getInt("newId");
			}
			
			rs.close();
			pstmt.close();
			con.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return newId + 1;
	}
	
	protected Connection getConnection() throws ClassNotFoundException, SQLException
	{
		DbConnectionManager manager = new NaverDbConnectionManager();
		return manager.getConnection();
	}
	
	public static void main(String[] args) 
	{
		try
		{
			Bulletin bulletin = new SimpleDbBulletin();
			
			// 전체 게시글 조회 
			bulletin.list();
			
			// 특정 게시글 조회
			// bulletin.read(1);
			
			// Writing writing = new Writing();
			// writing.setSequence(2);
			// writing.setTitle("자바 프로그래밍 실무");
			// writing.setContent(" JDBC 학습 ");
			// writing.setWriter("김경훈");
			
			// writing.setSequence(3);
			// writing.setTitle("진우의 롤 강의");
			// writing.setContent(" 진우의 롤 ");
			// writing.setWriter("최진우");
			
			// 게시글 작성
			// bulletin.write(writing);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
