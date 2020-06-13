package kr.hs.dgsw.c1.bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NaverDbConnectionManager extends DbConnectionManager
{
	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException 
	{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mariadb://db.naver.com/jdbc", "naver", "naver1234");
		return con;
	}

}
