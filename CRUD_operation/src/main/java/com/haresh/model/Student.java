package com.haresh.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Student {

	private int student_no;
	private String student_name;
	private Date student_dob;
	private Date student_doj;

	public Student(int student_no, String student_name, Date student_dob, Date student_doj) {
		super();
		this.student_no = student_no;
		this.student_name = student_name;
		this.student_dob = student_dob;
		this.student_doj = student_doj;
	}

	public Student() {
		super();
	}

	public int getStudent_no() {
		return student_no;
	}

	public void setStudent_no(int student_no) {
		this.student_no = student_no;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public Date getStudent_dob() {
		return student_dob;
	}

	public void setStudent_dob(Date student_dob) {
		this.student_dob = student_dob;
	}

	public Date getStudent_doj() {
		return student_doj;
	}

	public void setStudent_doj(Date student_doj) {
		this.student_doj = student_doj;
	}

}
