package com.jiaju.entity;

public class Yanse {
private  int yanseId;
private String yanse;
@Override
public String toString() {
	return "yanse [yanseId=" + yanseId + ", yanse=" + yanse + "]";
}
public Yanse() {
	super();
}
public Yanse(int yanseId, String yanse) {
	super();
	this.yanseId = yanseId;
	this.yanse = yanse;
}
public int getYanseId() {
	return yanseId;
}
public void setYanseId(int yanseId) {
	this.yanseId = yanseId;
}
public String getYanse() {
	return yanse;
}
public void setYanse(String yanse) {
	this.yanse = yanse;
}
}
