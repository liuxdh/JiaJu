package com.jiaju.entity;

public class Img {
	private int gid;
	private String gimgurl;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGimgurl() {
		return gimgurl;
	}
	public void setGimgurl(String gimgurl) {
		this.gimgurl = gimgurl;
	}
	public Img(int gid, String gimgurl) {
		super();
		this.gid = gid;
		this.gimgurl = gimgurl;
	}
	public Img() {
		super();
	}
	@Override
	public String toString() {
		return "Img [gid=" + gid + ", gimgurl=" + gimgurl + "]";
	}
	
	
	
}
