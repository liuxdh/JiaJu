package com.jiaju.entity;

public class FengGe {
	private int fenggeId;
	private String fengge;
	public int getFenggeId() {
		return fenggeId;
	}
	public void setFenggeId(int fenggeId) {
		this.fenggeId = fenggeId;
	}
	public String getFengge() {
		return fengge;
	}
	public void setFengge(String fengge) {
		this.fengge = fengge;
	}
	public FengGe(int fenggeId, String fengge) {
		super();
		this.fenggeId = fenggeId;
		this.fengge = fengge;
	}
	public FengGe() {
		super();
	}
	@Override
	public String toString() {
		return "FengGe [fenggeId=" + fenggeId + ", fengge=" + fengge + "]";
	}
	
}
