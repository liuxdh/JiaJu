package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.HeadDao;
import com.jiaju.daoimpl.HeadDaoImpl;
import com.jiaju.entity.Img;

public class HeaderServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HeadDao headdao=new HeadDaoImpl();
		List<Img> imgs=headdao.getImg();
		request.setAttribute("imgs", imgs);
		request.getRequestDispatcher("header.jsp").include(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
