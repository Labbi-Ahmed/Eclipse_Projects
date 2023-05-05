package com.springcore;

public class Student {

	private int studentId;
	private String studentName;
	private String stdentAddress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStdentAddress() {
		return stdentAddress;
	}
	public void setStdentAddress(String stdentAddress) {
		this.stdentAddress = stdentAddress;
	}
	public Student(int studentId, String studentName, String stdentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.stdentAddress = stdentAddress;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", stdentAddress=" + stdentAddress
				+ "]";
	}
	
	
	
	
	
}
