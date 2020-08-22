package com.zhangbin.pojo;

public class Dormitory {
	private int id;
	private String name;
	private String sex;
	private String yd_number;
	private String sd_number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getYd_number() {
		return yd_number;
	}
	public void setYd_number(String yd_number) {
		this.yd_number = yd_number;
	}
	public String getSd_number() {
		return sd_number;
	}
	public void setSd_number(String sd_number) {
		this.sd_number = sd_number;
	}
	@Override
	public String toString() {
		return "Dormitory [id=" + id + ", name=" + name + ", sex=" + sex + ", yd_number=" + yd_number + ", sd_number="
				+ sd_number + "]";
	}
}
