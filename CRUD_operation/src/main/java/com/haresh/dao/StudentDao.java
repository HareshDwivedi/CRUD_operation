package com.haresh.dao;

import com.haresh.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {

	private Connection con;

	public StudentDao(Connection con) {
		super();
		this.con = con;
	}

// it will add Student record in student table
	public boolean addStudent(Student stu) throws SQLException {
		boolean b = false;
		String query = "insert into students(student_no, student_name, student_dob, student_doj) values (?,?,?,?)";
		PreparedStatement pstm = this.con.prepareStatement(query);
		pstm.setInt(1, stu.getStudent_no());
		pstm.setString(2, stu.getStudent_name());
		pstm.setDate(3, stu.getStudent_dob());
		pstm.setDate(4, stu.getStudent_doj());
		pstm.executeUpdate();
		b = true;
		return b;
	}

	// when this method is called it will fetch all the student from student table
	public ResultSet allStudents() {
		ResultSet rs = null;
		String query = "select * from students";
		try {
			PreparedStatement pstm = this.con.prepareStatement(query);
			rs = pstm.executeQuery();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return rs;

	}

	// It will return student data
	public Student getStudent(int student_no) throws SQLException {
		Student student = null;
		String query = "select * from students where student_no = ?";
		PreparedStatement pstm = this.con.prepareStatement(query);
		pstm.setInt(1, student_no);
		ResultSet rs = pstm.executeQuery();
		if (rs.next()) {
			student = new Student();
			student.setStudent_no(rs.getInt("student_no"));
			student.setStudent_name(rs.getString("student_name"));
			student.setStudent_dob(rs.getDate("student_dob"));
			student.setStudent_doj(rs.getDate("student_doj"));
		}
		return student;
	}

	// it will update student record
	public boolean updateStudent(Student student) throws SQLException {
		boolean b = false;
		String query = "update students set student_name=?, student_dob=?, student_doj=? where student_no=?";
		PreparedStatement pstm = this.con.prepareStatement(query);
		pstm.setString(1, student.getStudent_name());
		pstm.setDate(2, student.getStudent_dob());
		pstm.setDate(3, student.getStudent_doj());
		pstm.setInt(4, student.getStudent_no());
		pstm.executeUpdate();
		b = true;
		return b;
	}

	// when this method is called it will delete the student record
	public boolean deleteStudent(int student_no) {
		boolean b = false;
		String query = "delete from students where student_no=?";
		try {
			PreparedStatement pstm = this.con.prepareStatement(query);
			pstm.setInt(1, student_no);
			pstm.executeUpdate();
			b = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return b;
	}
}
