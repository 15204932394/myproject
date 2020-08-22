package com.zhangbin.pojo;

public class Health {
	private int id;
	private String ss_name;
	private String timees;
	private String xs_name;
	private String grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSs_name() {
		return ss_name;
	}
	public void setSs_name(String ss_name) {
		this.ss_name = ss_name;
	}
	public String getTimees() {
		return timees;
	}
	public void setTimees(String timees) {
		this.timees = timees;
	}
	public String getXs_name() {
		return xs_name;
	}
	public void setXs_name(String xs_name) {
		this.xs_name = xs_name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Health [id=" + id + ", ss_name=" + ss_name + ", timees=" + timees + ", xs_name=" + xs_name + ", grade="
				+ grade + "]";
	}
}
