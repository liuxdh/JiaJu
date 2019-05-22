package com.jiaju.entity;

import java.util.Date;

public class QiYeXinXi {
private String qiyezhucehao;
private String chenglishijian;
private String shichangleixing;
private String faren;
private String zhuceziben;
private String wangzhi;
private String dizhi;
private String qiyedianhua;
private String qiyewenhua;
private String qiyejieshao;
private String email;
public String getQiyezhucehao() {
	return qiyezhucehao;
}
public void setQiyezhucehao(String qiyezhucehao) {
	this.qiyezhucehao = qiyezhucehao;
}
public String getChenglishijian() {
	return chenglishijian;
}
public void setChenglishijian(String chenglishijian) {
	this.chenglishijian = chenglishijian;
}
public String getShichangleixing() {
	return shichangleixing;
}
public void setShichangleixing(String shichangleixing) {
	this.shichangleixing = shichangleixing;
}
public String getFaren() {
	return faren;
}
public void setFaren(String faren) {
	this.faren = faren;
}
public String getZhuceziben() {
	return zhuceziben;
}
public void setZhuceziben(String zhuceziben) {
	this.zhuceziben = zhuceziben;
}
public String getWangzhi() {
	return wangzhi;
}
public void setWangzhi(String wangzhi) {
	this.wangzhi = wangzhi;
}
public String getDizhi() {
	return dizhi;
}
public void setDizhi(String dizhi) {
	this.dizhi = dizhi;
}
public String getQiyedianhua() {
	return qiyedianhua;
}
public void setQiyedianhua(String qiyedianhua) {
	this.qiyedianhua = qiyedianhua;
}
public String getQiyewenhua() {
	return qiyewenhua;
}
public void setQiyewenhua(String qiyewenhua) {
	this.qiyewenhua = qiyewenhua;
}
public String getQiyejieshao() {
	return qiyejieshao;
}
public void setQiyejieshao(String qiyejieshao) {
	this.qiyejieshao = qiyejieshao;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public QiYeXinXi(String qiyezhucehao, String chenglishijian,
		String shichangleixing, String faren, String zhuceziben,
		String wangzhi, String dizhi, String qiyedianhua, String qiyewenhua,
		String qiyejieshao, String email) {
	super();
	this.qiyezhucehao = qiyezhucehao;
	this.chenglishijian = chenglishijian;
	this.shichangleixing = shichangleixing;
	this.faren = faren;
	this.zhuceziben = zhuceziben;
	this.wangzhi = wangzhi;
	this.dizhi = dizhi;
	this.qiyedianhua = qiyedianhua;
	this.qiyewenhua = qiyewenhua;
	this.qiyejieshao = qiyejieshao;
	this.email = email;
}
public QiYeXinXi() {
	super();
}
@Override
public String toString() {
	return "QiYeXinXi [qiyezhucehao=" + qiyezhucehao + ", chenglishijian="
			+ chenglishijian + ", shichangleixing=" + shichangleixing
			+ ", faren=" + faren + ", zhuceziben=" + zhuceziben + ", wangzhi="
			+ wangzhi + ", dizhi=" + dizhi + ", qiyedianhua=" + qiyedianhua
			+ ", qiyewenhua=" + qiyewenhua + ", qiyejieshao=" + qiyejieshao
			+ ", email=" + email + "]";
}

}
