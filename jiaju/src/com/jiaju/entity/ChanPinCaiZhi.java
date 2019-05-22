package com.jiaju.entity;

public class ChanPinCaiZhi {
	private int caizhiId;
	private String caizhi;
	public int getCaizhiId() {
		return caizhiId;
	}
	public void setCaizhiId(int caizhiId) {
		this.caizhiId = caizhiId;
	}
	public String getCaizhi() {
		return caizhi;
	}
	public void setCaizhi(String caizhi) {
		this.caizhi = caizhi;
	}
	public ChanPinCaiZhi(int caizhiId, String caizhi) {
		super();
		this.caizhiId = caizhiId;
		this.caizhi = caizhi;
	}
	public ChanPinCaiZhi() {
		super();
	}
	@Override
	public String toString() {
		return "ChanPinCaiZhi [caizhiId=" + caizhiId + ", caizhi=" + caizhi
				+ "]";
	}
	
}
