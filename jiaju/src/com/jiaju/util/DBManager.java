package com.jiaju.util;

import java.sql.*;
public class DBManager {
	private static final String driverName="com.mysql.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/jiaju";
	private static final String user="root",pwd="admin";
	public static Connection getConnection(){
		try {
			Class.forName(driverName);
			return DriverManager.getConnection(url, user, pwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return null;
	}
	public static int executeUpdate(String sql){
		Connection conn=null;
		Statement sta=null;
		try {
			conn = getConnection();
			sta = conn.createStatement();
			return sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.getErrorCode()*(-1);
		}
		finally{
			closeAll(conn,sta,null);
		}
	}
	public static void closeAll(Connection conn,Statement sta,ResultSet set){
		try {	
             if(set !=null)               set.close();		
            if(sta!=null)
			  sta.close();
			if(conn!=null)
			  conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
