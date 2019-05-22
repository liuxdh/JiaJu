package com.jiaju.entity;

public class LiuYanBiao {
	private int liuyanbiaoId;
	private String liuyanbiaoxingming;
	private int liuyanbiaodianhua;
	private String liuyanbiaoemail;
	private String liuyanbiaoneirong;
	public int getLiuyanbiaoId() {
		return liuyanbiaoId;
	}
	public void setLiuyanbiaoId(int liuyanbiaoId) {
		this.liuyanbiaoId = liuyanbiaoId;
	}
	public String getLiuyanbiaoxingming() {
		return liuyanbiaoxingming;
	}
	public void setLiuyanbiaoxingming(String liuyanbiaoxingming) {
		this.liuyanbiaoxingming = liuyanbiaoxingming;
	}
	public int getLiuyanbiaodianhua() {
		return liuyanbiaodianhua;
	}
	public void setLiuyanbiaodianhua(int liuyanbiaodianhua) {
		this.liuyanbiaodianhua = liuyanbiaodianhua;
	}
	public String getLiuyanbiaoemail() {
		return liuyanbiaoemail;
	}
	public void setLiuyanbiaoemail(String liuyanbiaoemail) {
		this.liuyanbiaoemail = liuyanbiaoemail;
	}
	public String getLiuyanbiaoneirong() {
		return liuyanbiaoneirong;
	}
	public void setLiuyanbiaoneirong(String liuyanbiaoneirong) {
		this.liuyanbiaoneirong = liuyanbiaoneirong;
	}
	public LiuYanBiao(int liuyanbiaoId, String liuyanbiaoxingming,
			int liuyanbiaodianhua, String liuyanbiaoemail,
			String liuyanbiaoneirong) {
		super();
		this.liuyanbiaoId = liuyanbiaoId;
		this.liuyanbiaoxingming = liuyanbiaoxingming;
		this.liuyanbiaodianhua = liuyanbiaodianhua;
		this.liuyanbiaoemail = liuyanbiaoemail;
		this.liuyanbiaoneirong = liuyanbiaoneirong;
	}
	public LiuYanBiao() {
		super();
	}
	@Override
	public String toString() {
		return "LiuYanBiao [liuyanbiaoId=" + liuyanbiaoId
				+ ", liuyanbiaoxingming=" + liuyanbiaoxingming
				+ ", liuyanbiaodianhua=" + liuyanbiaodianhua
				+ ", liuyanbiaoemail=" + liuyanbiaoemail
				+ ", liuyanbiaoneirong=" + liuyanbiaoneirong + "]";
	}
	
}
