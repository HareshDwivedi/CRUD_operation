package com.haresh.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haresh.dao.StudentDao;
import com.haresh.helper.ConnectionProvider;
import com.haresh.model.Student;

/**
 * Servlet implementation class AddStudentController
 */
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddStudentController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		boolean b = false;
		int student_no = Integer.parseInt(request.getParameter("student_no"));
		String student_name = request.getParameter("student_name");
		String studentDOB = request.getParameter("student_dob");
		String studentDOJ = request.getParameter("student_doj");

		System.out.println(student_no);
		Date student_dob = Date.valueOf(studentDOB);// converting string into sql date
		Date student_doj = Date.valueOf(studentDOJ);// converting string into sql date

		Student student = new Student(student_no, student_name, student_dob, student_doj);
		StudentDao dao = new StudentDao(ConnectionProvider.getConnection());
		try {
		b = dao.addStudent(student);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// doGet(request, response);
	}

}
