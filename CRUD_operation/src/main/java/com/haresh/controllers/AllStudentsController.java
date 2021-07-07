package com.haresh.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haresh.dao.StudentDao;
import com.haresh.helper.ConnectionProvider;
import com.haresh.model.Student;

/**
 * Servlet implementation class AllStudentsController
 */
public class AllStudentsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AllStudentsController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		StudentDao dao = new StudentDao(ConnectionProvider.getConnection());
		ResultSet rs = dao.allStudents();

		String stuData = "some text";

		try {
			while (rs.next()) {

				stuData = " Student No  :   " + rs.getInt(1) + ",   Student Name  :  " + rs.getString(2)
						+ ", Student DOB  :  " + rs.getDate(3) + ", Student DOJ  :  " + rs.getDate(4);
				System.out.println(stuData);
				response.setContentType("text/plain");
				response.setCharacterEncoding("UTF-8");
				response.getWriter().write(stuData);
				out.println("</br>");
				out.println("</br>");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
