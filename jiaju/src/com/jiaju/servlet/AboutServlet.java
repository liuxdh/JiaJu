package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.ShejiShiDao;
import com.jiaju.daoimpl.ShejishiDaoImpl;
import com.jiaju.entity.SheJiShiXinXiBiao;

public class AboutServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ShejiShiDao shejishidao=new ShejishiDaoImpl();
		List<SheJiShiXinXiBiao> designer=shejishidao.getShejishi();
		request.setAttribute("s",designer );//存设计师信息
		request.getRequestDispatcher("about.jsp").forward(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
