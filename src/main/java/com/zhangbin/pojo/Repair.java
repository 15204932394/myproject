package com.zhangbin.pojo;

public class Repair {
	private int id;
	private String timees;
	private String ss_name;
	private String name;
	private String situation;
	private String contents;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTimees() {
		return timees;
	}
	public void setTimees(String timees) {
		this.timees = timees;
	}
	public String getSs_name() {
		return ss_name;
	}
	public void setSs_name(String ss_name) {
		this.ss_name = ss_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	@Override
	public String toString() {
		return "Repair [id=" + id + ", timees=" + timees + ", ss_name=" + ss_name + ", name=" + name + ", situation="
				+ situation + ", contents=" + contents + "]";
	}
}
