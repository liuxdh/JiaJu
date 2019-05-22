package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.ChanPinFenLeiDao;
import com.jiaju.dao.CompanyDao;
import com.jiaju.daoimpl.ChanPingFenLeiDaoImpl;
import com.jiaju.daoimpl.CompanyDaoImpl;
import com.jiaju.entity.ChanPinFenLei;
import com.jiaju.entity.QiYeXinXi;

public class HomeServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CompanyDao com = new CompanyDaoImpl();
		QiYeXinXi qyxx=com.getQiyexinxi();
		request.setAttribute("q", qyxx);
		ChanPinFenLeiDao cpfldao=new ChanPingFenLeiDaoImpl();
		List<ChanPinFenLei> c=cpfldao.getChanPinFenLei();
		request.setAttribute("c", c);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
