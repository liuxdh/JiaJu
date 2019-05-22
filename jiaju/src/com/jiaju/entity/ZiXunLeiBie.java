package com.jiaju.entity;

public class ZiXunLeiBie {
private int zixunleibieid;
private String zixunleibiemingcheng;
public int getZixunleibieid() {
	return zixunleibieid;
}
public void setZixunleibieid(int zixunleibieid) {
	this.zixunleibieid = zixunleibieid;
}
public String getZixunleibiemingcheng() {
	return zixunleibiemingcheng;
}
public void setZixunleibiemingcheng(String zixunleibiemingcheng) {
	this.zixunleibiemingcheng = zixunleibiemingcheng;
}
public ZiXunLeiBie(int zixunleibieid, String zixunleibiemingcheng) {
	super();
	this.zixunleibieid = zixunleibieid;
	this.zixunleibiemingcheng = zixunleibiemingcheng;
}
public ZiXunLeiBie() {
	super();
}
@Override
public String toString() {
	return "zixunleibie [zixunleibieid=" + zixunleibieid
			+ ", zixunleibiemingcheng=" + zixunleibiemingcheng + "]";
}

}
