package com.jiaju.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaju.dao.CompanyDao;
import com.jiaju.daoimpl.CompanyDaoImpl;
import com.jiaju.entity.QiYeXinXi;
import com.sun.mail.imap.AppendUID;

public class FooterServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext app=this.getServletContext();
		if (app.getAttribute("company")==null) {
			CompanyDao com = new CompanyDaoImpl();
			QiYeXinXi qyxx=com.getQiyexinxi();
			app.setAttribute("company", qyxx);
		}
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
