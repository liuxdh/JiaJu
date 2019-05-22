package com.jiaju.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jiaju.dao.ChanPinFenLeiDao;
import com.jiaju.entity.ChanPinFenLei;
import com.jiaju.util.DBManager;

public class ChanPingFenLeiDaoImpl implements ChanPinFenLeiDao {

	@Override
	public List<ChanPinFenLei> getChanPinFenLei() {
		List<ChanPinFenLei> list=new ArrayList<ChanPinFenLei>();
		Connection conn=DBManager.getConnection();
		Statement st=null;
		ResultSet rs=null;
		try {
			st=conn.createStatement();
			rs=st.executeQuery("SELECT * FROM chanpinfenlei");
			while(rs.next()){
				int id=rs.getInt(1);
				String leibie=rs.getString(2);
				String src=rs.getString(3);
				String srcs=rs.getString(4);
				ChanPinFenLei c=new ChanPinFenLei(id, leibie, src, srcs);
				list.add(c);
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
