package com.zhangbin.pojo;

public class Classes {
	private int id;
	private String name;
	private String bj_number;
	private String lists;
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
	public String getBj_number() {
		return bj_number;
	}
	public void setBj_number(String bj_number) {
		this.bj_number = bj_number;
	}
	public String getLists() {
		return lists;
	}
	public void setLists(String lists) {
		this.lists = lists;
	}
	@Override
	public String toString() {
		return "Classes [id=" + id + ", name=" + name + ", bj_number=" + bj_number + ", lists=" + lists + "]";
	}
}
