package com.springcore;

import java.util.List;

public class Student {
	private int studentId;
	private String studentName;
	private List<String> studentAddress;
	
	public int getStudentId() {
		System.out.println("In Get ID");
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("In Set Id");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(List<String> studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student(int studentId, String studentName, List<String> studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	
	

}
