package com.jiaju.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jiaju.dao.HeadDao;
import com.jiaju.entity.Img;
import com.jiaju.util.DBManager;


public class HeadDaoImpl implements HeadDao{

	@Override
	public List<Img> getImg() {
		// TODO Auto-generated method stub
		Connection con = DBManager.getConnection();
		Statement st = null;
		ResultSet  re = null;
		try {
			st = con.createStatement();
			re = st.executeQuery("select * from img");
			List<Img> img = new ArrayList<Img>();
			while(re.next()){
				int gid = re.getInt(1);
				String gimgurl = re.getString(2);
				Img i=new Img(gid, gimgurl);
				img.add(i);	
			}
			return img;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBManager.closeAll(con, st, re);
		}
		return null;
	}
	
	
}
