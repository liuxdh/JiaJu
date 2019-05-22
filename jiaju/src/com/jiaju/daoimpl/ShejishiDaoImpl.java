package com.jiaju.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jiaju.dao.ShejiShiDao;
import com.jiaju.entity.SheJiShiXinXiBiao;
import com.jiaju.util.DBManager;

public class ShejishiDaoImpl implements ShejiShiDao {

	@Override
	public List<SheJiShiXinXiBiao> getShejishi() {
		List<SheJiShiXinXiBiao> list=new ArrayList<SheJiShiXinXiBiao>();
		Connection conn=DBManager.getConnection();
		Statement st=null;
		ResultSet rs=null;
		try {
			st=conn.createStatement();
			rs=st.executeQuery("SELECT * from shejishixinxibiao");
			while(rs.next()){
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String jibie=rs.getString(3);
				String img=rs.getString(4);
				SheJiShiXinXiBiao sjs=new SheJiShiXinXiBiao(id, name, jibie, img);
				list.add(sjs);
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
