package com.jiaju.entity;

import java.util.Date;

public class ZiXunXinXi {
private int zixunxinxiid;
private String zixunxinxibiaoti;
private String zixunxinxineirong;
private Date zixunxinxirqi;
private int zixunleibieid;
public int getZixunxinxiid() {
	return zixunxinxiid;
}
public void setZixunxinxiid(int zixunxinxiid) {
	this.zixunxinxiid = zixunxinxiid;
}
public String getZixunxinxibiaoti() {
	return zixunxinxibiaoti;
}
public void setZixunxinxibiaoti(String zixunxinxibiaoti) {
	this.zixunxinxibiaoti = zixunxinxibiaoti;
}
public String getZixunxinxineirong() {
	return zixunxinxineirong;
}
public void setZixunxinxineirong(String zixunxinxineirong) {
	this.zixunxinxineirong = zixunxinxineirong;
}
public Date getZixunxinxirqi() {
	return zixunxinxirqi;
}
public void setZixunxinxirqi(Date zixunxinxirqi) {
	this.zixunxinxirqi = zixunxinxirqi;
}
public int getZixunleibieid() {
	return zixunleibieid;
}
public void setZixunleibieid(int zixunleibieid) {
	this.zixunleibieid = zixunleibieid;
}
public ZiXunXinXi(int zixunxinxiid, String zixunxinxibiaoti,
		String zixunxinxineirong, Date zixunxinxirqi, int zixunleibieid) {
	super();
	this.zixunxinxiid = zixunxinxiid;
	this.zixunxinxibiaoti = zixunxinxibiaoti;
	this.zixunxinxineirong = zixunxinxineirong;
	this.zixunxinxirqi = zixunxinxirqi;
	this.zixunleibieid = zixunleibieid;
}
public ZiXunXinXi() {
	super();
}
@Override
public String toString() {
	return "ZiXunXinXi [zixunxinxiid=" + zixunxinxiid + ", zixunxinxibiaoti="
			+ zixunxinxibiaoti + ", zixunxinxineirong=" + zixunxinxineirong
			+ ", zixunxinxirqi=" + zixunxinxirqi + ", zixunleibieid="
			+ zixunleibieid + "]";
}

}
