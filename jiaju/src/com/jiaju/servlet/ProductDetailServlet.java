package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.ChanPinFenLeiDao;
import com.jiaju.daoimpl.ChanPingFenLeiDaoImpl;
import com.jiaju.entity.ChanPinFenLei;

public class ProductDetailServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ChanPinFenLeiDao cpfldao=new ChanPingFenLeiDaoImpl();
		List<ChanPinFenLei> c=cpfldao.getChanPinFenLei();
		request.setAttribute("c", c);
		request.getRequestDispatcher("productdetails.jsp").forward(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
