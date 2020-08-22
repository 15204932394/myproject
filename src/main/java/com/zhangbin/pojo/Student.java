package com.zhangbin.pojo;

public class Student {
	private int id;
	private String xs_number;
	private String name;
	private String age;
	private String sex;
	private String phone;
	private String rx_date;
	private String college;
	private String speciality;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getXs_number() {
		return xs_number;
	}
	public void setXs_number(String xs_number) {
		this.xs_number = xs_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRx_date() {
		return rx_date;
	}
	public void setRx_date(String rx_date) {
		this.rx_date = rx_date;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", xs_number=" + xs_number + ", name=" + name + ", age=" + age + ", sex=" + sex
				+ ", phone=" + phone + ", rx_date=" + rx_date + ", college=" + college + ", speciality=" + speciality
				+ "]";
	}
}
