package com.jiaju.entity;

public class ChanPinXinXi {
	private int chanpinId;
	private String chanpinmingcheng;
	private int chanpincaizhi;
	private String chanpinshoujia;
	private String shichangjia;
	private int pinpai;
	private boolean shifouzuzhuang;
	private boolean shifoudingzhi;
	private String xinghao;
	private int yanse;
	private int shejuyuansu;
	private int fengge;
	private int kuanshi;
	private int fenleiId;
	public int getChanpinId() {
		return chanpinId;
	}
	public void setChanpinId(int chanpinId) {
		this.chanpinId = chanpinId;
	}
	public String getChanpinmingcheng() {
		return chanpinmingcheng;
	}
	public void setChanpinmingcheng(String chanpinmingcheng) {
		this.chanpinmingcheng = chanpinmingcheng;
	}
	public int getChanpincaizhi() {
		return chanpincaizhi;
	}
	public void setChanpincaizhi(int chanpincaizhi) {
		this.chanpincaizhi = chanpincaizhi;
	}
	public String getChanpinshoujia() {
		return chanpinshoujia;
	}
	public void setChanpinshoujia(String chanpinshoujia) {
		this.chanpinshoujia = chanpinshoujia;
	}
	public String getShichangjia() {
		return shichangjia;
	}
	public void setShichangjia(String shichangjia) {
		this.shichangjia = shichangjia;
	}
	public int getPinpai() {
		return pinpai;
	}
	public void setPinpai(int pinpai) {
		this.pinpai = pinpai;
	}
	public boolean isShifouzuzhuang() {
		return shifouzuzhuang;
	}
	public void setShifouzuzhuang(boolean shifouzuzhuang) {
		this.shifouzuzhuang = shifouzuzhuang;
	}
	public boolean isShifoudingzhi() {
		return shifoudingzhi;
	}
	public void setShifoudingzhi(boolean shifoudingzhi) {
		this.shifoudingzhi = shifoudingzhi;
	}
	public String getXinghao() {
		return xinghao;
	}
	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}
	public int getYanse() {
		return yanse;
	}
	public void setYanse(int yanse) {
		this.yanse = yanse;
	}
	public int getShejuyuansu() {
		return shejuyuansu;
	}
	public void setShejuyuansu(int shejuyuansu) {
		this.shejuyuansu = shejuyuansu;
	}
	public int getFengge() {
		return fengge;
	}
	public void setFengge(int fengge) {
		this.fengge = fengge;
	}
	public int getKuanshi() {
		return kuanshi;
	}
	public void setKuanshi(int kuanshi) {
		this.kuanshi = kuanshi;
	}
	public int getFenleiId() {
		return fenleiId;
	}
	public void setFenleiId(int fenleiId) {
		this.fenleiId = fenleiId;
	}
	public ChanPinXinXi(int chanpinId, String chanpinmingcheng,
			int chanpincaizhi, String chanpinshoujia, String shichangjia,
			int pinpai, boolean shifouzuzhuang, boolean shifoudingzhi,
			String xinghao, int yanse, int shejuyuansu, int fengge,
			int kuanshi, int fenleiId) {
		super();
		this.chanpinId = chanpinId;
		this.chanpinmingcheng = chanpinmingcheng;
		this.chanpincaizhi = chanpincaizhi;
		this.chanpinshoujia = chanpinshoujia;
		this.shichangjia = shichangjia;
		this.pinpai = pinpai;
		this.shifouzuzhuang = shifouzuzhuang;
		this.shifoudingzhi = shifoudingzhi;
		this.xinghao = xinghao;
		this.yanse = yanse;
		this.shejuyuansu = shejuyuansu;
		this.fengge = fengge;
		this.kuanshi = kuanshi;
		this.fenleiId = fenleiId;
	}
	public ChanPinXinXi() {
		super();
	}
	@Override
	public String toString() {
		return "ChanPinXinXi [chanpinId=" + chanpinId + ", chanpinmingcheng="
				+ chanpinmingcheng + ", chanpincaizhi=" + chanpincaizhi
				+ ", chanpinshoujia=" + chanpinshoujia + ", shichangjia="
				+ shichangjia + ", pinpai=" + pinpai + ", shifouzuzhuang="
				+ shifouzuzhuang + ", shifoudingzhi=" + shifoudingzhi
				+ ", xinghao=" + xinghao + ", yanse=" + yanse
				+ ", shejuyuansu=" + shejuyuansu + ", fengge=" + fengge
				+ ", kuanshi=" + kuanshi + ", fenleiId=" + fenleiId + "]";
	}
	
}
