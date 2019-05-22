package com.jiaju.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.jiaju.dao.CompanyDao;
import com.jiaju.entity.QiYeXinXi;
import com.jiaju.util.DBManager;

public class CompanyDaoImpl implements CompanyDao{

	@Override
	public QiYeXinXi getQiyexinxi() {
		// TODO Auto-generated method stub
		Connection con = DBManager.getConnection();
		Statement st=null;
		ResultSet re=null;
		try {
			st = con.createStatement();
			re = st.executeQuery("select * from qiyexinxi");
			while(re.next()){
				String qiyezhucehao = re.getString(1);
				String chenglishijian = re.getString(2);
				String shichangleixing = re.getString(3);
				String faren = re.getString(4);
				String zhuceziben = re.getString(5);
				String wangzhi = re.getString(6);
				String dizhi = re.getString(7);
				String qiyedianhua = re.getString(8);
				String qiyewenhua = re.getString(9);
				String qiyejieshao = re.getString(10);
				String email = re.getString(11);
				QiYeXinXi company=new QiYeXinXi(qiyezhucehao, chenglishijian, shichangleixing, faren, zhuceziben, wangzhi, dizhi, qiyedianhua, qiyewenhua, qiyejieshao, email);
				return company;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBManager.closeAll(con, st, re);
		}
		return null;
	}
	
}
