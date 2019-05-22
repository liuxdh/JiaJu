package com.jiaju.entity;

public class SheJiShiXinXiBiao {
	private int shejishiid;
	private String shejishiname;
	private String shejishidengji;
	private String img;
	public int getShejishiid() {
		return shejishiid;
	}
	public void setShejishiid(int shejishiid) {
		this.shejishiid = shejishiid;
	}
	public String getShejishiname() {
		return shejishiname;
	}
	public void setShejishiname(String shejishiname) {
		this.shejishiname = shejishiname;
	}
	public String getShejishidengji() {
		return shejishidengji;
	}
	public void setShejishidengji(String shejishidengji) {
		this.shejishidengji = shejishidengji;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public SheJiShiXinXiBiao(int shejishiid, String shejishiname,
			String shejishidengji, String img) {
		super();
		this.shejishiid = shejishiid;
		this.shejishiname = shejishiname;
		this.shejishidengji = shejishidengji;
		this.img = img;
	}
	public SheJiShiXinXiBiao() {
		super();
	}
	@Override
	public String toString() {
		return "SheJiShiXinXiBiao [shejishiid=" + shejishiid
				+ ", shejishiname=" + shejishiname + ", shejishidengji="
				+ shejishidengji + ", img=" + img + "]";
	}
	
	
}
