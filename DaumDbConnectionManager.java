package kr.hs.dgsw.c1.bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaumDbConnectionManager extends DbConnectionManager
{
	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException 
	{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:oracle://db.daum.net/jdbc", "hellor", "world");
		return con;
	}

}
