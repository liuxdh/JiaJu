package com.jiaju.entity;

public class KuanShiDingWei {
 private int kuanshiId;
 private String kuanshi;
public int getKuanshiId() {
	return kuanshiId;
}
public void setKuanshiId(int kuanshiId) {
	this.kuanshiId = kuanshiId;
}
public String getKuanshi() {
	return kuanshi;
}
public void setKuanshi(String kuanshi) {
	this.kuanshi = kuanshi;
}
public KuanShiDingWei(int kuanshiId, String kuanshi) {
	super();
	this.kuanshiId = kuanshiId;
	this.kuanshi = kuanshi;
}
public KuanShiDingWei() {
	super();
}
@Override
public String toString() {
	return "KuanShiDingWei [kuanshiId=" + kuanshiId + ", kuanshi=" + kuanshi
			+ "]";
}
 
}
