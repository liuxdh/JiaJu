package com.jiaju.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jiaju.dao.ZiXunLeiBieDao;
import com.jiaju.entity.ZiXunLeiBie;
import com.jiaju.util.DBManager;

public class ZiXunLeiBieDaoImpl implements ZiXunLeiBieDao {

	@Override
	public List<ZiXunLeiBie> getZiXunLeiBie() {
		List<ZiXunLeiBie> list=new ArrayList<ZiXunLeiBie>();
		Connection conn=DBManager.getConnection();
		Statement st=null;
		ResultSet rs=null;
		try {
			st=conn.createStatement();
			rs=st.executeQuery("SELECT * FROM zixunleibie");
			while(rs.next()){
				int id=rs.getInt(1);
				String leibie=rs.getString(2);
				ZiXunLeiBie z=new ZiXunLeiBie(id, leibie);
				list.add(z);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBManager.closeAll(conn, st, rs);
		}
		
		return null;
	}

}
