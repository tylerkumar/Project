package com.example.project.Project.entity;

public class Projects {
private int projectId;
private String name;
public Projects() {
	super();
	
}
public Projects(int projectId, String name, String address) {
	super();
	this.projectId = projectId;
	this.name = name;
	this.address = address;
}
private String address;
public int getProjectId() {
	return projectId;
}
public void setProjectId(int projectId) {
	this.projectId = projectId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
