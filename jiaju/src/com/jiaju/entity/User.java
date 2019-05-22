package com.jiaju.entity;

public class User {
private int userid;
private String uname;
private String upwd;
private String email;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpwd() {
	return upwd;
}
public void setUpwd(String upwd) {
	this.upwd = upwd;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public User(int userid, String uname, String upwd, String email) {
	super();
	this.userid = userid;
	this.uname = uname;
	this.upwd = upwd;
	this.email = email;
}
public User() {
	super();
}
@Override
public String toString() {
	return "User [userid=" + userid + ", uname=" + uname + ", upwd=" + upwd
			+ ", email=" + email + "]";
}

}
