package com.jiaju.entity;

public class ChanPinFenLei {
	private int fenleiId;
	private String fenleimingcheng;
	private String src;
	private String srcs;
	public int getFenleiId() {
		return fenleiId;
	}
	public void setFenleiId(int fenleiId) {
		this.fenleiId = fenleiId;
	}
	public String getFenleimingcheng() {
		return fenleimingcheng;
	}
	public void setFenleimingcheng(String fenleimingcheng) {
		this.fenleimingcheng = fenleimingcheng;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getSrcs() {
		return srcs;
	}
	public void setSrcs(String srcs) {
		this.srcs = srcs;
	}
	public ChanPinFenLei(int fenleiId, String fenleimingcheng, String src,
			String srcs) {
		super();
		this.fenleiId = fenleiId;
		this.fenleimingcheng = fenleimingcheng;
		this.src = src;
		this.srcs = srcs;
	}
	public ChanPinFenLei() {
		super();
	}
	@Override
	public String toString() {
		return "ChanPinFenLei [fenleiId=" + fenleiId + ", fenleimingcheng="
				+ fenleimingcheng + ", src=" + src + ", srcs=" + srcs + "]";
	}
	
	
}
