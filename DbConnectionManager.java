package kr.hs.dgsw.c1.bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DbConnectionManager 
{
	public abstract Connection getConnection() throws ClassNotFoundException, SQLException;
	/*
	{
		Class.forName("org.mariadb.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost/jdbc", "root", "#kkh03kkh#");
		return con;
	} */
}
