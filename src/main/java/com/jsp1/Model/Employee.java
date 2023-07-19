package com.jsp1.Model;

import org.springframework.stereotype.Component;

//entity Class or Model Class
//we must use @component
@Component
public class Employee 
{
	private int eid;
    private String ename;
    private int esalary;
    private String email;
    private int emobileno;
    private String password;
    private int edeptno;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEsalary() {
	return esalary;
}
public void setEsalary(int esalary) {
	this.esalary = esalary;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getEmobileno() {
	return emobileno;
}
public void setEmobileno(int emobileno) {
	this.emobileno = emobileno;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getEdeptno() {
	return edeptno;
}
public void setEdeptno(int edeptno) {
	this.edeptno = edeptno;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", email=" + email + ", emobileno="
			+ emobileno + ", password=" + password + ", edeptno=" + edeptno + "]";
}
  
  
  
}
