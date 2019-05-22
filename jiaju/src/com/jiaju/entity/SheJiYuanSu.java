package com.jiaju.entity;

public class SheJiYuanSu {
private int yuansuId;
private String yuansu;
public int getYuansuId() {
	return yuansuId;
}
public void setYuansuId(int yuansuId) {
	this.yuansuId = yuansuId;
}
public String getYuansu() {
	return yuansu;
}
public void setYuansu(String yuansu) {
	this.yuansu = yuansu;
}
@Override
public String toString() {
	return "shejiyuansu [yuansuId=" + yuansuId + ", yuansu=" + yuansu + "]";
}
public SheJiYuanSu() {
	super();
}
public SheJiYuanSu(int yuansuId, String yuansu) {
	super();
	this.yuansuId = yuansuId;
	this.yuansu = yuansu;
}
}
