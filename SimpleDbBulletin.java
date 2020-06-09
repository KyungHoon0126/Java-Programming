package kr.hs.dgsw.c1.bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

// DB�� �̿��� �Խ��� �����
public class SimpleDbBulletin implements Bulletin 
{	
	/**
	 * ���������� ���Ǵ� �޼���
	 */
	protected void executeUpdate(DatabaseStrategy strategy)	
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try 
		{
			con = getConnection();
			
			pstmt = strategy.makePreparedStatement(con);
			
			// INSERT, DELETE, UPDATE�� ����� ������ executeUpdate() ���
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
	 * �Խñ� �ۼ�
	 */
	@Override
	public void write(Writing writing) 
	{
		writing.setSequence(readNewId());
		
		// �͸� Ŭ���� 
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
	 * �Խñ� ������Ʈ
	 */
	public void update(Writing writing)
	{
		DatabaseStrategy strategy = new BulletinUpdateStrategy(writing);
	}
	
	/**
	 * Ư�� �Խñ� ��ȸ
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
	 * ��ü �Խñ� ��ȸ
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
			
			// DB�� ���� ��Ű�� ���� PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			
			// ��� ����
			ResultSet rs = pstmt.executeQuery();
			
			// DB�κ��� �� ��������
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
			
			// AS : ���� ���
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
			
			// ��ü �Խñ� ��ȸ 
			bulletin.list();
			
			// Ư�� �Խñ� ��ȸ
			// bulletin.read(1);
			
			// Writing writing = new Writing();
			// writing.setSequence(2);
			// writing.setTitle("�ڹ� ���α׷��� �ǹ�");
			// writing.setContent(" JDBC �н� ");
			// writing.setWriter("�����");
			
			// writing.setSequence(3);
			// writing.setTitle("������ �� ����");
			// writing.setContent(" ������ �� ");
			// writing.setWriter("������");
			
			// �Խñ� �ۼ�
			// bulletin.write(writing);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
