package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.ZiXunLeiBieDao;
import com.jiaju.daoimpl.ZiXunLeiBieDaoImpl;
import com.jiaju.entity.ZiXunLeiBie;

public class NewsServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ZiXunLeiBieDao zixuleibiedao=new ZiXunLeiBieDaoImpl();
		List<ZiXunLeiBie> z=zixuleibiedao.getZiXunLeiBie();
		ServletContext app=this.getServletContext();
		if(app.getAttribute("z")==null){
			app.setAttribute("z", z);
		}
		
		request.getRequestDispatcher("article_list.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
